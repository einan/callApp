# callApp
Apache Jena Console App for the Call Function

Professor Atzori has published a study (https://github.com/lidingpku/iswc2014/raw/master/paper/87970401-toward-the-web-of-functions-interoperable-higher-order-functions-in-sparql.pdf) about the custom function example for SPARQL queries. Then, this project examines his study
on Apache Jena console app.

According to the link (https://bitbucket.org/atzori/callsparql), we can download Apache Jena 3 and Fuseki 2.

1. Download: http://mirror.idealhosting.net.tr/Apache/jena/binaries/apache-jena-3.1.0.zip
2. Download: http://mirror.idealhosting.net.tr/Apache/jena/binaries/apache-jena-fuseki-2.4.0.zip
3. Go to the Fuseki dir and run it: 
"java -Xmx1200M -cp fuseki-server.jar:../callsparql/wfn_call.jar org.apache.jena.fuseki.cmd.FusekiCmd"

or we can directly reach the sample dataset : http://swipe.unica.it/3030/ds/query

 *Download: https://bitbucket.org/atzori/callsparql/get/454f11e26ad5.zip

Then, Sparql query to the remote endpoint can be examined 
as seen in the Example 2: (http://atzori.webofcode.org/projects/wfn/)
