package soapbasico;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public interface SoapBasico
{
    @WebMethod
    public String getFormattedAgeForName(String name);
}