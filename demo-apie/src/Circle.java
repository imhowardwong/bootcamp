import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape{
  //! Child's empty constructor would call parent empty constructor
  private double radius;
  public Circle(){
    //implicitly calling parent empty constructor
  }
  public Circle(double radius, String color){
    super(color);
    this.radius= radius;
  }
  public double getArea(){
    return BigDecimal.valueOf(this.radius)
          .multiply(BigDecimal.valueOf(this.radius))
          .multiply(BigDecimal.valueOf(Math.PI))
          .setScale(2, RoundingMode.HALF_UP).doubleValue();
  }
  public static void main(String[] args) {
    Circle c1 = new Circle(3.5,"RED");
    Circle c2 = new Circle();
    System.out.println(c1.getArea());
  }


}
