package ma.showmaker;

import java.util.List;

public class Calculator {
    public double calculateAverage(List<Integer> numbers) {


        // code rajoute pour gerer les tests ou on a une list vide
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("La liste ne peut pas être vide");
        }

        //code ecris pour implementer le minimum demande
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }
}
