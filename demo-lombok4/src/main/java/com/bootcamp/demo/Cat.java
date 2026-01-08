package com.bootcamp.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// ! Maven
// ! Step 1: mvn command look for your pom.xml
// ! Step 2: Search .m2 folder, check if the all dependency exists. (If no, download from Internet)
// ! Step 3: Search if any non-java code, convert it to java code first.
// ! Step 4: Compile java file into class file. Create the target folder.
// ! Step 5: Run all the test cases inside the test folder.
// ! Step 6: Package class files into single jar file inside the target folder
// ! Step 7: Put this jar file back to the .m2 folder

// mvn compile: Step 1 - 4 (compile the code in main folder)
// mvn test: Step 1 - 5 (compile the code in test folder, and run the test)
// mvn install: Step 1 - 7

// mvn clean: delete target folder
// mvn clean install: delete target folder and Step 1 - 7

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder // Builder Pattern
@EqualsAndHashCode
@ToString

public class Cat {
  private String name;
  private int age;
  private Gun gun;

  //! Dependency
  // Cat object, depends on Gun, Name, Age
  public Cat(Gun gun, String name, int age){
    this.gun = gun;
    this.name = name;
    this.age = age;
  }
    public Cat(String name, int age){
    this.name = name;
    this.age = age;
  }
  //! Developer A
  //Method A test cases:2
  public int shoot(){ //methodA
    if(this.gun.shoot()) { //methodB
      return 100;
    }
    return -1;
  }

  public void addBullet(){
    this.gun.addBullet();
  }
  public void sleep() {
    System.out.println("Cat is sleeping ...");
  }

  public static int sum(int x, int y) {
    if (x < 0 && y < 0) {
      return 0;
    }
    return x + y;
  }
  public static int methodA(String str, int index){
    if (str==null)
      return -1;
    if(index<0 || index>=str.length())
      return 2;
    return methodB(str, index);
  }
  public static char methodB(String str, int index){
    return str.charAt(index);
  }
  // constructor
  // getter
  // setter

  public static void main(String[] args) {
    Cat c1 = new Cat("Leo", 13);
    System.out.println(c1.getName());
    System.out.println(c1.getAge());
    c1.setAge(10);
    c1.setName("Oscar");
    new Cat();

    Cat c2 = Cat.builder() //
        .name("Leo") //
        .age(13) //
        .build();
    System.out.println(c2.getAge());
    System.out.println(c2.getName());

    Cat c3 = Cat.builder() //
        .name("Leo") //
        .age(13) //
        .build();

    System.out.println(c2.equals(c3)); // true (with @EqualsAndHashCode)
    System.out.println(c2.hashCode()); // 80526 (with @EqualsAndHashCode)
    System.out.println(c3.hashCode()); // 80526 (with @EqualsAndHashCode)

    System.out.println(c2); // Cat(name=Leo, age=13)
  }
}