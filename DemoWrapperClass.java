public class DemoWrapperClass {
  public static void main(String[] args) {
    // 8 Primites
    // Each Primities type has its corrsponding Wrapper Class

    // int -> Integer
    // short -> Short
    // long -> Long
    // byte -> Byte
    // char -> Charater
    // boolean -> Boolean
    // float -> Float
    // double -> Double

    Integer x = 3; // 
    int y = 3; // storing the value itself only 

    double x2 = x.doubleValue();
    System.out.println(x2); // 3.0
    String x3 = x.toString(); // 

    // Null Value (Class type)
    //int k;
    //System.out.println(k);// assign value before reading the variable

    // equals()
    // ! Never use i as local varibale, j k as well
    Integer i1 = 7;
    Integer i2 = 8;
    System.out.println(i1 == i2); // Integer == Integer, false
    System.out.println(i1.equals(i2)); //false
    System.out.println(i1.compareTo(i2)); //-1

    // >=, >
    System.out.println('a'>95); //true

    i1 = 200;
    byte b2 = i1.byteValue(); // similar to downcasting
    System.out.println(b2); //-56

    // Character
    Character c1 = 'a'; //auto-box (primitive value -> wrapper class object)
    char c2 = c1; // un-box

    System.out.println(c1.compareTo('a')); //0
    System.out.println(c1.compareTo('c')); //-2 ('a' - 'c')
    System.out.println(c1.equals('a')); //true
    System.out.println(c1.equals('d')); // false
    System.out.println(Character.isAlphabetic('a')); // true
    System.out.println(Character.isUpperCase(c1)); // false
    System.out.println(Character.isDigit('p')); // false

    //lowercase
    char c3 = 'a';
    //approach1
    if (c3 >= 97 && c3<=122);
    System.out.println("c3 is a lowercase letter.");

    //approach2
    System.out.println(Character.isLowerCase(c3)); // true

    //Double
    Double d1 = 1.5;
    double d2 = d1;
    // convert into int? Integar?
    int i8 = d1.intValue();
    System.out.println(i8); //1
    Integer i7 = d1.intValue();
    System.out.println(i7); //1

    // auto-box, 3 ways to create an object of Integer
    Integer i20 = Integer.valueOf(9); //most seggested
    Integer i21 = new Integer(9); // almost 棄
    Integer i22 = 9;

    // Primitives
    // int t = 3;
    // we call "x" as variable, while 3 is int value

    //non-primitive (Class)
    // String s = "hello"
    // we call "s" as object reference, while "hello" is an String object

    String s10 = String.valueOf("hello");
    String s11 = new String("hello");
    String s12 = "hello";
    System.out.println(s12.length()); //5
    System.out.println(s10.charAt(3)); //l
    System.out.println(s10.equals(s12)); //true

  }
  
}
