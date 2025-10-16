public class DemoOperator {
  public static void main(String[] args) {
    // ++, --
    int x =3;
    x++;
    System.out.println(x); // 4
    x +=1; //x=x+1
    System.out.println(x); //5
    x =x+1;
    System.out.println(x); //6
    // +=, -= *=, /=
    int y =8;
    y+=2;
    System.out.println(y); //10
    y-=3;
    System.out.println(y); //7
    y*=3;
    System.out.println(y); //21
    y/=3;
    System.out.println(y); //7

    double z = 250;
    z/=4;
    System.out.println(z);

    //% -> remainder
    int r = 10 % 3;
    System.out.println(r); //1

    //++ -- (per,post)
    int k =6;
    int a1 = ++k + 3;//k+1 -> +3 -> assign
    System.out.println(a1); //10
    System.out.println(k); //7

    int j =6;
    int a2 = j++ +3; //j+3 -> assing -> j+1
    System.out.println(a2); //9
    System.out.println(j); //7

    //note example
    int h =3;
    int m = (h++ +3) * h++;
    System.out.println(m); //24
    // h+3 -> 6
    //h++ -> h = 4
    // 6*4 -> m = 24
    // h++ -> h = 5

    
  }
  
}
