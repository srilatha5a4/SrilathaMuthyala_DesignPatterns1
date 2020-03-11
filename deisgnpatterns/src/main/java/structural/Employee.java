package structural;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String position;
	private int wage;
	private List<Employee> coworker;
	public Employee(String name,String position,int wage){
		this.name = name;
		this.position = position;
		this.wage = wage;
		coworker = new ArrayList<Employee>();
	}
	public void addcoworker(Employee emp){
		coworker.add(emp);
	}
	public void removeworker(Employee emp){
		coworker.remove(emp);
	}
	public List<Employee> getworkers(){
		return coworker;
	}
	public String toString(){
		return "Employee : | Name: " + name + ", Position: " + position + ", Wage: "
	             + wage + " |";
	}

}
