import java.util.ArrayList;
import java.util.Optional;

public class DemoTypeInference {
  //! cant do
  // 2. Attribute type
  // private var name;
  public static void main(String[] args) {
    //Java 10
    int x =3;
    //! because x has been defined as int, we cannot re-define the type of x again
    //x=3.5

    var y= 10;
    System.out.println(y);
    var name = "Jenny";
    System.out.println(name);

    var ages = new int[]{10,3,9};
    var email = Optional.of("peter@gmail.com");
    var apples = new ArrayList<>();

    //! "var" supports implicitly original type when initialization(first assignment)
    //! "value assignment" decides the type of reference
    // apples = 10; //because "apples" has been defined as "ArrayList" in lines 19
    //! Java is Static(compile) and String (explicit conversion) type language
    int score;
    var score2 = "Leo";
  }

  //! Cant do
  // 1. Parameter
  // public static int sum(var x, var y){
  // }

  // 3. Method return types
   // public static var sum(int x, int y){
  // }
}
