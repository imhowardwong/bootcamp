import java.util.Arrays;

public class DemoArraySwap {
  public static void main(String[] args) {
    int x = 10;
    int y = 7;

    // swap the value between x and y
    int temp = x; //backup x
    x = y;
    y = temp;
    System.out.println(x);
    System.out.println(y);

    // given int[]
    int[] arr1 = new int[5];
    arr1[0] = 17;
    arr1[1] = 5;
    arr1[2] = -8;
    arr1[3] = 20;
    arr1[4] = 2;

    //sorting in ascending order
    for (int j=0; j<arr1.length-1; j++){
      for (int i =0; i<arr1.length - j - 1; i++){
        if (arr1[i]>arr1[i+1]){
          temp = arr1[i];
          arr1[i] = arr1[i+1];
          arr1[i+1] = temp;
      }
     }
    }
    System.out.println(Arrays.toString(arr1)); // [-8, 2, 5, 17, 20]

    // String swap
    String name = "Steven";
    char [] name2 = name.toCharArray(); // ['S','t',e','v','e','n']
    // nevetS
    char box;
    for (int i =0; i<name2.length/2;i++){
        box = name2[i];
        name2[i]=name2[name2.length-1-i];
        name2[name2.length-1-i]=box;
      } System.out.println(Arrays.toString(name2)); //[n, e, v, e, t, S]
      //! char[]->String
      System.out.println(String.valueOf(name2)); //nevetS
  }
  
}
