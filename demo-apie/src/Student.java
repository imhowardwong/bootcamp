public class Student {
  //! static variable(靜態變量)
  //!live in other space of variable
  public static int counter = 0;
  //!instance variable
  private String name;
  private int id;

  public Student (String name){
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

  public static void main(String[] args) {
    Student s1 = new Student ("John");
    Student s2 = new Student("Steven");
    System.out.println(s1.getId()); //1
    System.out.println(s2.getId());  //2
  }
}
