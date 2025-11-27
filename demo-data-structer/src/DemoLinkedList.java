import java.util.LinkedList;

public class DemoLinkedList {
  public static void main(String[] args) {
    //! LinkedList vs ArrayList
    // 1. add() (add to tail): LinkedList has a little advantages
    // 2. size(), should store the current size -> similar
    // 3. get(), find the 10th elements in the list(ArrayList should be faster)
    // 4. contains(), loop -> similar
    // 5. remove(), remove "John" -> similar

    LinkedList<Cat> cats = new LinkedList<>();
    cats.add(new Cat("Oscar"));
    cats.add(new Cat("Susan"));
    cats.remove(new Cat ("Susan"));
    System.out.println(cats.size());
    System.out.println(cats);
    System.out.println(cats.contains(new Cat("Oscar"))); //true
    System.out.println(cats.contains(new Cat("Susan"))); //false


  }
}
