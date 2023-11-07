package converter.ejb;

import java.text.DecimalFormat;
import jakarta.ejb.Stateless;
import jakarta.ejb.LocalBean;

@Stateless
@LocalBean
public class ConverterBean implements ConverterBeanLocal {
    
    private DecimalFormat twoDigits = new DecimalFormat("0.00");
    
    public String ctof(double c) {
        String result = twoDigits.format((c*4)/5);
        return result;
    }
    
    public String ftoc(double f) {
        String result = twoDigits.format((f * 5) / 4);
        return result;
    }

    public String kelvinToFahrenheit(double value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String fahrenheitToKelvin(double value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
