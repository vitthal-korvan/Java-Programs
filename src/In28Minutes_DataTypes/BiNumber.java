package In28Minutes_DataTypes;

public class BiNumber {
    private int number1;
    private int number2;

    public BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1(){
        return number1;
    }
    public void setNumber1(int number1){
        this.number1 = number1;
    }
    public int getNumber2(){
        return number2;
    }
    public void setNumber2(int number1){
        this.number2 = number2;
    }
    public int add() {
        int add = number1 + number2;
        return add;
    }
    int mul(){
        int mul = number1 * number2;
        return mul;
    }

    void doubleVal(){
        this.number1 *=2;
        this.number2 *=2;
    }
}
