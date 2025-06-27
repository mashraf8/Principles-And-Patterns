package design_patterns.structural_patterns.adapter;

public class Run
{
    public static void main(String[] args)
    {
        // Create a simulated user input (e.g., 98.6°F)
        double userFahrenheit = 98.6;

        // Create the old thermometer with the user-provided temperature
        OldThermometer oldThermometer = new OldThermometer(userFahrenheit);

        // Convert using the Adapter
        TemperatureSensor adapter = new FahrenheitToCelsiusAdapter(oldThermometer);

        // Display the result
        System.out.printf("Temperature in Celsius: %.2f °C\n", adapter.getTemperatureInCelsius());
    }
}
