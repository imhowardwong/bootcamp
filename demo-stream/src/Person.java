import java.util.stream.Stream;

public class Person {
  private String name;
  private int age;

  @Override
    public String toString() {
    return "Person(" //
        + "name" + this.name //
        + ",age=" + this.age //
        + ")";
  }
  // First Step
  public static Builder builder() {
    return new Builder();
  }

  // Last Step
  public Person(Builder builder) {
    this.name = builder.name;
    this.age = builder.age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public static class Builder {
    private String name;
    private int age;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Person build() {
      return new Person(this);
    }
  }

  public static void main(String[] args) {
    Person person = Person.builder() //
        .name("John") //
        .age(30) //
        .build();

    Person person2 = Person.builder() //
        .age(30) //
        .build();

    System.out.println(person.getAge() + "," + person.getName());
    System.out.println(person2.getAge() + "," + person2.getName());
  }

  public static Stream<String> stream() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'stream'");
  }

  public static Object contains(String string) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }
}