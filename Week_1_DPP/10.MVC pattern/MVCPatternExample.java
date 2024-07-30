package java_fse_CTS;

public class MVCPatternExample {
	    public static void main(String[] args) {
	        // Fetch student record based on his/her roll no from the database
	        Student model = new Student("John Doe", "1", "A");

	        // Create a view : to write student details on console
	        ViewStudent view = new ViewStudent();

	        // Create controller
	        StudentController controller = new StudentController(model, view);

	        // Initial view
	        controller.updateView();

	        // Update model data
	        controller.setStudentName("Jane Doe");
	        controller.setStudentGrade("B");
	        System.out.println("--------------------");
	        System.out.println("After Updation");

	        // Updated view
	        controller.updateView();
	    }
	}

