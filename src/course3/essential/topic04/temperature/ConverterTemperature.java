package course3.essential.topic04.temperature;

public class ConverterTemperature {

    public double convertToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double convertToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        ConverterTemperature converter = new ConverterTemperature();
        double celsius = 25.0;

        System.out.println("Celsius: " + celsius);
        System.out.println("Kelvin: " + converter.convertToKelvin(celsius));
        System.out.println("Fahrenheit: " + converter.convertToFahrenheit(celsius));
    }
}
