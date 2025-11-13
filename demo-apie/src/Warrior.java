public class Warrior extends Hero {

  public Warrior(){
    super();
  }
      public int getPD(){
      return Hero.getPD(Hero.WARRIOR, super.getLevel());
    }
      public void attack(Hero hero){
      int hpTobeDeducted = Hero.getPA(Hero.WARRIOR, super.getLevel()) - hero.getPD();
      hero.deductHp(hpTobeDeducted);
    }
  @Override
  public void levelUp(){
    super.levelUp();
    int maxHp = Hero.getMaxHp(Hero.WARRIOR, getLevel());
    super.setHp(maxHp); 
    }


  public static void main(String[] args) {
System.out.println(Hero.getPA(Hero.WARRIOR, 7));
  
        //Testing
  Warrior w1 = new Warrior();
  w1.levelUp();

  Warrior w2 = new Warrior();
  w2.levelUp();
  w2.levelUp();

  System.out.println(w1.getHp());
  w2.attack(w1);
  System.out.println(w1.getHp());
}

}