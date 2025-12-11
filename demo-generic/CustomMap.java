import java.util.ArrayList;
import java.util.HashMap;

//! Generic supports multiple Type Definitions
//Entry
public class CustomMap<K,V> {
  private ArrayList<CustomEntry<K, V>> entries ;

 
 public CustomMap(){
  this.entries = new ArrayList<>();
 }
 public void put(K key, V value){
  this.entries.add(new CustomEntry<>(key, value));
 }
 //get(K key)
 public V get(K key){
  if (key==null)
    return null;
  for (CustomEntry<K, V> entry : this.entries){
    if (entry.getKey().equals(key))
      return entry.getValue();
  }
  return null;
 }
 //containsKey()
 //containsValue()
 //size()
 //isEmpty()

 public static void main(String[] args) {
  HashMap<String, String> map1 = new HashMap<>();
  map1.put("banana", "john");
 }
}



