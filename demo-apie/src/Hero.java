public abstract class Hero {
  private static final int [][] PA = new int[3][0];
  private static final int [][] PD = new int[3][0];
  private static final int [][] MAX_HP = new int[3][0];
  public static final int WARRIOR = 0;
  public static final int ARCHER = 1;
  public static final int MAGE = 2;

  //! static block
  // execute static block once when there is a static variable
  static{
    PA[0] = new int[]{2,4,6,8,10,12,14,16,18,20};
    PA[1] = new int[]{2,4,6,8,10,12,14,16,18,20};
    PA[2] = new int[]{2,4,6,8,10,12,14,16,18,20};

    PD[0] = new int[]{1,2,3,4,5,6,7,8,9,10};
    PD[1] = new int[]{1,2,3,4,5,6,7,8,9,10};
    PD[2] = new int[]{1,2,3,4,5,6,7,8,9,10};

    MAX_HP[0] = new int[]{20,40,60,80,100,120,140,160,180,200};
    MAX_HP[1] = new int[]{20,40,60,80,100,120,140,160,180,200};
    MAX_HP[2] = new int[]{20,40,60,80,100,120,140,160,180,200};
  }
  public static int getPA(int role, int level){
    return PA[role][level-1];
  }
    public static int getPD(int role, int level){
    return PA[role][level-1];
  }
    public static int getMaxHp(int role, int level){
    return PA[role][level-1];
  }
    private int level;
    private int hp;
    private int mp;

    public Hero(){
      this.level = 1;
    }
    public void deductHp(int hp){
      this.hp -= hp;
    }
    public void levelUp(){
      this.level++;
    }
    public void setHp(int hp){
      this.hp=hp;
    }
    public int getLevel(){
      return this.level;
    }
    public abstract int getPD();
    public abstract void attack(Hero hero);

    public int getHp(){
      return this.hp;
    }
}

