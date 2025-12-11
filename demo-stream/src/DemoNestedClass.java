public class DemoNestedClass {
  private int x;

  public DemoNestedClass(int x) {
    this.x = x;
  }

  public DemoNestedClass() {

  }

  public int sum(int x, int y) {
    class Person {
      private int age;
      public Person(int age) {
        this.age = age;
      }
      public int getAge() {
        return this.age;
      }
    }
    Person p1 = new Person(x + y);
    return p1.getAge();
  }

  public class Dog {
    private int age;

    public Dog(int age) {
      this.age = age;
    }

    public void bark() {
      System.out.println(this.age + ", " + x);
    }
  }

  public static class Cat {
    private String name;

    public Cat(String name) {
      this.name = name;
    }
  }

  public static void main(String[] args) throws Exception {
    // Static Nested Class
    new DemoNestedClass.Cat("John");

    // Inner Class
    new DemoNestedClass().new Dog(10);
    // new Dog(10);
    DemoNestedClass dnc = new DemoNestedClass();
    dnc.new Dog(10);

    new DemoNestedClass(500).new Dog(40).bark();

  }
}