import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {
  private double radius;

  public Circle(){
  }
  public Circle(double radius, String string){
    this.radius= radius;
  }
  public double getRadius(){
    return this.radius;
  }
  public void setRadius(double radius){
    this.radius = radius;
  }
  // getArea
  public double getArea(){
    return BigDecimal.valueOf(this.radius)
      .multiply(BigDecimal.valueOf(this.radius))
      .multiply(BigDecimal.valueOf(Math.PI))
      .setScale(2, RoundingMode.HALF_UP).doubleValue();
  }
  //getDiameter
  public double getDiameter(){
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(2.0))
    .setScale(2, RoundingMode.HALF_UP).doubleValue();
  }

  public static void main(String[] args) {
    Circle c1 = new Circle(1.3);
    Circle c2 = new Circle(2.8);
    Circle c3 = new Circle(3.5);

    System.out.println(c1.getArea()); //5.31
    System.out.println(c1.getDiameter()); //2.6
    System.out.println(c2.getArea()); //24.63
    System.out.println(c2.getDiameter()); //5.6
    System.out.println(c3.getArea()); //38.48
    System.out.println(c3.getDiameter()); //7.0

    // Circle array
    Circle [] circle = new Circle[] {c1,c2,c3};

    //Loop -> total area
    BigDecimal total = BigDecimal.ZERO;
    for (Circle c : circle){
      total = total.add(BigDecimal.valueOf(c.getArea()));
      }
      System.out.println(total.doubleValue()); //68.42
    }
	public char[] getArea2() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getArea2'");
	}

  }


