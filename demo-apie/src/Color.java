//! enum is a more powerful class
//1. you cannot create enum by yourself
//2. all enum value  exists in memory without object reference
public enum Color {
  RED('R'), //calling constructor
  YELLOW('Y'), 
  WHITE('W');

  private char initial;
//! constructor (private for enum constructor)
  private Color(char initial){
    this.initial = initial;
  }
  public char getInitial(){
    return this.initial;
  }

  //search enum value by attribute (char)
  //! Color.values() implicitly exists in enum.class
  public static Color valueOf(char initial){
    for (Color color : values()){
      if(color.getInitial()==initial){
        return color;
      }
    }
    return null;
  }

  // Enum example in real world:
  //1. Monday, Tuesday...
  //2. North, West...
  //3. Diamond, Club...
  //4. Mr., Mrs...
  //5. Occupation... (drop down list)
  //6. HK, Kowloon, N.T.

  //Definition of Enum
  //1. Has to be finite values
  //2. Not add/remove often


}
