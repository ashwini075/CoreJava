import java.util.Scanner;
class Student{
	private int rollNo;
	private String name;
	
	void setData(int rno,String name){
		rollNo = rno;
		this.name = name;
		
	}
	void showData(){
		System.out.println(rollNo+" "+name);
	}
	
}
class StudentDemo{
	public static void main(String args[]){
		Student s= new Student();
		s.setData(102,"rani");
		s.showData();
		
	}
}