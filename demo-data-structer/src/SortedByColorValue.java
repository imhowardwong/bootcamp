import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedByColorValue implements Comparator<Ball> {
  // Yellow -> Red -> Blue
  // if same color, higher value go first
  @Override
  public int compare(Ball b1, Ball b2){
    if (b1.getColor() == b2.getColor()){
      if(b1.getValue() > b2.getValue())
        return -1;
      else
          return 1;
    } else {
    if (b1.getColor() == Ball.Color.YELLOW)
      return -1;
    if (b2.getColor() == Ball.Color.YELLOW)
      return 1;
    if (b1.getColor() == Ball.Color.RED)
    return -1;
  if (b2.getColor() == Ball.Color.RED)
    return 1;
  return -1;
    }
  }
  public static void main(String[] args) {
    Ball b1 = new Ball(Ball.Color.RED, 10);
    Ball b2 = new Ball(Ball.Color.RED, 30);
    Ball b3 = new Ball(Ball.Color.YELLOW, 20);
    Ball b4 = new Ball(Ball.Color.YELLOW, 70);
    Ball b5 = new Ball(Ball.Color.BLUE, 8);
    Ball b6 = new Ball(Ball.Color.BLUE, -1);
    ArrayList<Ball> balls = new ArrayList<>(List.of(b1,b2,b3,b4,b5,b6));
    Collections.sort(balls, new SortedByColorValue());
    System.out.println(balls);
  }
}