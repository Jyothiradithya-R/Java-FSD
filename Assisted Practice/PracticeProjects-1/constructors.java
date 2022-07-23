package PracticeProjects;

public class constructors {
	int empId;
	String empName;
	String department;
	float salary;
	
	//default constructor
	public constructors() {
		empId=21;
		empName="Jyothiradithya";
		department="Resolution-Desk";
		salary=35000;
	}
	
	//parametrized constructor
	public constructors(int empId,String empName,String department,float salary) {
		this.empId=empId;
		this.empName=empName;
		this.department=department;
		this.salary=salary;
	}
	
	public void display() {
		System.out.println("Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Department: "+department);
		System.out.println("Salary: "+salary);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		constructors e= new constructors();
		constructors e1= new constructors(221, "Radithya", "Training", 400000); 

		//calling default constructor
		e.display();
		//parametrized constructor
		e1.display();
		
		 
	
	}

}
