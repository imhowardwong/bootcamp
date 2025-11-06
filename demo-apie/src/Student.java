import java.time.LocalDate;

public class Student extends Human {
  //! static variable(靜態變量)
  //!live in other space of variable
  public static int counter = 0;
  //!instance variable
  private String name;
  private int id;

  public Student(String name){
    this.id=++counter;
    this.name = name;
  }
  public int getId(){
    return this.id;
  }
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name = name;
  }

  //! by default for Inheriteance, child class(Student) dont ned to reqrite parent method
  @Override //重寫/覆蓋
  public double getHeight(){
    System.out.println("Student's getHeight");
    return super.getHeight()/100.0;  //Super call for Human
  }

  public LocalDate getParentDob(){  //DOB at public, thats why no need getter, can call directly
    return super.dateOfBirth;   //Parent Container exposed
  }
  public static void main(String[] args) {
    Student s1 = new Student ("John");
    Student s2 = new Student("Steven");
    System.out.println(s1.getId()); //1
    System.out.println(s2.getId());  //2
  }
}
