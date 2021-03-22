package app.ui;

import java.util.Scanner;

import app.business.ToDo;
import app.business.ToDoList;

public class ToDoApp {

	private static Scanner scanner = new Scanner(System.in);
	private static ToDoList toDoList = new ToDoList();
	
	public static void main (String[] args) {
		
		int response = 0;
			
		displayMenu();
		response = scanner.nextInt();
		
		do {
			
			while(response > 6 || response < 1) {
				System.out.print("Please enter an option [1-6]: ");
				response = scanner.nextInt();
			}
			scanner.nextLine();
			
			switch(response) { 
				case 1:
					toDoList.displayList();
					break;
				case 2:
					addTask();
					break;
				case 3:
					markComplete();
					break;
				case 4:
					deleteTask();
					break;
			}
			System.out.println();
			displayMenu();
			response = scanner.nextInt();
			
		} while(response != 6);
		
		System.out.println("\nGoodbye!");
	}
	
	public static void displayMenu() {
		System.out.println("To Do List Menu");
		System.out.println("1. Display To Do List");
		System.out.println("2. Add To Do Item");
		System.out.println("3. Mark Complete / Incomplete");
		System.out.println("4. Delete To Do Item");
		System.out.println("5. Rename To Do Item");
		System.out.println("6. Quit");
		System.out.print("Please enter an option [1-6]: ");
	}
	
	public static int getTaskNumber() {
		System.out.print("Please enter the task number: ");
		int taskNum = scanner.nextInt();
		taskNum--;
		
		while(taskNum > toDoList.getSize() || taskNum < 0) {
			System.out.println("Invalid task. Please enter a valid task.");
			taskNum = scanner.nextInt();
		}
		
		return taskNum;		
	}
	
	public static void addTask() {
		System.out.print("Task: ");
		String toDoTask = scanner.nextLine();
		ToDo task = new ToDo(toDoTask);
		toDoList.addToDo(task);
	}
	
	public static void markComplete() {
		int task = getTaskNumber();
		toDoList.getTask(task).setComplete();		
	}
	
	public static void deleteTask() {
		int task = getTaskNumber();
		toDoList.deleteTask(task);	
	}
	
}
