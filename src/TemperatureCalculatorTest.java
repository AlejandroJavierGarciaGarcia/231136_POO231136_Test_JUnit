
/**
 * @version 1.0
 * @author Alejandro García
 * @since 27/10/2023
 * Comments by AI
 */

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class TemperatureCalculatorTest {
    /**
     * Prueba la conversión de Fahrenheit a Celsius.
     */
    @Test
    void testFahrenheitToCelsius() {
        TemperatureCalculator calculator = new TemperatureCalculator();
        assertEquals(0.0, calculator.fahrenheitToCelsius(32.0),0.5);
    }
    /**
     * Prueba la conversión válida de Celsius a Fahrenheit.
     *
     * @throws Exception Si ocurre un error inesperado.
     */
    @Test
    void testCelsiusToFahrenheitValid() throws Exception {
        TemperatureCalculator calculator = new TemperatureCalculator();
        assertEquals(32.0, calculator.celsiusToFahrenheit(0.0), 0.02);
    }
    /**
     * Prueba la conversión inválida de Celsius a Fahrenheit.
     *
     * @throws Exception Si se espera una excepción.
     */
    @Test
    void testCelsiusToFahrenheitInvalid() throws Exception {
        TemperatureCalculator calculator = new TemperatureCalculator();
        try{
            assertEquals(0, calculator.celsiusToFahrenheit(-275.15), 0.02);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    /**
     * Prueba la conversión de Kelvin a Celsius.
     */
    @Test
    void testKelvinToCelsius() {
        TemperatureCalculator calculator = new TemperatureCalculator();
        assertEquals(-172.65, calculator.kelvinToCelsius(100.5), 0.01);
    }
    /**
     * Prueba la conversión de Celsius a Kelvin.
     */
    @Test
    void testCelsiusToKelvin() {
        TemperatureCalculator calculator = new TemperatureCalculator();
        assertEquals(300.15, calculator.celsiusToKelvin(27), 0.01);
    }
    /**
     * Prueba la conversión de Celsius a Kelvin.
     */
    @Test
    void testKelvinToCelsiusInvalid() {
        TemperatureCalculator calculator = new TemperatureCalculator();
        try{
            assertEquals(0, calculator.kelvinToCelsius(-300.0), 0.02);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}