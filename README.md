# calculator
Rick's WSDL calculator

Essentially what he wants is for us to create something so that he can use to test soapui.exe. I decided to create a quick java servletcalculator that does this.

I followed this guide for how to create an webservice in Eclipse at:  https://www.journaldev.com/9131/soap-webservices-in-java-example-eclipse

Here is how to run it in SoapUI: https://www.soapui.org/soap-and-wsdl/getting-started.html

To test it, you will need to install Apache Tomcat along with Eclipse:
1.	https://tomcat.apache.org/download-90.cgi
2.	https://www.eclipse.org/downloads/

To get it to initially work, you will need to add an external JAR file after you import the project.
1. Open the calculator project
2. Open Java Resources
3. Open Libraries
4. Right-click on JRE System Library...
5. Go to "build path"
6. Go to "configure build path"
7. Click "add external JAR"
8. Navigate to "C:\Program Files\Apache Software Foundation\Tomcat 9.0\lib\"
9. Select the "servlet-api"
10. Apply - and your errors should be gone

How it all works is beyond me, but if you type in this website (while running the program in Eclipse/Tomcat) it'll work: http://localhost:8080/calculatorClient/sampleCalculatorServletProxy/TestClient.jsp?endpoint=http://localhost:9374/calculator/services/calculatorServlet

*note: your ports may be different, depending on your localhost setup.