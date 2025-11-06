// If the object no color, then the object wont be a shape

//! 1. Abstract Class does not allow to create object
//! 2. Abstract Class allows abstract method
public abstract class Shape {
  private String color;
  public Shape(){
    System.out.println("Shape's empty constructor");
  }
  public Shape(String color){
    System.out.println("Shape's all args constructor");
    this.color= color;
  }
  public String getColor(){
    return this.color;
  }
  public void setColor(String color){
    this.color = color;
  }
  //!Abstract method: dont need to present the logic at this moment
  public abstract double getArea(); // because abstract can end of ;
}
