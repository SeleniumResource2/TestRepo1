package Basics04072018;

public class Encapsulation {
	
	/*
	 * Encapsulation is another oops concept where it wraps the code together
	 * Restriction can be done with read and write access
	 * Restriction for read would be achieved by getter method
	 * Restriction for write would be achieved by setter method
	 */
	
	private int Age;
	private int Id;
	private String Name;
	
	public int getAge() {//Read method
		return Age;
	}
	public void setAge(int age) {//write method
		Age = age;
	}
	public int getId() {//Read method
		return Id;
	}
	public void setId(int id) {//write method
		Id = id;
	}
	public String getName() {//Read method
		return Name;
	}
	public void setName(String name) {//write method
		Name = name;
	}
	
	public static void main(String[] args) {
		
		Encapsulation ob = new Encapsulation();
		ob.setAge(52);
		ob.setId(1254);
		ob.setName("Karthick");
		
		System.out.println("Id is : " + ob.getId() + " " + "Age is : " + ob.getAge() + " " + "Name is : " + ob.getName());
	}

}
