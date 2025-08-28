public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle (double width, double height){
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return height * width;
    }

    @Override
    public String toString() {
        return "Rectangle with width " + this.width +
                ", height " + this.height +
                " has area " + calculateArea();
    }
}
