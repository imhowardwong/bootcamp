import java.math.BigDecimal;
import java.math.RoundingMode;

public class Square extends Shape {
  private double length;

  public Square(){}
  public Square(double length, String color){
    super(color);
    this.length = length;
  }
  public double getLength(){
    return this.length;
  }
  //! As a child class, you have to implement parents abstract method
  @Override
  public double getArea(){
    return BigDecimal.valueOf(this.length)
          .multiply(BigDecimal.valueOf(this.length))
          .setScale(2, RoundingMode.HALF_UP).doubleValue();
  }
  public static void main(String[] args) {
    //! why do we need parent class
    //1. share common attribute (readability)
    //2. Shape[], but not only Circle[], Square[]
    //the type of array can be parent class
    //which allows storing the child object
    Shape [] shapes = new Shape[3];
    shapes [0] = new Circle(3.5 ,"Yellow");
    shapes [1] = new Square(5.0, "Blue");
    shapes [2] = new Circle(2.3, "Pink");

    // Calculate the total area of all shapes
    BigDecimal total = BigDecimal.ZERO;
    for (Shape shape : shapes){
      //! Java just look at the clalss, see if there have method(getValue)
      // In other words, Shape.class has no area

      //!After having abstract method in parent class,
      total = total.add(BigDecimal.valueOf(shape.getArea()));
    }
     System.out.println(total); //80.1
     System.out.println(shapes[0].getColor()); //Yellow
  }

}
