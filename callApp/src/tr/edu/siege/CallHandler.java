package tr.edu.siege;

import org.apache.log4j.Logger;

import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.query.Syntax;

public class CallHandler {
	final static Logger LOG = Logger.getLogger(CallHandler.class);
	
	public String resolveQuery(String queryString) {
		String possibleFoundDbpediUri = "";
		Query query = QueryFactory.create(queryString, Syntax.syntaxARQ);
		QueryExecution qe = QueryExecutionFactory.sparqlService(
				new Utils().LOCALHOST_ENDPOINT, query);
		ResultSet results = qe.execSelect();
		if (!results.hasNext()) {
			qe.close();
		} else {
			for (; results.hasNext();) {
				QuerySolution sol = (QuerySolution) results.next();
				if (sol.get("?res").isLiteral()) {
					possibleFoundDbpediUri = sol.get("?res").asLiteral()
							.getString();
					LOG.info(possibleFoundDbpediUri);
				} else if (sol.get("?res").isResource()) {
					possibleFoundDbpediUri = sol.get("?res").asResource()
							.getURI();
					LOG.info(possibleFoundDbpediUri);
				} else {
					LOG.info("blank node!!");
				}
			}
			qe.close();
		}
		return possibleFoundDbpediUri;
}
}
