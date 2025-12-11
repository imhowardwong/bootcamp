import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
  public static void main(String[] args) {

    String[] names = new String[2];
    names[0] = "John";
    names[1] = "Peter";

    // Array Disadvantages:
    // 1. Fixed Length (Know the required length before using it)
    // 2. Same type of values in the array

    // ArrayList has variable length.
    ArrayList<String> names2 = new ArrayList<String>();
    names2.add("John");
    names2.add("Peter");
    names2.add("Susan");

    System.out.println(names2); // [John, Peter, Susan]
    names2.remove("Peter");
    System.out.println(names2); // [John, Susan]

    System.out.println(names2.size()); // 2

    System.out.println(names2.get(1)); // Susan
    System.out.println(names2.get(0)); // John

    System.out.println(names2.isEmpty()); // false
    System.out.println(names2.indexOf("Susan")); // 1
    System.out.println(names2.contains("John")); // true
    System.out.println(names2.contains("Peter")); // false

    System.out.println(names2.contains("John") || names2.contains("Susan")); // true

    // Cat.java -> ArrayList<Cat>
    // Animal.java (Cat extends Animal) -> ArrayList<Animal>
    Cat c1 = new Cat("John");
    Cat c2 = new Cat("Mary");

    // Approach 1: create ArrayList Object
    ArrayList<Cat> cats = new ArrayList<>();
    cats.add(c1);
    cats.add(c2);
    cats.add(new Cat("Leo"));

    // remove -> for loop -> cat.equals()
    cats.remove(new Cat("Leo"));
    // System.out.println(cats);

    // ! remove() -> remove first matched object
    // you can try to put two Leo into Array and remove them

    // Approach 2
    ArrayList<Cat> cats2 =
        new ArrayList<>(List.of(new Cat("Oscar"), new Cat("Jenny")));

    // combine 2 cat list
    cats.addAll(cats2);
    System.out.println(cats2);
  }
}


