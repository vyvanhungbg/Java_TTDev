package HashMap;

import java.util.HashMap;

public class HashMapDemo {
	static  HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashMap.put(1, "A");
		hashMap.put(2, "B");
		hashMap.put(3, "C");
		hashMap.put(4, "D");
		for(Integer key : hashMap.keySet()) {
			System.out.println(key + "\t" + hashMap.get(key));
			
		}
	}
	

}
