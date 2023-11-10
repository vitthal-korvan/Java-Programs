package In28Minutes_DataTypes;

import java.math.BigDecimal;

public class BigDecimalClass {
    public static void main(String[] args) {

        //BigDecimal is a class for accurate calculation
        //we pass the value in String format
        //If we pass the value un double format it'll calculate in-appropriately
        BigDecimal number1 = new BigDecimal("77.20");
        BigDecimal number2 = new BigDecimal("9.41");
        BigDecimal number3 =number1.add(number2);
        System.out.println(number3);
    }
}
