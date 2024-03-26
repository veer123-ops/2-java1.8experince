package veer.com;


public class Emylooyess{
 
	private int age;
	private String name;
	private int id;
	private String Department;
	private String gender;
	private int Salary;
	private int yearofjoing;
	
	public Emylooyess(int age, String name, int id, String department, String gender, int salary,int yearofjoing) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
		Department = department;
		this.gender = gender;
		Salary = salary;
		this.yearofjoing = yearofjoing;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getYearofjoing() {
		return yearofjoing;
	}
	public void setYearofjoing(int yearofjoing) {
		this.yearofjoing = yearofjoing;
	}
	@Override
	public String toString() {
		return "Emylooyess [age=" + age + ", name=" + name + ", id=" + id + ", Department=" + Department + ", gender="
				+ gender + ", Salary=" + Salary + ", yearofjoing=" + yearofjoing + "]";
	}
	
	
	
}