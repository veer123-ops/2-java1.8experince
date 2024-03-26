package veer.com;

public class Employye {

	private int id;
	private int Salary;
	
	
	/**
	 * @return the id
	 */
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return Salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		Salary = salary;
	}

public Employye(int id, int salary) {
	super();
	this.id = id;
	Salary = salary;
}
@Override
public String toString() {
	return "Employye [id=" + id + ", Salary=" + Salary + "]";
}


}