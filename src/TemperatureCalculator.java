
/**
 * @version 1.0
 * @author Alejandro García
 * @since 27/10/2023
 * Comments by AI
 */
public class TemperatureCalculator {
    /**
     * Convierte una temperatura en grados Fahrenheit a grados Celsius.
     *
     * @param fahrenheit Temperatura en grados Fahrenheit.
     * @return Temperatura en grados Celsius.
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    /**
     * Convierte una temperatura en grados Celsius a grados Fahrenheit.
     *
     * @param celsius Temperatura en grados Celsius.
     * @return Temperatura en grados Fahrenheit.
     * @throws IllegalArgumentException Si la temperatura en grados Celsius es menor que -273.15°C.
     */
    public double celsiusToFahrenheit(double celsius) throws Exception {
        if (celsius < -273.15) {
            throw new Exception("La temperatura en Celsius no puede ser menor que -273.15°C");
        }
        return (celsius * 1.8) + 32;
    }
    /**
     * Convierte una temperatura en grados Kelvin a grados Celsius.
     *
     * @param kelvin Temperatura en grados Kelvin.
     * @return Temperatura en grados Celsius.
     * @throws IllegalArgumentException Si la temperatura en grados Kelvin es menor que 0K.
     */
    public double kelvinToCelsius(double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException("La temperatura en Kelvin no puede ser menor que 0 K");
        }
        return kelvin - 273.15;
    }
    /**
     * Convierte una temperatura en grados Celsius a grados Kelvin.
     *
     * @param celsius Temperatura en grados Celsius.
     * @return Temperatura en grados Kelvin.
     * @throws IllegalArgumentException Si la temperatura en grados Celsius es menor que -273.15°C.
     */
    public double celsiusToKelvin(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("La temperatura en Celsius no puede ser menor que -273.15°C");
        }
        return celsius + 273.15;
    }

}
