package veer.com;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Emloyyes {

public static void main(String[] args) {
// TODO Auto-generated method stub
	ArrayList<Emylooyess> emp = new ArrayList<>();
	emp.add(new Emylooyess(45,"veer",345478,"M","IT",2452, 2003));
	emp.add(new Emylooyess(45,"neer",345878,"F","HR",2452, 2003));
	emp.add(new Emylooyess(45,"veer",348578,"M","IT",2452, 2003));
	emp.add(new Emylooyess(45,"raer",345478,"F","HR",2452, 2003));
	emp.add(new Emylooyess(45,"tatar",345678,"F","Hr",2452, 2003));
	emp.add(new Emylooyess(45,"you",34578,"M","IT",2452, 2003));

//List<Emylooyess> emp=Arrays.asList(new Emylooyess(28,"veer",34578,"IT","HR",58200,2023),
         //method1(emp);
        // method2salary(emp);
       //methoddepemart(emp);
      hiehstesalary(emp);
     //miehstesalary(emp);
    //sortname(emp);
   //removetheduplicateemelnt(emp);
  //remove(emp);
 //reverseorder(emp);
    //dermpartsort(emp);
   //dermpartsort1(emp);
   //eachdempart(emp);
   //eachdempartcount(emp);
   // eachdempartcounta(emp);
 
     
}

 static void method1(List<Emylooyess> emp) {
System.out.print("the emplooyes number");
emp.stream().forEach(System.out::println);
 
}
 
 static void method2salary(List<Emylooyess> emp) {
emp.stream().filter(employee -> employee.getSalary() <200000).forEach(System.out::println);
 }
 
 static void methoddepemart(List<Emylooyess> emp) {
emp.stream().filter(employee -> employee.getDepartment().equals("IT")).map(Emylooyess::getName).forEach(System.out::println);
 }
 
 static void hiehstesalary(List<Emylooyess> emp) {
String maxsalry= emp.stream().max(Comparator.comparing(Emylooyess::getSalary)).map(Emylooyess::getName).get();
System.out.println(maxsalry);
 }
 static void miehstesalary(List<Emylooyess> emp) {
String minsalry= emp.stream().min(Comparator.comparing(Emylooyess::getSalary)).map(Emylooyess::getName).get();
System.out.println(minsalry);
}
 
 static void remove(List<Emylooyess> emp) {
emp.stream().map(Emylooyess::getDepartment).distinct()
.forEach(System.out::println);
}

 
 static void removetheduplicateemelnt(List<Emylooyess> emp) {
 String unwqir = emp.stream().map(Emylooyess::getDepartment).distinct().collect(Collectors.joining());
 System.out.println(unwqir + " , ");

 }
 static void sortname(List<Emylooyess> emp) {
emp.stream().map(Emylooyess::getName).sorted()
.forEach(System.out::println);
 }
 
 static void reverseorder(List<Emylooyess> emp) {
emp.stream().map(Emylooyess::getName).sorted(Comparator.reverseOrder())
.forEach(System.out::println);
 }
 static void dermpartsort(List<Emylooyess> emp) {
emp.stream().sorted(Comparator.comparing(Emylooyess::getDepartment))
.forEach(System.out::println);
 }

 static void dermpartsort1(List<Emylooyess> emp) {
emp.stream().sorted(Comparator.comparing(Emylooyess::getDepartment).thenComparing(Emylooyess::getName))
.forEach(System.out::println);
 }
 static void eachdempart(List<Emylooyess> emp) {
Map<String, List<Emylooyess>> numbersns= emp.stream().collect(Collectors.groupingBy(Emylooyess::getDepartment));
System.out.println(numbersns);
 }
 static void eachdempartcount(List<Emylooyess> emp) {
Map<String, Long> numbersns= emp.stream().collect(Collectors.groupingBy(Emylooyess::getDepartment,Collectors.counting()));
System.out.println(numbersns);
}
 
 static void eachdempartcounta(List<Emylooyess> emp) {
Map<String, Long> numbersns= emp.stream().collect(Collectors.groupingBy(Emylooyess::getDepartment,Collectors.counting()));
numbersns.entrySet().stream().filter(dep -> dep.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);
System.out.println(numbersns);
}

}


