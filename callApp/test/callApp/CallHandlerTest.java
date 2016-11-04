package callApp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tr.edu.siege.CallHandler;

public class CallHandlerTest {
@Test
public void callRemoteTest() throws Exception {
	String queryString = "PREFIX wfn: <java:org.webofcode.atzori.>"
			+ "PREFIX fn: <http://www.w3.org/2005/xpath-functions#> "
			+ " SELECT * "
			+ " { "
			+ " BIND( wfn:call(CONCAT(STR(fn:concat),\"@http://dbpedia.org/sparql\"),\"alpha\",\"BETA\") as ?res ) "
			+ "} ";

	String queryResult = new CallHandler().resolveQuery(queryString);
	assertEquals("alphaBETA", queryResult);
}
}
