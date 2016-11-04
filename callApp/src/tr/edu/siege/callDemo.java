package tr.edu.siege;

public class callDemo {
	
	public static void main(String[] args) {
		String queryString = "PREFIX wfn: <java:org.webofcode.atzori.>"
				+ "PREFIX fn: <http://www.w3.org/2005/xpath-functions#> "
				+ " SELECT * "
				+ " { "
				+ " BIND( wfn:call(CONCAT(STR(fn:concat),\"@http://dbpedia.org/sparql\"),\"alpha\",\"BETA\") as ?res ) "
				+ "} ";

		String queryResult = new CallHandler().resolveQuery(queryString);
		System.out.println(queryResult);
	}
}
