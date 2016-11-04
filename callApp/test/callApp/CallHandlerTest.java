package callApp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tr.edu.siege.CallHandler;
import tr.edu.siege.Utils;

public class CallHandlerTest {
@Test
public void callRemoteTest() throws Exception {
	String queryString = "PREFIX wfn: <java:org.webofcode.atzori.>"
			+ "PREFIX fn: <http://www.w3.org/2005/xpath-functions#> "
			+ " SELECT * "
			+ " { "
			+ " BIND( wfn:call(CONCAT(STR(fn:concat),\"@http://dbpedia.org/sparql\"),\"alpha\",\"BETA\") as ?res ) "
			+ "} ";

	String queryResult = new CallHandler().resolveQuery(new Utils().SWIPE_DS_ENDPOINT, queryString);
	assertEquals("alphaBETA", queryResult);
}
}
