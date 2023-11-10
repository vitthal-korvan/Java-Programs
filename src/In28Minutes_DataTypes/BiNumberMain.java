package In28Minutes_DataTypes;

public class BiNumberMain {
    public static void main(String[] args) {
       BiNumber numbers = new BiNumber(2,3);
       System.out.println(numbers.add());
       System.out.println(numbers.mul());
       numbers.doubleVal();
       System.out.println(numbers.getNumber1());
       System.out.println(numbers.getNumber2());


    }
}
