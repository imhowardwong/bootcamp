public class StringBox {
  private String value;
  // object can store anything, but not call the action
  public StringBox (String value){
    this.value = value;
  }
  public String getValue(){
    return this.value;
  }

  public static void main(String[] args) {
    // Box of String
    // Box of Integer

    // Background: I want a flexible design for storing a different type of values
    // 1. Write all class with specific type of value - StringBox, IntegerBox
    // 2. Generic - Box<T> 

    Box<String> stringBox = new Box<String>("hello");
    Box<Integer> integerBox = new Box<Integer>(100);
    //! Generic just help to avoid rewrite a number of classes, but not allow you to change the type of box
    //integerBox = "hello"; //integerBox has been defined as Integer for T during initialization
    // if you want to define a box of object storing anything at anytime
    Box<Object> superBox = new Box<Object>("hello");
    superBox.setValue(Double.valueOf(10.5));
    
    superBox.setValue("abc");
    //Polymorphism
    //superBox.getValue().charAt(0); //base on the box type, not on the value type
    //compile error, Object.class is parent, cant call child methods

  }
}
