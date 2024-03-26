package veer.com;



public class Stringopool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String string="Abc";
  String string2="Abc";
  
//  String string3=new String("Abc");
  
  String string3=new String("abc");
  
  System.out.println(string==string);
  
  System.out.println(string==string3);
  
  System.out.println(string.equals(string3));
  
  System.out.println(string.equalsIgnoreCase(string3));
  
	}

}
