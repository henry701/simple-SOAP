package soapbasico;

import javax.xml.ws.Endpoint;

public class SoapInitializer
{
    public static void main(String[] args)
    {
        Endpoint.publish("http://localhost:8080/jaxws/hello", new SoapBasicoImplemented());
        System.out.println("Server is running!");
    }
}