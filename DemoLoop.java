import java.util.Scanner;

public class DemoLoop {
  public static void main(String[] args) {    // flow -> if-else
    // loop (for-loop, while)

     int x = 3;
     x *= 3;
     x *= 3;
     //System.out.println(x);
     
     //for-loop
     // (initialization; continue criteria; modifier)
     for (int i = 0; i < 5; i ++){ //5times
      System.out.println("Hello");

      //Step 1: int i = 0
      //Step 2: i<3? Yes
      //Step 3: print Hello
      //Step 4: i++ (i=1)
      //Step 5: i<3? Yes
      //Step 6: print Hello
      //Step 7: i++ (i=2)
      //Step 8: i<3? Yes
      //Step 9: print Hello
      //Step 10: i++ (i=3)
      //Step 11: i<3? No
      //Step 12: Exit loop

     }
     // loop -> 0,1,2,3,4,5 -> total 15
     int total = 0;
     for (int i = 0; i < 6; i ++){
      total = total + i; //total += i
     }
     System.out.println("total=" + total);

     //for loop + if(1-10, print odd nunber)
     for (int i = 0; i < 11; i++){
      if (i%2 == 1) {
        System.out.println(i);
      }
     }
     // sum up all even numbers between 0-20
     int even = 0;
     for (int i = 0; i < 21; i ++) {
      if (i % 2 == 0) {
        even += i;
      }
      System.out.println(even); //110
     }
     // 0-100, sum all divided by 3
     int sum = 0;
     for (int t = 0; t < 101; t++) {
      if (t % 3 == 0){
        sum += t;
      }
    }
      System.out.println(sum); //1683
     
      // 0-50, the different between the sum of all even and all the odd
      int evenNumber = 0;
      int oddNumber = 0;
      for (int i = 0; i < 51; i++) {
        if (i % 2 == 1){
          oddNumber += i;
        } else {
          evenNumber += i;
        }
        }
        int evenOddDiff = evenNumber - oddNumber;
        System.out.println(evenOddDiff); //25

        //0-20, sum up all even, 21-50, sum up all odd
        // find the product of both total number
        int evenSum  = 0;
        int oddSum = 0;
        for(int i = 0; i < 51; i++) {
          if (i <= 20 ){
            if (i % 2 ==0){ //non-business meaning (the number of times)
              evenSum += i;
              }
            } else if (i >= 21 && i <= 50) {
              if (i % 2 ==1){
                oddSum += i;
              }
            }
          } //business meaning, explict numbers aligns the requirements
          
        System.out.println(evenSum*oddSum); //57750

    // Loop + if + break/continue
    // 1. break
    // searching
    String[] names = new String[] {"John","Peter","Sally","Vincent","Steven"}; //fixed length = 5
    // find the first name that length > 5
    String targetName = null;
    for (int i = 0; i < names.length; i++){
      if (names[i].length()>5){
        targetName = names[i];
        break; // break the loop
      }
    }
    System.out.println(targetName);


          // Scanner
          //Scanner s = new Scanner(system.in);
          //System.out.println("Please input an integer:");




  
    }

}

  

