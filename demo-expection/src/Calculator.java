public class Calculator {

  //! throw -> sth happened, but cant recovered
  public static char firstChar(String str){ //if String as parameter, should consider null, ""
    if (str == null) //able to handle str is null or ""
      //return ' ';
      throw new RuntimeException("The parameter cannot be null");
    else if ("".equals(str))
      throw new RuntimeException("The parameter cannot be empty string");
    return str.charAt(0);
  }

  public static void main(String[] args) {
    // "" -> length 0 array
    String input = "";
    char result = ' ';
    try{
      result = firstChar(input); //if we hit the lines here, skip the rest of lines
      System.out.println("Check point 1...");
      result = firstChar(null);
    } catch (RuntimeException e){ //! Re-cover
      //do something else
        System.out.println("RuntimeException:"+ e.getMessage());
    }
    System.out.println("Check point 2...");
    try{
      result = firstChar(null);
    } catch (RuntimeException e){
      System.out.println("RuntimeException:"+ e.getMessage());
    }
    System.out.println("End of Program");
  }


}
