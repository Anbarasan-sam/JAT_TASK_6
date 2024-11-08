package guviTask6;

public class MainEmployee {

	public static void main(String[] args) {
	
		        // Creating an instance of Employee
		        Employee emp = new Employee(10511, "Anbarasan", "M", 4000);

		        // Testing methods
		        System.out.println(emp.getName());               
		        System.out.println(emp.getAnnualSalary());      
		        System.out.println(emp.raiseSalary(10));         
		        System.out.println(emp);                         
		    }
		


	}


