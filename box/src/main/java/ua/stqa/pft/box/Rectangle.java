package ua.stqa.pft.box;

/**
 * Created by asus on 16.10.2016.
 */
public class Rectangle {
    public double a;
    public double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double area(){return a * b;}
}
