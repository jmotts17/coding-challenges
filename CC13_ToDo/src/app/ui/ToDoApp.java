package app.ui;

import app.business.ToDo;
import app.business.ToDoList;

public class ToDoApp {

	public static void main (String[] args) {
		
		ToDoList toDoList = new ToDoList();
		
		ToDo toDoItem = new ToDo("Test Item");
		
		toDoList.addToDo(toDoItem);
		
		toDoItem.setComplete();
		
		toDoList.displayList();
		
	}
}
