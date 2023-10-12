package Std;
import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashMap <Integer,String> map=new HashMap<Integer,String>();
   map.put(11,"rahul");
   map.put(12,"kishor");
   map.put(13,"vicky");
   map.put(14,"Arul");
   map.put(null, null);
   for(Map.Entry m:map.entrySet()) {
   System.out.println(m.getKey()+" "+m.getValue());
   }
	}

}
