package soapbasico;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(endpointInterface = "soapbasico.SoapBasico")
public class SoapBasicoImplemented implements SoapBasico
{
    private final Integer age = 10;
    public void SoapBasico() {}
    
    @Override
    public String getFormattedAgeForName(String name)
    {
        return name + " is " + this.age + " years old.";
    }
}