package In28Minutes_Java_Lecture_Programs;

import java.math.BigDecimal;

public class BigDecimalSimpleInterestRunner {
    public static void main(String[] args) {
        BigDecimalSimpleInterest calculator = new
                BigDecimalSimpleInterest("4500.00","7.5");
        BigDecimal totalValue = calculator.calculateTotalValue(5);
        System.out.println(totalValue);

    }
}
