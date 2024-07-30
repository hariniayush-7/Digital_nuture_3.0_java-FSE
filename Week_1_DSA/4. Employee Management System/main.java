package java_fse_CTS;

public class main {
	
	    public static void main(String[] args) {
	        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

	        // Add employees
	        ems.addEmployee(new Employee("E001", "Alice", "Manager", 70000));
	        ems.addEmployee(new Employee("E002", "Bob", "Developer", 50000));
	        ems.addEmployee(new Employee("E003", "Charlie", "Designer", 45000));

	        // Search for an employee
	        Employee emp = ems.searchEmployee("E002");
	        if (emp != null) {
	            System.out.println("Employee found: " + emp.getName());
	        } else {
	            System.out.println("Employee not found.");
	        }

	        // Traverse and display all employees
	        System.out.println("All employees:");
	        ems.traverseEmployees();

	        // Delete an employee
	        ems.deleteEmployee("E002");
	        System.out.println("After deletion:");
	        ems.traverseEmployees();
	    }
	}


