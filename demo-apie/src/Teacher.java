public class Teacher {
  public static int candyCount =23;

  private Student[] student;

  public Student[] getCandyCount(){
    return this.student;
  }
  public static void main(String[] args) {
    //OOP
    //5 studnets, 23candy
    //55544


    //!bonus
    //without using static candyCount, we use Teacher obj to hold 23candy
    //candy obj with color, distribute to 5 students

    //ans:techer has no candy, each student has his own candy with different color
    
  }
}
