public class DemoObject {
  public static void main(String[] args) {
    //! Parent vs child
    //!child object can be assigned to parent object reference
    
    //Example
    String s = "hello";
    //"hello" -> String object
    Object o1 = "hello";
    Object o2 = new Warrior(); 
    Shape sh1 = new Circle();
    
    Object [] things = new Object[3];
    things[0] = new Warrior();
    things[1] = new String("hello");
    things[2] = new Square(3.4, "BLUE");
    
    //! Polymprphism
    //Square -> area
    // System.out.println(things[2].getArea());//!runtime ok, but you cant pass through the compile time

    //Compile Time (The time you writing the code)
    
  }
}
