public class Movies {
  private String moviesName;
  private double score;
  private int moviesLength;

  public Movies() {
    // this.moviesName = "看我今天怎麼說";
    // this.score = 4.6;
    // this.moviesLength = 132;
  }

  public Movies(String moviesName, double score, int moviesLength){
    this.moviesName = moviesName;
    this.score = score;
    this.moviesLength = moviesLength;
  }
  public String getName(){
    return moviesName;
  }
  public double getScore(){
    return score;
  }
  public int getLength(){
    return moviesLength;
  }

  public static void main(String[] args) {
    Movies m1 = new Movies("看我今天怎麼說", 4.6, 132);
    Movies m2 = new Movies("破地獄", 4.4, 127);
    // m2.moviesName = "破地獄";
    // m2.score = 4.4;
    // m2.moviesLength = 127;
    Movies m3 = new Movies("風林火山", 3.2, 140);
    // m3.moviesName = "風林火山";
    // m3.score = 3.2;
    // m3.moviesLength = 140;

    //  System.out.println("Movies Name is" +" " +m1.getName());
    //  System.out.println("The score is" +" "+ m1.getScore());
    //  System.out.println("The length is" +" " +m1.getLength()+" minutes");
    //  System.out.println("Movies Name is" +" " +m2.moviesName);
    //  System.out.println("The score is" +" "+ m2.score);
    //  System.out.println("The length is" +" " +m2.moviesLength+" minutes");
    //  System.out.println("Movies Name is" +" " +m3.moviesName);
    //  System.out.println("The score is" +" "+ m3.score);
    //  System.out.println("The length is" +" " +m3.moviesLength+" minutes");

    Movies [] movies = new Movies[] {m1,m2,m3};
    System.out.println(m1.getName()+", "+ m1.getScore()+", " +m1.getLength()+"minutes");
    System.out.println(m2.getName()+", "+ m2.getScore()+", " +m2.getLength()+"minutes");
    System.out.println(m3.getName()+", "+ m3.getScore()+", " +m3.getLength()+"minutes");

    // public void anaScore(Movies newScore){
    // int newScore = 0;
    // for (Movies score : this.Movies){
    //    m1[newScore] = score;
    //   newScore++;
    // }
    // }
  }

}

