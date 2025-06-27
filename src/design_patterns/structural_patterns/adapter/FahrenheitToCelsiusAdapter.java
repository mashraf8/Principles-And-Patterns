package design_patterns.structural_patterns.adapter;

public class FahrenheitToCelsiusAdapter implements TemperatureSensor
{
    private final OldThermometer oldThermometer;

    public FahrenheitToCelsiusAdapter(OldThermometer oldThermometer)
    {
        this.oldThermometer = oldThermometer;
    }

    @Override
    public double getTemperatureInCelsius()
    {
        double f = oldThermometer.getTemperatureInFahrenheit();
        return (f - 32) * 5 / 9;
    }
}
