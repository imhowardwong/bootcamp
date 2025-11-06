public class Teacher {
  public static int candyCount =23;

  private Student[] students;
  private Candy [] candys;
  // public Student[] getCandyCount(){
  //   return this.student;
  // }
  public Teacher(){
    this.candys = new Candy[0];
    this.students = new Student[0];
  }
  public void addCandy(Candy newCandy){
    Candy [] newCandys = new Candy[this.candys.length+1];
    int idx = 0;
    for(Candy candys : this.candys){
      newCandys[idx++] = newCandy;
    }
    newCandys[idx]=newCandy;
    this.candys = newCandys;
  }
  public void addStudent(Student newStudent){
    Student[] newStudents = new Student[this.students.length+1];
    int idx = 0;
      for(Student students : this.students){
        newStudents[idx++] = newStudent;
      }
      newStudents[idx] = newStudent;
      this.students = newStudents;
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
