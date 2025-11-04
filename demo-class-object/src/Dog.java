//! Class作者 write down the ways to access(read & write) the attribute values
//! Method Definition : Presentation
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dog {
  private double weight;
  private double height;

  public Dog(){
  }
  public Dog(double weight, double height){
  this.weight = weight;
  this.height = height;
  }

  //! Java(67109219)
  //! Duplicated: the number of parameter and the type of the parameter of them are same
  // public Dog(double weight){
  //   this.weight= weight;
  // }

  //   public Dog(double height){
  //   this.weight= height;
  // }

  //! getter for the weight & height
  public double getWeight(){
    return this.weight;
  }
  public double getHeight(){
    return this.height;
  }
  public double getBmi(){

    BigDecimal heightSquare = BigDecimal.valueOf(height)
      .multiply(BigDecimal.valueOf(height))
      .setScale(2, RoundingMode.HALF_UP);

    return BigDecimal.valueOf(this.weight)
      .divide(heightSquare, 2, RoundingMode.HALF_UP)
      .doubleValue();
  }

  //! setter (update attribute values)
  public void setWeight(double weight){
    this.weight = weight;
  }

    public void setHeight(double height){
    this.height = height;
  }

public static void main(String[] args) {
  Dog d1 = new Dog(4.5, 0.3);
  Dog d2 = new Dog(5.5, 0.25);

  System.out.println(d1.getWeight()); //4.5
  System.out.println(d1.getHeight()); //0.3
  System.out.println(d2.getWeight()); //5.5
  System.out.println(d2.getHeight()); //0.25

  //! double primitives default value = 0.0
  Dog d3 = new Dog();
  System.out.println(d3.getHeight());
  System.out.println(d3.getWeight());
  System.out.println(d1.getBmi()); //50
  System.out.println(d2.getBmi()); //91.67
  //System.out.println(d3.getBmi()); //0
}
}
