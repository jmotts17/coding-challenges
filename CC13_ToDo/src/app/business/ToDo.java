package app.business;

public class ToDo {

	private String description;
	private boolean isComplete;
	
	public ToDo() {
		this.description = "";
		this.isComplete = false;
	}

	public ToDo(String description) {
		this.description = description;
		this.isComplete = false;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete() {
		if(this.isComplete == true) {
			this.isComplete = false;
		} else {
			this.isComplete = true;
		}
	}
		
	
}
