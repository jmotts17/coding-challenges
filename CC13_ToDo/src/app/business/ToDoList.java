package app.business;

import java.util.ArrayList;

public class ToDoList {

	private ArrayList<ToDo> toDoList = new ArrayList<ToDo>();
	private int count = 0;

	public ToDoList() {
		super();
		this.count = 0;
	}

	public ToDoList(ArrayList<ToDo> toDoList) {
		this.toDoList = toDoList;
		this.count = 0;
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
		this.count++;
		System.out.println("To Do List");
		for(ToDo td : toDoList) {
			System.out.print(this.count + ") " + td.getDescription());
			if(td.isComplete()) {
				System.out.print("\tX");
			}
			System.out.print("\n");
		}
	}
	
		
}
