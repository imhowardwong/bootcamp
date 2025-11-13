public class DemoPolymorphism {
  public static void main(String[] args) {
    // 1. Compile time (java file -> class file)
    // Main purpose of Parent class/ interface -> polymorphism
    Shape shape1 = new Circle(3.4,"RED");
    System.out.println(shape1.getArea()); // reference type(Shape) has getArea()
    //System.out.println(shape1.getArea2()); //! Follow the reference type(Shape) to determine if the method can called.
    System.out.println(((Circle) shape1).getArea2()); //! Risky (because the object can be square value in line 5)
    //! we can avoid the risk by using "instanceOf" to recogine the value was circle
    
    //Advantages
    Shape[] shapes = new Shape[2];
    shapes[0] = new Circle(3.2, "WHITE");
    shapes[1] = new Square(3.2, "YELLOW");
    //! The area calculation is decoupled. "Open-Close"-> coding principle
    // if using if-else then not "Open-Close"
    double total= 0.0;
    for (Shape shape : shapes){
      total += shape.getArea();
    }
    System.out.println(total);
    // 2. Run time
    //! shape.getArea() -> runtime polymorphism
  }
}
