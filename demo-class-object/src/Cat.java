// ! Class -> blueprint(模), file (harddisk)
// ! Object
public class Cat {
  // ! Attribute - unlimited
  private String name;
  private int age;

  //! contructor

  //! Empty constructor (No Parameter)
  public Cat(){
    System.out.println("Creating a cat...");
    //default name and age
    this.name = "John"; //this = 第一人稱
    this.age=10;
  }

  //! All Arguments constructor
  public Cat(String name, int age){
    this.name = name;
    this.age = age;
  }

  //! Instance Method
  public String getName(){
    return this.name;
  }

  //! Instance Method
  public int getAge(){
    return this.age;
  }

  public static void main(String[] args) {
    //! Create a cat object
    // "new" -> create
    // "Cat()" -> calling a constructor
    // "new Cat()" -> creating the cat object

    // c1 = location
    // c1 is a label to refer the cat object
    Cat c1 = new Cat();
    System.out.println(c1.name); //John
    System.out.println(c1.age); //10

    new Cat(); // ! you no longer able to find the cat object, after created it
    Cat c2 = new Cat();
    c2.name = "Jennie";
    c2.age = 15;

    Cat[] cats = new Cat[]{c1, c2};
    System.out.println(cats[1].name); //Jennie
    System.out.println(cats[1].age); //15

    //! Without class
    String [] names = new String[] {"John", "Jennie"}; //excel column
    int [] age = new int[] {10,12}; //excel column
    //! excel row -> object

    Cat c3 = new Cat("Mary", 8);
    Cat c4 = new Cat("Tom", 10);
    System.out.println(c3.getAge()); //8
    System.out.println(c3.getName()); // Mary
  }
}
