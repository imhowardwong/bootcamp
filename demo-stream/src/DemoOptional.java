import java.util.Optional;

public class DemoOptional {
  //! Method Author : use Optional to present "Not Found"
  //! Optional method user : use isPresent, ifPresent() to check if the value exists
  //! Optional only on return type
  public static void main(String[] args) {
    Integer[] ages = new Integer[]{100,-40,90};
    Optional<Integer> maxAge = findMaxNumber(ages);
    //! check the value is exists, then use get() directly
    if (maxAge.isPresent()){
      System.out.println("Max age="+maxAge.get());
    } else {
      System.out.println("Not Found.");
    }

    if (!maxAge.isPresent()){
    }

    //Lambda
    maxAge.ifPresent(e->{
      System.out.println("max age="+e);
    });
    // Find food, search db, if found, return Optional<Food>, if not Optional.empty
  }

  //Searching
  //! after using optional design for the method, we dont need to return null anymore
  public static Optional<Integer> findMaxNumber(Integer[]numbers){
    if (numbers==null)
      throw new IllegalArgumentException("numbers should not be null");
    if (numbers.length == 0)
      return Optional.empty();
    int max = numbers[0];
    for(int i =0; i<numbers.length; i++){
      if (numbers[i]>max)
        max=numbers[i];
    }
    return Optional.of(max);
  }
}
