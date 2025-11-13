import java.util.Arrays;
import java.util.Random;

public class Teacher {
  public static int candyCount = 23;

  // Bonus quest
  private static final String[] CANDY_COLOR =
      new String[] {"RED", "BLUE", "YELLOW"};
  private Candy[] candies;

  public Teacher(int candyCount){
    this.candies = new Candy [candyCount];
    for(int i =0; i<this.candies.length; i++){
      String randomColor =  CANDY_COLOR[new Random().nextInt(3)];
      this.candies[i] = new Candy(randomColor);
      }
    }
    
    public void distributeAll(Student[] students){
      int candyIdx = 0;
      while (candyIdx < this.candies.length){
        for (Student student : students){
          Candy candy = this.candies[candyIdx];
          this.distribute(student, candy);
          if (++candyCount >=this.candies.length){
            break;
          }
        }
      }
      this.candies = new Candy[0];
    }

    public void distribute(Student student, Candy candy){
      student.receiveCandy(candy);
    }

  public static void main(String[] args) {
    // OOP
    // 5 studnets, 23candy
    // 55544
    Student[] students = new Student[] {new Student(), new Student(),
        new Student(), new Student(), new Student()};
    while (candyCount > 0) {
      for (int i = 0; i < students.length; i++) {
        if (candyCount-- <= 0) {
          break;
        }
        students[i].addCandy();
      }
      System.out.println(students[0].getCandyCount());
      System.out.println(students[1].getCandyCount());
      System.out.println(students[2].getCandyCount());
      System.out.println(students[3].getCandyCount());
      System.out.println(students[4].getCandyCount());
    }



    // !bonus
    // without using static candyCount, we use Teacher obj to hold 23candy
    // candy obj with color, distribute to 5 students

    // ! Candy.java (color), Tecaher (Candy), Student(Candy)
    // Candy(Ownership)
    // ans:techer has no candy, each student has his own candy with different color
    Student[] student2 = new Student[]{new Student(), new Student(), new Student(), new Student()};
    Teacher t1 = new Teacher(37);
    t1.distributeAll(student2);
    System.out.println(Arrays.toString(student2[0].getCandies()));
    System.out.println(Arrays.toString(student2[1].getCandies()));
    System.out.println(Arrays.toString(student2[2].getCandies()));
    System.out.println(Arrays.toString(student2[3].getCandies()));
  }
}
