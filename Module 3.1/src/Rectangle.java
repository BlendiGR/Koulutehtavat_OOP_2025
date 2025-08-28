public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle (String color, double width, double height){
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return height * width;
    }

    @Override
    public String toString() {
        return this.color + " Rectangle with width " + this.width +
                ", height " + this.height +
                " has area " + calculateArea();
    }
}
