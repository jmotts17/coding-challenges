package app.business;

import java.util.ArrayList;

public class ToDoList {

	private ArrayList<ToDo> toDoList = new ArrayList<ToDo>();

	public ToDoList() {
		super();
	}

	public ToDoList(ArrayList<ToDo> toDoList) {
		this.toDoList = toDoList;
	}

	public ArrayList<ToDo> getToDoList() {
		return toDoList;
	}

	public void setToDoList(ArrayList<ToDo> toDoList) {
		this.toDoList = toDoList;
	}
	
	public void addToDo(ToDo toDoItem) {
		toDoList.add(toDoItem);
	}
	
	public void displayList() {
		int count = 0;
		System.out.println("\nTo Do List");
		System.out.println("----------");
		if(toDoList.isEmpty()) {
			System.out.println("Empty! Add an item.");
		} else {
			for(ToDo td : toDoList) {
				count++;
				System.out.print(count + ") " + td.getDescription() + "\t\t[");
				if(td.isComplete()) {
					System.out.print("X");
				}
				System.out.print("]\n");
			}
		}
	}
	
		
}
