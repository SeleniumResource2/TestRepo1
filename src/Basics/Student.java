package Basics;

public class Student implements Comparable<Student>{
	
	int id;
	String name;
	
	public Student(int id, String name){
		this.id = id;
		this.name=name;
		
	}

	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		if(id>st.id){
			return 1; //if it is ascending then maintains the same
		} else if (id<st.id){
			return -1; //if the current record is lesser than the previous one then moves one step before
		}else{
		return 0;//if there is a same record position change does not happens
		}
	}


}
