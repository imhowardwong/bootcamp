public class DemoStatic {
  //static variable
  public static String content = "";

  //! final variable
  public final String https = "https";

  //! static final variable (常數)
  // naming convnetion: snake case + capital letter
  public static final int HOUR_PER_DAY = 24;

  //! Object's method can access static variable & method
  //! static method CANNOT access objects 
  private int x;
  private int y;

  public DemoStatic (int x, int y){
    this.x = x;
    this.y = y;
  }

  public DemoStatic(){
  }
  public static void main(String[] args) {
    // Call static variable
    content +="abc";
    content+="def";
    System.out.println(content); //abcdef
    //formally call static variable
    System.out.println(DemoStatic.content); //abcdef

    //!call ststic medthod
    System.out.println(DemoStatic.sum(10, 3)); //13

    //!call instance method
    DemoStatic ds = new DemoStatic();
    System.out.println(ds.subtract(10, 3)); //7

    //!call instance method
    DemoStatic ds2 = new DemoStatic(10,3);
    System.out.println(ds2.multipy()); //30

    //! call final variable
    DemoStatic ds3= new DemoStatic();
    System.out.println(ds3.https); //https
    //final variable cannot be re-assigned

    System.out.println(DemoStatic.HOUR_PER_DAY);
  }

  
  public static int sum(int x, int y){
    // return x+y + this.x; //! static method doesn't make sense to call "this"
    //! because static method belongs Class, but not object
    return x+y;
  }

    public int subtract(int x, int y){
    return x-y;
  }

  public int multipy(){
    return this.x * this.y;
  }
}
