package veer.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Emlpoy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<Employye> employyes=new ArrayList<Employye>();
 employyes.add(new Employye(1,29900));
 employyes.add(new Employye(5,9200));
 employyes.add(new Employye(10,2300));
 employyes.add(new Employye(13,6200));
 employyes.add(new Employye(2,2500)); 
 employyes.add(new Employye(3,222200));
 
 // Given an emloyee list sort emloyees based on their salarie is desc order
 // fextch top salaries emloyes details;
 
 // fectch all emloyees having salary less than  3 rd hifhts sLARY
 
 
 
// // Given an emloyee list sort emloyees based on their salarie is desc order
  List<Employye> employyes2= employyes.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).limit(3).collect(Collectors.toList());
  System.out.println(employyes2);
  
 
  //Given an emloyee list sort emloyees based on their salarie is desc order
  List<Employye> employyes3= employyes.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
  System.out.println(employyes3);
	
	//fextch top salaries emloyes details;
	
	
	List<Employye> employyes4= employyes.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).skip(3).  collect(Collectors.toList());
	  System.out.println(employyes4);
}
}