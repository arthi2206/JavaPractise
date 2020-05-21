import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RetrivefromMap {

	public static void main(String[] args) {
//		 Write a Java Program to print the keys and values from the Map
//		 map = {A=1, B=2, C=3, D=4, E=5}
//		 (Min 3 ways)
//		 Note: Even if you google understand what you are doing!

		Map<Character,Integer> m=new HashMap<Character,Integer>();
		m.put('A',1);
		m.put('B',2);
		m.put('C',3);
		m.put('D',4);
		m.put('E',5);
		//type 1
		System.out.println("printing m");
		System.out.println(m);
		System.out.println("");
		
		//type 2
		System.out.println("Using Iterator");
		Iterator<Entry<Character,Integer>> i=m.entrySet().iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		//type 3
		for (Character key :m.keySet()) {
			
			System.out.println(key);
		}
			
		}


}
