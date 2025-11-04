import java.math.BigDecimal;

public class DemoStringBuilder {
  public static void main(String[] args) {
    String name = "John";
    String [] names = new String[]{"Peter",name,"Sally"};
    
    String result="";
    for (String n1 : names){
      result = result.concat(n1);
    }
    System.out.println(result); //PeterJohnSally

    //StringBuilder
    StringBuilder sb = new StringBuilder();
    sb.append("Hello"); //修改only, not create new value
    sb.append("World");
    System.out.println(sb.toString()); //HelloWorld

    BigDecimal bd = new BigDecimal("3.5");
    bd = bd.add(BigDecimal.TEN);
    System.out.println(bd);

    //! Performance of string concat
    long before = System.currentTimeMillis();
    result = "";
    for (int i =0; i<100_000; i++){
      result+="a"; //create new object
    }
    long after = System.currentTimeMillis();
    System.out.println(after-before); //330ms


    before = System.currentTimeMillis();
    sb = new StringBuilder();
    for (int i =0; i<100_000; i++){
      sb.append("a"); //didnt create new object
  }
    after = System.currentTimeMillis();
    System.out.println(after-before); //2ms

    //! real use case, usually concat 2 string not many
    String url = "https://www.apple.com";
    url = url + "/product";
  System.out.println(url);

  // Literal pool
  String s1 = "hello";
  String s2 = "hello"; //! reuse original string object in string pool
  
  System.out.println(s1==s2); //true
  s1 = new String("hello"); //! force com to create new address
  System.out.println(s1==s2); //false

  s1 = String.valueOf("hello"); //! search string pool first, reuse if contain same value
  System.out.println(s1==s2); //true
}
}
