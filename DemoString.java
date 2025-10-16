public class DemoString {
  public static void main (String [] args) {
    //! String 
    //String Name = "John";
    //String Tutor = "Vincent Lau";
    
    //! String has + operation
    String firstName = "Jennie";
    String lastName = "Wong";
    String fullName = firstName + " " + lastName;

    // short cut : sysout
    System.out.println(fullName);

    String emptyString = "";
    System.out.println(emptyString);

    //! String hsa no - * / operations
    //! For + operation un string, it becomes string no matter what they are

    //! methods (functions)
    // 1.length
    String teacher = "Steven";
    System.out.println(teacher.length());

    //2. isEmpty
    System.out.println(teacher.isEmpty());
    System.out.println(emptyString.isEmpty());
  

    //3. equals
    String s6 = "abc";
    String s7 = "abc";
    String s8 = "abcde";
    System.out.println(s6.equals(s7));

    //4. charAt
    //! Index begins at 0
    System.out.println(s8.charAt(2));
    //System.out.println(s8.charAt(5));//error
    //System.out.println(s8.charAt(-1));//error
   
    // 5. isBlank()
    String s11 = "";
    String s12 = " ";
    String s13 = "Tommy";
    System.out.println(s11.isEmpty()); //true
    System.out.println(s12.isEmpty()); //false
    System.out.println(s13.isEmpty()); //false

    System.out.println(s11.isBlank()); //true
    System.out.println(s12.isBlank()); //true
    System.out.println(s13.isBlank()); //false

    //6. substring()
    String s14 = "Hello World!!";
    //! index = length -1
    System.out.println(s14.substring(6,11)); //world
    System.out.println(s14.substring(3)); //lo World!!

    //7. toLowerCase(), toUpperCase()
    System.out.println(s14.toUpperCase());
    System.out.println(s14.toLowerCase()); 

    // Java -> Type
    //! chain method
    System.out.println(s14.toUpperCase().charAt(1)); //E
    System.out.println(s14.substring(4));

    //8. replace()
    String s17 = "python";
    String s18 = s17.replace("y", "x");
    System.out.println(s18.toUpperCase());

    String s19 = s17.replace("th", "!!!");
    System.out.println(s19);

    //9. contains
    System.out.println(s17.contains("py")); //true
    System.out.println(s17.contains("Py")); //false
    System.out.println(s17.contains("")); //true

    //10. startWith(), endsWith()
    System.out.println(s17.startsWith("pyt")); //true

    System.out.println(s17.endsWith("on")); //true

    //11. index0f()

    System.out.println(s17.indexOf("th")); //2
    System.out.println(s17.indexOf("tha")); // -1
    System.out.println(s17.indexOf('o', 3)); //4
    System.out.println(s17.indexOf('n', 3, 4)); //-1

    // lastIndex0f()
    String s20 = "hello World!!!";
    System.out.println(s20.indexOf('l')); //2
    System.out.println(s20.lastIndexOf('l')); //9
    // lastIndex0f()
    //String s20 = "hello World!!!";
    System.out.println(s20.indexOf('l')); //2
    System.out.println(s20.lastIndexOf('l')); //9

        //12 concat()
    String combined = "abc" + "def";
    System.out.println(combined); //abcdef

    String s21 = "abc".concat("def");
    System.out.println(s21); // abcdef
    System.out.println("abcd".concat("ijk").concat("xzy"));

        //13. equalsIgnoreCase()
    String student1 = "John";
    String student2 = "john";
    System.out.println(student1.equals(student2)); //fasle
    System.out.println(student1.equalsIgnoreCase(student2)); //true

    //14. trim()
    String username = "vincent lau";
    String username2 = "vincent lau";
    System.out.println(username2.trim());

    System.out.println(username2.trim().length()); //10
    System.out.println(username.trim().length()); //10

  //15. compareTo()

  String apple = "apple";
  String banana = "banana";
  System.out.println(apple.compareTo(banana)); //-1
  String cat = "cat";
  System.out.println(cat.compareTo(apple)); //2
  String boy = "boy";
  System.out.println(boy.compareTo(banana)); //14

  }
  
}
