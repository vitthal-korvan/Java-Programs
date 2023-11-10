package In28Minutes_Java_Lecture_Programs;

import java.math.BigDecimal;

public class BigDecimalSimpleInterest {
    BigDecimal principal;
    BigDecimal interest;
    public BigDecimalSimpleInterest(String principal, String interest) {
        this.principal=new BigDecimal(principal);
        this.interest=new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int noOfYear) {
        //simple interest = principal + principal * interest * noOfYears
        BigDecimal totalValue=principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYear)));
        return totalValue;
    }
}
