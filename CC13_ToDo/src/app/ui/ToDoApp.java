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
			
			while(response > 5 || response < 1) {
				System.out.print("Please enter an option [1-5]: ");
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
					deleteTask();
					break;
				case 4:
					break;
			}
			System.out.println();
			displayMenu();
			response = scanner.nextInt();
			
		} while(response != 5);
		
		System.out.println("Goodbye!");
	}
	
	public static void displayMenu() {
		System.out.println("To Do List Menu");
		System.out.println("1. Display To Do List");
		System.out.println("2. Add To Do Item");
		System.out.println("3. Delete To Do Item");
		System.out.println("4. Rename To Do Item");
		System.out.println("5. Quit");
		System.out.print("Please enter an option [1-5]: ");
	}
	
	public static void addTask() {
		System.out.print("Task: ");
		String toDoTask = scanner.nextLine();
		ToDo task = new ToDo(toDoTask);
		toDoList.addToDo(task);
	}
	
	public static void deleteTask() {
		
	}
	
}
