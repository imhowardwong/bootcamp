//! Wrong usages for optional

import java.util.Optional;

public class DemoOptional2 {
  
  public static void main(String[] args) {
    // sum(null, null) //! still having problem for passing null value
    int x = 23;
    int y = 40;
    sum(Optional.of(x), Optional.of(y)); //! method user contruct optional object before using the method (not good)
    System.out.println(sum2(3, 2)); //5
  }

  //! what if someone passes null as parameter to call method?
  //null check -> throw(ok)
    public static int sum(Optional<Integer> x, Optional<Integer> y){ //! Only Primitive avoid null check
    if(x.isPresent() && y.isPresent()){ //! what if x or y are null
      return x.get() + y.get();
    }
      return 0;
  }

  //! correct
  public static int sum2(Integer x, Integer y){
    if (x==null || y==null)
      throw new IllegalArgumentException("x and y should not be null.");
    return x+y;
  }
}
