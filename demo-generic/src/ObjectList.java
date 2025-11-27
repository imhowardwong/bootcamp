public class ObjectList {
  private T[] objects;

  public ObjectList(){
    objects = (T[]) new Object[0];
  }
  public void add(T Obection){}

  public static void main(String[] args) {
    //! ArrayList.class
    ObjectList<String> strings = new ObjectList<>();
  }
}
