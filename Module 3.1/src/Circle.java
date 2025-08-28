import javax.swing.*;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius){
        this.radius = radius;

    }

    @Override
    public double calculateArea(){
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Circle with radius " + this.radius +
                " has area " + calculateArea();
    }

}
