public class DemoFrunitureSystem {
  //! Advantages of Factory pattern:
  // 1. When you have new type, no need revise the existing 
  //(Open-close coding pattern)
  // 2. main logic can be isloated (de-coupling)
  // 3. Attribute -> Class
  public static void main(String[] args) {
  Furniture.Style style = Furniture.Style.MODERN;
  int furnitureType = 1; //1-> chair, 2-> sofa
  
  FurnitureFactory factory = FurnitureFactory.create(style); // Modern 
  Furniture furniture = Furniture.create(furnitureType, factory); //type of furniture
  System.out.println(furniture.hasLegs());
 } 
}
