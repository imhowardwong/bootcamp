import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    // the way to store value : Primitives, Wrapper Class, String (17types)

    // New way to store a set of same type of values
    // new int [4] -> array object
    int [] arr = new int [4];
    // assign value into array
    arr[0] = 100;
    arr [1] = 70;
    arr [2] = 2_100_000_000;
    arr [3] = -200;

    // ! ArrayIndexOutOfBound
    // arr[-1] = -200;
    // arr [4] = -200;

    // for loop
    for (int i=0; i  < 4; i ++) { //0,1,2,3,
      System.out.println(arr[i]);
    }
    // long array, with the length 3
    Long [] arr2 = new Long[3];
    arr2 [0] = 99L;
    arr2 [1] = 5L;
    arr2 [2] = 40L;

    for (int i=0; i<3; i++) {
      if (arr2[i] % 2 == 0) {
        System.out.println(arr2[i]);
      }
    }

    // boolean array
    Boolean [] arr3 = new Boolean[4];
    arr3 [0] = false;
    arr3 [1] = true;
    arr3 [2] = false;
    arr3 [3] = true;
    // for-loop, count false
    int falseCounter = 0;
    for (int i=0; i<4; i++){
      if (arr3[i] == false) {
        falseCounter++;
      }
    }
    System.out.println("False Count=" + falseCounter);

    int [] arr4 = new int[5];
    arr4 [0] = 10;
    arr4 [1] =-4;
    arr4 [2] = 90;
    arr4 [3] = 100;
    arr4 [4] = -20;
    int max = arr4[0];
    int idxMaxValue = 0;
    int min = arr4[0];
    for (int i = 0; i<arr4.length; i ++){
      if (arr4[i]>max){
        max=arr4[i];
        idxMaxValue = i;
      }
      if (arr4[i]<min){
        min = arr4 [i];
      }
    }
        // for loop, find the max value
    System.out.println("Max Value=" + max); //max=100
        //find the index of the max value
    System.out.println("Index of Max Value=" + idxMaxValue); //3
        //find the min
    System.out.println("Min Value=" + min); //-20

    // String []
    String[] names = new String [3];
    names[0] = "John";
    names[1] = "Jennie";
    names[2] = "Steve";

    //for (int i=0; i<names.length; i++){
      //System.out.println(names[i]);
    //}

    // loop: find name startwith J, print their name
    for (int i = 0; i < names.length; i++){
      if (names[i].startsWith("J")) {
        System.out.println(names[i]);
      }
    }

    //loop : find the names with substring "nn"
    for (int i =0; i<names.length; i++){
      if (names[i].indexOf("nn")!=-1) {
        System.out.println(names[i]);
      }
    }

      //charAt
      // loop : find the index of 'e' for each name, put them an array.
      int eCount = 0;
      for (int i = 0; i < names.length; i++){
        for (int j = 0; j < names[i].length(); j++){
          if (names[i].charAt(j)=='e'){
            eCount++;
          }
        } 
      }
      int[] arr10 = new int[eCount];
      int idx = 0;
      for (int i =0; i < names.length; i++){
        for (int j =0; j< names[i].length(); j++){
          if (names[i].charAt(j)=='e'){
            arr10[idx] = j;
            idx++;
          }
        }
      }
      //! print an array -> Arrays.toSting()
      System.out.println(Arrays.toString(arr10));

      // Search + count
      String n1 = "Mandy";
      // count the number of 'd'
      int dCount = 0;
      for (int i = 0; i<n1.length(); i++){
        if (n1.charAt(i)== 'd'){
          dCount++;
        }
      }
      System.out.println(dCount); //1
  }
  
}
