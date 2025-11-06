import java.time.LocalDate;

public class Human { //!abstract lost new function
  private double weight; //if wrapped class -> object, can be null
  private double height; //primitives value (default value 0.0)

  public LocalDate dateOfBirth;

    public Human(double weight, double height){
    this.weight= weight;
    this.height = height;
  }
  public Human(double weight, double height, LocalDate dateOfBirth){
    this.weight= weight;
    this.height = height;
    this.dateOfBirth = dateOfBirth;
  }

public Human(){
}
  public double getWeight(){
    return this.weight;
  }
  public double getHeight(){
    return this.height;
  }
  public LocalDate getDateOfBirth(){
    return this.dateOfBirth;
  }
    public void setHeight(double height){
    this.height = height;
  }
    public void setWeight(double weight){
    this.weight = weight;
  }

  public static void main(String[] args) {
    Human h1 = new Human(73, 176.0);
    Human h2 = new Human();

    Student s1= new Student("John");
    s1.setHeight(180);
    s1.setWeight(72.5);
    s1.setName("Jennie");
    System.out.println(s1.getName());
    System.out.println(s1.getHeight());
    System.out.println(s1.getWeight());

    Human h3 = new Human(78, 181, LocalDate.of(1999, 10, 31));
    System.out.println(h3.getDateOfBirth().getMonthValue());

    LocalDate ld1 = LocalDate.of(2000, 1, 31);
    System.out.println(ld1.plusWeeks(2L)); //2000-02-14
    System.out.println(ld1.minusDays(90)); //1999-11-02
    System.out.println(ld1.isLeapYear()); //true
    //! Most of the class design wont revise itself value, create new value (i.e. LocalDate, BigDecimal, String)
    //!But StringBuilder, StringBuffer will not new, revise themselve (i.e. sb.append("a"))
  }
}
