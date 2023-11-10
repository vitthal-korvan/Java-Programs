package Satya_Technology_Classes_Programs;

public class MathOperations {
    public static void main(String[] args) {
        int a =4;
        int d=100;
        int b=-5;
        float c=3.142f;
        int x=30;
        double y;
        int min=0, max=100;
        System.out.println(Math.pow(a,2));
        System.out.println(Math.abs(b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.min(a,b));
        System.out.println(Math.max(a,b));
        System.out.println(Math.cbrt(a));
        System.out.println(Math.floor(c));
        System.out.println(Math.ceil(c));
        System.out.println(Math.exp(a));
        System.out.println(Math.log(a));
        System.out.println(Math.log10(d));
        System.out.println((int)(Math.random()*(max-min+1)+min));
        y=Math.toRadians(x);
        System.out.println(Math.sin(y));
        System.out.println(Math.sin(Math.toRadians(x)));
        System.out.println(Math.cos(Math.toRadians(x)));
        System.out.println(Math.tan(Math.toRadians(x)));
    }
}
