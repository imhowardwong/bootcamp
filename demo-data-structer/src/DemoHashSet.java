import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<Cat> cats = new HashSet<>();
    cats.add(new Cat("John"));
    cats.add(new Cat("Mary"));
    cats.add(new Cat("Tommy"));
    cats.remove(new Cat("Mary"));
    //! HashSet is from "Hash" family, most of the method from Hash data structer use both equals() and hashCode()
    System.out.println(cats.size()); // 2
    System.out.println(cats.contains(new Cat("Mary"))); //false
  
    // ! Why do we need HashCode?
    // - Avoid duplicated

    // equals() and hashCode()
    boolean result = cats.add(new Cat("Tommy"));
    System.out.println(result); // false

    result = cats.add(new Cat("Steven")); //!HashSet add() -> loop
    System.out.println(result); // true
  }
}