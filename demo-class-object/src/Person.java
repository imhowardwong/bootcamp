public class Person {
  private Eye[] eyes;
  // private String colour;

  // API"E" (Encpsulation)
  public Person(){
    this.eyes = new Eye[2];  //2 eye boxes, array object
    this.eyes[0] = new Eye("Black");
    this.eyes[1] = new Eye("Black");
  }
  public void changeRightEyeColor(String color){
    this.eyes[1].setColour(color);
  }
  public Eye getRightEyeColor(){
    return this.eyes[1];
  }
  public void setLeftEye(Eye eye){
    this.eyes[0]= eye;
  }
  public Eye getLeftEye(){
    return this.eyes[0];
  }
  public static void main(String[] args) {
    Person p1 = new Person();
    Eye e1 = new Eye("RED");
    p1.setLeftEye(e1);
    p1.setLeftEye(new Eye("Yellow"));
    e1.setColour("ORANGE");
    p1.changeRightEyeColor("BLUE");
    System.out.println(p1.getRightEyeColor().getColour());
    System.out.println(p1.getLeftEye().getColour()); //Yellow
    System.out.println(e1.getColour());
    }
  }


