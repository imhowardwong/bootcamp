import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
  public static void main(String[] args) {
    List<String> names = List.of("Mary", "Tommy", "Jenny", "Alex", "Sue");

    //! filter()
    List <String> names2 =  names.stream() //stream<String>
      .filter(n -> n.length() > 4) // stream<String>
      .collect(Collectors.toList()); //List<String>

      System.out.println(names); //[Mary, Tommy, Jenny, Alex, Sue]
      System.out.println(names2); //[Tommy, Jenny]

    // "bcd" compareTo "abc"
    // Comparator <String> sortedByDec = (s1, s2) -> s1.compareTo(s2) > 0? -1:1;

    //! sorted()
    List<String> names3 = names.stream() //
      .filter(n->n.length()%2==1) //
      .sorted((s1, s2) -> s1.compareTo(s2) > 0? -1:1) //
      .collect(Collectors.toList());
      System.out.println(names3); //[Tommy, Sue, Jenny]

      // filter
      // List<Person> Tommy 18, Jenny 30, Benny 42, John 23
    // List<String> person = List.of("Tommy", "Jenny", "Benny", "John");
    // List<Integer> age = List.of('18','30','42', '23')
    Person p1 = Person.builder().name("Tommy").age(18).build();
    Person p2 = Person.builder().name("Jenny").age(30).build();
    Person p3 = Person.builder().name("Benny").age(42).build();
    Person p4 = Person.builder().name("John").age(23).build();
    List<Person> persons = List.of(p1,p2,p3,p4);
      List<Person> person2 = persons.stream() //
      .filter(p->p.getName().contains("J")&&p.getAge()>25)//
      .collect(Collectors.toList());
    System.out.println(person2);

    //! map() -> resturcture List<Person> to List<String>
    List<String> personNames = persons.stream() //
      .map(p -> p.getName()) //
      .collect(Collectors.toList());
      System.out.println(personNames); //[Tommy, Jenny, Benny, John]

    List<Integer> personAge = persons.stream() //
      .filter(p -> p.getName().endsWith("y"))
      .map(p -> p.getAge()) //
      .collect(Collectors.toList());
      System.out.println(personAge); // [18, 30, 42]

      //! printOut
      persons.stream() //
      .forEach(p -> System.out.println("Person, age=" + p.getAge() + ", name=" + p.getName())); 
      //Person, age=18, name=Tommy, Person, age=30, name=Jenny, Person, age=42, name=Benny, Person, age=23, name=John

      
    List<String> staffName = List.of("Mary", "Jenny","Jenny","Jenny","Tommy","Tommy", "Sue" );//
    List<String> uniqueStaffNames = staffName.stream()//
      .distinct()//
      .collect(Collectors.toList());
    System.out.println(uniqueStaffNames); //[Mary, Jenny, Tommy, Sue]

    //! collect to Set
    Set<String> uniqueStaffNames2 = staffName.stream()//
      .collect(Collectors.toSet());
    System.out.println(uniqueStaffNames2); //[Sue, Jenny, Tommy, Mary]

    // Summary : Intermediate operation, terminal 
    List<String> names4 = List.of("Sue", "Jenny", "Benny");

    List<Character> chs = names4.stream() //
      .filter(e->e.endsWith("y"))
      .map(e->e.charAt(0))
      .collect(Collectors.toList());
    System.out.println(chs); // (J,B)

    List<String> names5 = List.of("Sue", "Jenny", "Benny");

    long numberOfName = names5.stream() //
      .distinct() //
      .count();
      System.out.println(numberOfName); //3

      
      //! map count
      long numberOfName2 = names5.stream() //
      .map(e->e.length()) //! map()wont affect the result of count(), map() will skip if you are using count() as terminal
      .count();
      System.out.println(numberOfName2); //3

      Person p10 = Person.builder().age(12).name("John").build();
      Person p12 = Person.builder().age(25).name("Peter").build();
      Person p13 = Person.builder().age(40).name("Sam").build();
      List<Person> staffs = List.of(p10,p12,p13);
      List<String> staffsNames2 = staffs.stream()//
        .filter(e -> {
          System.out.println("filter name="+e.getName());
          return e.getAge()>=20; //
        }) //Stream<Person>
        .map(e -> {
          System.out.println("map name="+e.getName());
          return e.getName().toUpperCase();
        }) //Stream<String>
        .collect(Collectors.toList());
        System.out.println(staffsNames2);


        //Stream.class
        Stream<String> emails = Stream.of("leo@gmail.com", "jacky@gmail.com", "jenny@gmail.com");
        long numberOfVaildEmail = emails
        .filter(e->e.contains("@"))
        .count();
        System.out.println(numberOfVaildEmail); //3
      }
}