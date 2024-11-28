import ma.showmaker.Calculator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {


    @Test
    public void testCalculateAverage() {
        Calculator calculator = new Calculator();
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);
        double result = calculator.calculateAverage(numbers);
        assertEquals(5.0, result, "La moyenne de [2, 4, 6, 8] doit être 5.0");
    }

    @Test
    public void testCalculateAverageEmptyList() {
        Calculator calculator = new Calculator();
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateAverage(Arrays.asList());
        });
        assertEquals("La liste ne peut pas être vide", thrown.getMessage());
    }

    @Test
    public void testCalculateAverageSingleElement() {
        Calculator calculator = new Calculator();
        List<Integer> numbers = Arrays.asList(10);
        double result = calculator.calculateAverage(numbers);
        assertEquals(10.0, result, "La moyenne de [10] doit être 10.0");
    }

    @Test
    public void testCalculateAverageNullList() {
        Calculator calculator = new Calculator();
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateAverage(null);  // Passer une liste null
        });
        assertEquals("La liste ne peut pas être vide", thrown.getMessage());  // Vérifier le message d'erreur
    }
}
