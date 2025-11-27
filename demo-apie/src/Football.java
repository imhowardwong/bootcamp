public class Football {
  private String club;
  private String playerName;
  private int value;

  public Football(String club, String playerName, int value){
    this.club = club;
    this.playerName = playerName;
    this.value = value;
  }
  public String getClub(){
    return this.club;
  }
    @Override
  public String toString(){
    return "Bird(" //
    + "name=" + this.club//
    +"age" + this.value//
    + ")";
  }
  @Override
  public boolean equals(Object f){
    if (this == f){
      return true;
    }
    if(!(f instanceof Football)){
      return false;
    }
    Football football = (Football) f;
    return this.club.equals(Football.getClub());
  }
  @Override
  public int hashCode(){
    return Football.hash(this.club, this.value);
  }

}
