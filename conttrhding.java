package veer.com;

public class conttrhding {
	
	public static int Countthemacting(String str1,String str2) {
		
		int count =0;
		
		int minlend=Math.min(str1.length(), str2.length());
		for (int i = 0; i <minlend; i++) 
		{
			if (str1.charAt(i)==str2.charAt(i)) {
				
			
			count++;
		}
	}
		
	return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String srString ="abcd";
	String srString2 ="abad";
	System.out.print(Countthemacting(srString, srString2));
	
 
 }
	}

