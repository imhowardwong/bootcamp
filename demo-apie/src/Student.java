import java.time.LocalDate;

public class Student extends Human implements Eatbale {
  //! static variable(靜態變量)
  //!live in other space of variable
  public static int counter = 0;
  //!instance variable
  private String name;
  private int id;
  private int candyCount;
  private Candy[] candies;

    
  public Student(){
    this.id=++counter;
    this.candyCount = 0;
  }
  
  public Student(String name){
    this.id=++counter;
    this.name = name;
    this.candyCount = 0;
  }
  public Candy[] getCandies(){
    return this.candies;
  }
  public int getId(){
    return this.id;
  }
  public String getName(){
    return this.name;
  }
    public int getCandyCount(){
    return this.candyCount;
  }
  public void setName(String name){
    this.name = name;
  }
  public void addCandy(){
    this.candyCount++;
  }
    public void receiveCandy(Candy newCandy){
    Candy newCandies[]= new Candy[this.candies.length+1];
    int idx = 0;
    for (int i =0; i<this.candies.length+1; i++){
      newCandies[idx++] = this.candies[i];
      }
      newCandies[idx] = newCandy;
      this.candies = newCandies;
    }
  
  //! by default for Inheriteance, child class(Student) dont ned to reqrite parent method
  @Override //重寫/覆蓋
  public double getHeight(){
    System.out.println("Student's getHeight");
    return super.getHeight()/100.0;  //Super call for Human
  }
    @Override
    public void eat(){
    System.out.println("Student is eating...");
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
