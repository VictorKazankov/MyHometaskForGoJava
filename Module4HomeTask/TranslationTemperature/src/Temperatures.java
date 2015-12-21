
public class Temperatures {

    public static void main(String[] args) {

        CalculationTemperature calculationTemperature = new CalculationTemperature(23.5f, 123.67f);

        System.out.println("23.5 Celsius = " + calculationTemperature.translationInFeh() + " Fahrenheit");

        System.out.println("123.67 Fahrenheit = " + calculationTemperature.translationInCel() + " Celsius");
    }
}
