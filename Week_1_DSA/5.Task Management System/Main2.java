package java_fse_CTS;

public class Main2 {
	
	    public static void main(String[] args) {
	        TaskLinkedList taskList = new TaskLinkedList();

	        // Add tasks
	        taskList.addTask(new Task("T001", "Design UI", "In Progress"));
	        taskList.addTask(new Task("T002", "Implement Backend", "Not Started"));
	        taskList.addTask(new Task("T003", "Test Application", "Not Started"));

	        // Search for a task
	        Task task = taskList.searchTask("T002");
	        if (task != null) {
	            System.out.println("Task found: " + task.getTaskName());
	        } else {
	            System.out.println("Task not found.");
	        }

	        // Traverse and display all tasks
	        System.out.println("All tasks:");
	        taskList.traverseTasks();

	        // Delete a task
	        taskList.deleteTask("T002");
	        System.out.println("After deletion:");
	        taskList.traverseTasks();
	    }
	}


