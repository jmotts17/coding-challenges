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
	
	public int getSize() {
		return toDoList.size();
	}
	
	public ToDo getTask(int taskNum) {
		return toDoList.get(taskNum);
	}
	
	public void deleteTask(int taskNum) {
		toDoList.remove(taskNum);
	}
	
	public void renameTask(int taskNum, String newTask) {
		toDoList.get(taskNum).setDescription(newTask);
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
				System.out.print(count + ") [");
				if(td.isComplete()) {
					System.out.print("X");
				}
				System.out.print("]\t" + td.getDescription() + "\n");
			}
		}
	}
	
		
}
