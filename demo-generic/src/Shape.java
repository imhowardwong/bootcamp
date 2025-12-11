import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
  abstract double area();
  
  //T
  public static double totalArea(ArrayList<Shape>shapes){
    double total = 0;
    for (Shape shape : shapes){
      total += shape.area();
    }
    return total;
  }
  //! For ststic method of generic,
  //! we have to dofine the range of T <T extends Shape>
    public static <T extends Shape>double totalArea2(ArrayList<Shape>shapes){
    double total = 0;
    for (Shape shape : shapes){
      total += shape.area();
    }
    return total;
  }
  public static void main(String[] args) {
    ArrayList <Shape> shapes = new ArrayList<>();
    shapes.add(new Circle(3));
    for (Shape shape : shapes){
      System.out.println(shape.area());
    }
  //! The different between totalArea() and totalArea2()
  ArrayList<Circle> circles = 
    new ArrayList<>(List.of(new Circle(3), new Circle(4)));
    System.out.println(totalArea2(shapes));
  }
  //The design of totalArea2() is more flexible than totalArea()
  
}
