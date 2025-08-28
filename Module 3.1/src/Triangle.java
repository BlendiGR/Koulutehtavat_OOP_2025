public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double height, double base){
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return (0.5 * base * height);
    }

    @Override
    public String toString() {
        return "Triangle with base " + this.base +
                " and height " + this.height +
                " has area " + calculateArea();
    }

}
