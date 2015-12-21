
public class CalculationTemperature {

    private float tempC; // Celsius temperature
    private float tempF; // Fahrenheit temperature
    public float resultTranslationInFeh;
    public float resultTranslationInCel;

    CalculationTemperature( float tempC, float tempF ){
        this.tempC = tempC;
        this.tempF = tempF;
    }

    public float translationInFeh(){
        return resultTranslationInFeh = (getTempC() * 1.8f) + 32;
    }

    public float translationInCel(){
        return resultTranslationInCel = (getTempF() - 32) / 1.8f;
    }

    public float getTempC() {
        return tempC;
    }

    public float getTempF() {
        return tempF;
    }
}
