import java.util.Arrays;

//! purpose: String1 vs String (try to simulate design)
public class String1 {
  private char[] value;

    //constructor
  public String1(String str){
    this.value = new char[str.length()];
    int idx = 0;
    for (char c : str.toCharArray()){
      this.value[idx++] = c;
    }
  }

  //length
  public int length(){
    return this.value.length;
  }

  //replace
  public String1 replace(char fromChar, char byChar){
    String str="";
    for (char c : this.value){
      if (c==fromChar){
        str+=byChar;
      } else{
        str+=c;
      }
    }
    return new String1(str);
  }

  //charAt(int index) return char
  public char charAt(int index){
    return this.value[index];
  }

  //substring()
  public String1 substring(int fromIndex, int endIndex){
    String str="";
    for (int i = fromIndex; i <= endIndex;i++);{
      str+=this.value[i];
    }
    return new String1(str);
  }

  //equals(String)
  public boolean equals(String s){
      if (this.value.length != s.length()){
        return false;
        }

      int idx = 0;
        for (char c : s.toCharArray()) {
          if (this.value[idx++]!=c){
            return false;
          }
        }
        return true;
      }
      public char[] getValue(){
        return this.value;
      }

      //! emmbeded toString function
      public String toString(){
        return new String(this.value);
      }

  public static void main(String[] args) {
    String1 s1 = new String1("hello");
    String s2 = "hello";
    String s3 = "helloo";
    String s4 = "hallo";
    System.out.println(s1.equals(s3)); //false
    System.out.println(s1.equals(s2)); //true
    System.out.println(s1.equals(s4));
    System.out.println(Arrays.toString(s1.substring(1, 3).getValue()));
    System.out.println(Arrays.toString(s1.replace('e', 'x').getValue()));

  }

}
