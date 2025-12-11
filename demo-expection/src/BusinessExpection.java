//! if a class extending Expection/ RuntimeExpection, can throw expection object

//!"Checked Expection"-> a class extend Expection
//!"Unchecked Expection" -> a class extends RuntimeExpection
public class BusinessExpection extends RuntimeException {
  // code + message
  //1. 47893 -> Customer Not Found
  private int code;
  public BusinessExpection(SysError sysError){
    super(sysError.getMessage());
  }
  public static void main(String[] args) {
    new RuntimeException("abc");
    throw new BusinessExpection(SysError.CUSTOMER_NOT_FOUND);
  }
}
