package veer.com;

import java.util.Scanner;

public class partte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
		
		
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
System.out.println();
	}
		 
		
		for(int i=(n-1);i>=1;i--) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
		
		
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
System.out.println();

	}

	
	
	}}
