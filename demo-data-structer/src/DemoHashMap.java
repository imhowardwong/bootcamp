import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // Key and Value
    // Fruits : orange, apple, banana
    // Aminals : rabbit, monkey

    ArrayList<String> fruits = new ArrayList<>(List.of("orange", "apple", "banana"));
    ArrayList<String> animals = new ArrayList<>(List.of("rabbit", "monkey"));
    
    //<Key, Value>
    HashMap<String, ArrayList<String>> dictionary1 = 
    new HashMap<String, ArrayList<String>>();

    dictionary1.put("fruits", fruits);
    dictionary1.put("animals", animals);

    // we use key to find corresponding values
    ArrayList<String> listOfFruits = dictionary1.get("fruits");
    System.out.println(listOfFruits);
    ArrayList<String> listOfAnimals = dictionary1.get("animals");
    System.out.println(listOfAnimals);

    // add a new animals (tigers)
    dictionary1.get("animals").add("tigers");
    System.out.println(dictionary1.get("animals"));
    animals.add("lion");
    System.out.println(dictionary1.get("animals"));
    System.out.println(listOfAnimals);

    // definition of put()
    // hashMap.put() -> 1. if key exists,override the value, otherwise, add an new entry
    dictionary1.put("fruit", new ArrayList<>(List.of("lemom")));
    System.out.println(dictionary1); //{fruits=[orange, apple, banana], fruit=[lemom], animals=[rabbit, monkey, tigers, lion]}
    // Example 2 : Key=Integer, Value = String
    HashMap<Integer, String> classMate= new HashMap<>();
    // classMate.put(Integer.valueOf(1), "John");
    classMate.put(1, "John");
    classMate.put(2, "Peter");
    System.out.println(classMate.get(2));
    classMate.replace(2, "Mary");
    // if key didint exists, get() return null
    System.out.println(classMate.get(3)); // null
    System.out.println(classMate.size()); // the number of  Entries
    System.out.println(classMate.isEmpty()); // false
    System.out.println(classMate.remove(1)); //remove and return removed value
    System.out.println(classMate.get(2)); 
    System.out.println(classMate.size()); //1

    // loop HashMap (loop entries)
    // entry object has two methods : getKey(), getValue()
    for (Map.Entry<Integer, String> student : classMate.entrySet()){
      System.out.println("student no="+student.getKey()+", student name=" + student.getValue());
    }
    System.out.println(classMate.containsKey(2)); // true
    System.out.println(classMate.containsKey(1)); //false
    //containsValue = for loop
    System.out.println(classMate.containsValue("Mary")); //true
    System.out.println(classMate.containsValue("mary")); //false
  }
}
