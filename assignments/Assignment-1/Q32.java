import java.util.Scanner;
class Student{
	private int rollNo;
	private String name;
	static int counter=0;
	void setData(int rno,String name){
		rollNo = rno;
		this.name = name;
		
	}
	void showData(){
		System.out.println(rollNo+" "+name);
	}
	Student(){
		counter++;
		System.out.println(counter);
	}
}
class StudentDemo{
	
	public static void main(String args[]){
		
		Student s= new Student();
		
		s.setData(102,"rani");
		s.showData();
		Student s1= new Student();
		s1.setData(103,"rohini");
		s1.showData();
		
	}
}