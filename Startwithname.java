package veer.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Startwithname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /* String srString []= {"veer","raja","ram","good"};
  
  for(int i=0;i<srString.length;i++) {
	  if (srString[i].startsWith("r")) {
		
		  System.out.print(srString[i]  + "  ");
	}
  }*/
		
		// second number
		
		List<String> nuIntegers = Arrays.asList("veer","manh","aap","ppaa","aab","am","App");
		List<String> nmuList = nuIntegers.stream().filter(nuIntegerss -> nuIntegerss.startsWith("a") || 
				nuIntegerss.startsWith("A")).collect(Collectors.toList());
		System.out.print(nmuList);
		
	}

}
