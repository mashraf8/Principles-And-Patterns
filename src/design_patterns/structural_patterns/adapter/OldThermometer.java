package design_patterns.structural_patterns.adapter;

public class OldThermometer
{
    private double temperatureInFahrenheit;

    public OldThermometer(double temperatureInFahrenheit)
    {
        this.temperatureInFahrenheit = temperatureInFahrenheit;
    }

    public double getTemperatureInFahrenheit()
    {
        return temperatureInFahrenheit;
    }
}
