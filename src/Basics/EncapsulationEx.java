package Basics;

public class EncapsulationEx {
	//data member declaration
	private String name;
	private Integer id;
	


	public String getName() {//To retrieve values that has been defined
		return name;
	}

	public void setName(String name) {//Only to write values
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationEx ob = new EncapsulationEx();
		ob.setName("Harish");
		ob.setId(101);
		System.out.println(ob.getName());
		System.out.println(ob.getId());
	}

}

//In-heritance is a concept of is-a relationship
//Aggregation is a concept of Has-A relationship