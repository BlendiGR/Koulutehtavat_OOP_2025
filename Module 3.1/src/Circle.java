import javax.swing.*;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;

    }

    @Override
    public double calculateArea(){
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return this.color+ " Circle with radius " + this.radius +
                " has area " + calculateArea();
    }

}
