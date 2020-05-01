package Basics;

public class AggregationEx {
	
	int rooms;
	int floor;
	Colours colours; //class is utilized as an entity

	public AggregationEx(int rooms, int floor, Colours colours){
		this.rooms = rooms;
		this.floor = floor;
		this.colours=colours;
	}
	
	public void display(){
		System.out.println("Rooms available " + rooms + " in Floor " + floor);
		System.out.println("Total colours are " + colours.totColour + colours.colour1 + colours.colour2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		
		Colours a = new Colours(14, "Yellow", "SkyBlue");
		Colours b = new Colours(28, "Green", "Olive");
		
		AggregationEx ob = new AggregationEx(4, 1, a);
		ob.display();
		
		AggregationEx ob1 = new AggregationEx(2, 2, b);
		ob1.display();
		
		long timeDuration = (System.currentTimeMillis()-startTime);
		System.out.println("Processing time duration is " + timeDuration);
	}

}
