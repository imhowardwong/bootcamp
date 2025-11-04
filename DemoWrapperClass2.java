public class DemoWrapperClass2 {
  public static void main(String[] args) {
    // ! dont usd == for wrapper class
    // ! -128 to 127 -> cache
    Integer i10 = Integer.valueOf(127);
    Integer i11 = Integer.valueOf(127);
    System.out.println(i10 == i11); // true
    System.out.println(i10.equals(i11)); //true

    Integer i12 = Integer.valueOf(128);
    Integer i13 = Integer.valueOf(128);
    System.out.println(i12 == i13); // false
    System.out.println(i12.equals(i13)); //true
    System.out.println(i12.compareTo(i13)); //0

    // Short, Byte, Long
    Long l10 = Long.valueOf(128);
    Long l11 = Long.valueOf(128);
    System.out.println(l10==l11);

    Boolean b10 = true;
    Boolean b11 = new Boolean(true);
    Boolean b12 = Boolean.valueOf(true);
    Boolean b13 = Boolean.valueOf(true);
    System.out.println(b12 == b13); //true
    System.out.println(b12 == b11); //false
    System.out.println(b12.equals(b11)); //true
  }
  
}
