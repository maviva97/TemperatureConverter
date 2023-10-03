public class TemperatureConverter {
    Float celsius;
    Float fahrenheit;
public  TemperatureConverter(Float c,Float f){
    celsius = c;
    fahrenheit = f;
}

public  Float toCelsius(){

    return  (5*(fahrenheit-32))/9;

}
    public Float toFahrenheit() {

       return  (9*celsius+(32*5))/5;

    }
}
