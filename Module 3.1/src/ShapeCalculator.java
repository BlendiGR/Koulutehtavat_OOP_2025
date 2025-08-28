import java.util.ArrayList;

public class ShapeCalculator {
    public static void main(String[] args){
        ArrayList<Shape> shapes = new ArrayList<>();

        Rectangle rect = new Rectangle("Blue", 5, 4);

        Triangle triang = new Triangle("Red",5, 5 );

        Circle circl = new Circle("Green", 5);

        shapes.add(rect);
        shapes.add(triang);
        shapes.add(circl);

        System.out.println("Shape Calculator.");
        for (Shape shape : shapes){
            System.out.println(shape);
        }
    }
}
