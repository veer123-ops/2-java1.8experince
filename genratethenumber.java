package veer.com;

import java.util.Arrays;

public class genratethenumber {
	
	public static String genStringtthelast(int arr []) {
		String [] strings = new String [arr.length];
		
		for(int i=0;i<arr.length;i++) {
			strings[i]=String.valueOf(arr[i]);
		}
		
		Arrays.sort(strings ,(a,b)-> (b+a).compareTo(a+b));
		StringBuilder resBuilder=new StringBuilder();
		
		for(String string1:strings) {
			resBuilder.append(string1);
		}
		return resBuilder.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[] = {1,2,5,8,9,3,6};
    System.out.print(genStringtthelast(arr));
    
	}

}
