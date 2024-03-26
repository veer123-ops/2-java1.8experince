package veer.com;

import java.util.Arrays;

public class Sumemlentsusingjee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {1,2,3,4};
   
 //  int sum=0;
   
   /*for(int i=0;i<arr.length;i++) {
	   sum=sum+arr[i];
   }
   System.out.print(sum);*/
   
   
   
   int sum= Arrays.stream(arr).sum();
   System.out.print(sum);
	}

}
