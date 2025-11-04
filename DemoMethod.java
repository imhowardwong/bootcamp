public class DemoMethod {
  public static void main(String[] args) {
    // method (function)
    int x =10;
    int y = x+3; //function f(x)=y
    //return x + y; 
  

  // ! method caller
  //int result = sum(50, 99);
  //System.out.println("result=" + result); //149

  //-3+99
  //100+20000
  //int result1 = sum(-3, 99);
  //System.out.println("result=" + result1);

  // testing
  System.out.println(totalLength("hello", "Leo")); //8
  System.out.println(valueLength("hello world!")); // true
  System.out.println(totalValue(10));//30
  System.out.println(totalValue(11));//22
  int [] arr = new int [] {100,-4,999,40};
  System.out.println(findMax(arr));//999

  String [] names = new String [] {"Allen", "Steven", "Jennie"};
  System.out.println(findCounts(names));//1
  }
  // ! method
  // 1. sum->method name
  // 2. (int x, int y) -> parameter with type -> parameter, function入口
  // 3. int-> return type (出口類型)
 // public static int sum(int x, int y){
    //int result = x+y;
    //return result;

    //design method: given 2 strings, sum up their length, and return it
    public static int totalLength(String s1, String s2){
      int totalLength = s1.length()+s2.length();
      return totalLength;}
      // return s1.length+s2.length
  

  // design method : given a string value, check if its length >10, return true false
  public static boolean valueLength(String v1){
    // boolean result;
    // if(v1.length() >=10){
    //   result = true;
    // } else {
    //   result = false;
    // }
    // return result;
    return v1.length()>10;
  }

  //design method: given an int value, if odd number, return this number *2;
  // if it is even number, return *3
  public static int totalValue(int m1){
    // int result;
    // if (m1%2==1){
    //    result = (m1*2);
    // } else {
    //   result = (m1*3);
    // }
    // return result;
  return m1%2 == 1? m1*2:m1*3;  //! statement -> true, return m1*2, otherwise m1*3
  }

  //design method, given an int array, find and return the max value
  public static int findMax(int[] arr){
    int max = arr[0];
    for (int i=0; i< arr.length;i++)
    // if (arr[i] > max)
    {
    //   arr[i]=max;
    max = Math.max(arr[i], max);
    }
        return max;
        }

    // design method: given a string array, count the number of string value the counts "ll"
    public static int findCounts(String[] arr){
      // char [] counts = findCounts.toCharArray();
      // for (int i =0; i<counts.length; i++){
      //   if (counts[i].index0f("ll")!=-1);
      // }
      // return counts.toString();
    int count =0;
    for (String s :arr){
      if (s.contains("ll")){
        count++;
      }
    }
    return count;
    }

}


