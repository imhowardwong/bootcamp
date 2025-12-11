import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoLambda2 {
 public static void main(String[] args) {
  // Java 5
  // Generic -> ArrayList<String>

  //Jvav8
  // Lambda -> 1. data structure advanced features 2. stream
  List<Square> squares = List.of(new Square(3.5), new Square(7.0), new Square(2.3));
  // before lambda
  for (Square square : squares){
    // System.out.println(square.area());
  }
  //Lambda
  squares.forEach(s-> System.out.println(s.area()));

  //!
  // Map
  Map<Character, String> fruitMap = new HashMap<>();
  fruitMap.put('a', "apple");
  fruitMap.put('b', "banana");
  fruitMap.computeIfAbsent('a', c -> "kiwi");
  System.out.println(fruitMap); //{a=apple, b=banana}
fruitMap.computeIfAbsent('c', c -> "kiwi");
  System.out.println(fruitMap); //{a=apple, b=banana, c=kiwi}

  // stream

  } 
}
