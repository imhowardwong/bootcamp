public class Football {
  private String clubs;
  private int points;
  private String playerName;

  public Football (String clubs, int points, String playerName){
    this.clubs = clubs;
    this.points = points;
    this.playerName = playerName;
  }
    public String getClubs(){
      return this.clubs;
    }
   public int getPoints(){
    return this.points;
   } 
   public String getPlayersName(){
    return this.playerName;
   }
   public void setClubs(String clubs){
    this.clubs = clubs;
   }
    public void setName(String name){
    this.playerName = name;
   }
}
