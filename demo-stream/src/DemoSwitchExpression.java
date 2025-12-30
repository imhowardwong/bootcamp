public class DemoSwitchExpression {
  public static void main(String[] args) {
    // Switch (Java 1.0)
    // Disadvantages : 1)No range check, 2) break proactively
    char grade = 'B';
    switch (grade) {
      case 'A':
        System.out.println("Do something for grade A.");
        break;
      case 'B':
        System.out.println("Do something for grade B.");
        break;
      case 'C':
        System.out.println("Do something for grade C.");
        break;
      default: // else
        System.out.println("Do something for other grade ...");
    }

    // not good for number checking, because does not support range check
    int score = 80;
    char examGrade = ' ';
    // ! just like void method, from top to bottom, no return value
    switch (score) {
      case 80:
        examGrade = 'B';
        break;
      case 81:
        examGrade = 'B';
        break;
      default:
        break;
    }


    // Java 14 : Switch Expression
    Color[] colors =
        new Color[] {Color.Red, Color.Yellow, Color.Red, Color.Blue};
    int sum = 0;
    for (Color color : colors) {
      // color - int
      // sum
      // ! 1. enum + switch expression. Java helps check if all enum value has been considered.
      // ! 2. simple logic
      // ! 3. support return value or void method
      int value = switch (color) {
        case Red -> 7;
        case Yellow -> 9;
        case Blue -> 15;
        case Orange -> 20;
      };
      sum += value;
    }
    System.out.println(sum); // 38

    // Convert String
    String day = "Tuesday";
    // ! Force to use default, when you apply String for Switch expression
    // ! use "," for "OR" cases
    String dayDescription = switch (day) {
      case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
      case "Saturday", "Sunday" -> "Weekend";
      default -> "Unknown";
    };
    System.out.println("Day Description= " + dayDescription);

    // ! if the lambda logic contain one line of code, use '->' without yield
    //! if more than one line use "yield"
    //"yield" like return, but "yield" can be used in switch only
    Direction d1 = Direction.WEST;
    int value = switch (d1) {
      case EAST:
        yield 10;
      case SOUTH:
        yield 20;
      case WEST:
        yield 30;
      case NORTH:
        yield 40;
    };
  }

  public static int convertDirection(Direction direction){
    int value = switch (direction) {
      case EAST:
        yield 10;
      case SOUTH:
        yield 20;
      case WEST:
        yield 30;
      case NORTH:
        yield 40;
    };
    return value;
  }

  public static enum Direction {
    EAST, SOUTH, WEST, NORTH,;
  }
  public static enum Color {
    Red, Yellow, Blue, Orange;
  }
}
