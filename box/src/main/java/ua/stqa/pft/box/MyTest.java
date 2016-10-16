package ua.stqa.pft.box;

public class MyTest {

    public static void main(String[] args) {
        hello("world");
        hello("user");
    }

    public static void hello(String somebody){
        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double l){return l * l;}

    public static double area(double a, double b){return a*b;}
}