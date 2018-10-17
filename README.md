# calculator
Rick's WSDL calculator

Essentially what he wants is for us to create something so that he can use to test soapui.exe. I decided to create a quick java servletcalculator that does this.

I followed this guide for how to create an webservice in Eclipse at:  https://www.journaldev.com/9131/soap-webservices-in-java-example-eclipse

Here is how to run it in SoapUI: https://www.soapui.org/soap-and-wsdl/getting-started.html

To test it, you will need to install Apache Tomcat along with Eclipse:
1.	https://tomcat.apache.org/download-90.cgi
2.	https://www.eclipse.org/downloads/

How it works is through get and not post. You will need to (while running tomcat) access your localhost, and then insert two values to add. For example: http://localhost:8080/calculator/calculatorServlet?num1=10&num2=20 - where num1 is 10, and num2 is 20, causing the total to be 30.
