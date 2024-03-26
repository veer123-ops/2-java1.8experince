package veer.com;

import java.util.HashMap;
import java.util.Map;



public class Countoffrequnry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String string ="vedfghj";
   
   char [] x= string.toCharArray();
   
   HashMap<Character,Integer> mpHashMap =new HashMap<>();
   
   for(char val : x) {
	   mpHashMap.put(val, mpHashMap.getOrDefault(val, 0)+1);
   }
   for(Map.Entry<Character, Integer> entry:mpHashMap.entrySet()) {
	   System.out.println(entry.getValue() +"===" + entry.getKey());
   }
	}

}
