package openclose;

abstract class school { //abstract class
	private String name;
	private int id;
	private String department;
	
	public school(String name, int id, String department) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
	}
	@Override
	public String toString() {
		return "school [name=" + name + ", id=" + id + ", department=" + department + "]";
	}
	public abstract void performduty(); //abstract method
	

}
