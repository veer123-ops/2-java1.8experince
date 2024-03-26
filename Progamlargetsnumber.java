package veer.com;

import java.util.Arrays;

import java.util.stream.Collectors;

public class Progamlargetsnumber {
	
	public static String generateString(int [] arr) {
		String larString=Arrays.stream(arr).mapToObj(String::valueOf).sorted((a,b)-> (b+a).compareTo(a+b)).collect(Collectors.joining());
		return larString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int  arr [] = {8,6,0,4,6,4,2,7};
  System.out.print(generateString(arr));
  
  
	}

}
