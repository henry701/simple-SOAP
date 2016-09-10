package soapclient;

import soapbasico.SoapBasico;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class SoapClient
{
    public static void main(String[] args) throws Exception
    {
	URL url = new URL("http://localhost:8080/jaxws/hello?wsdl");
        QName qname = new QName("http://soapbasico/", "SoapBasicoImplementedService");
        
        Service service = Service.create(url, qname);
        
        SoapBasico hello = service.getPort(SoapBasico.class);

        System.out.println(hello.getFormattedAgeForName("Henrique"));
    }
}