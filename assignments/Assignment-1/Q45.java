class Student{
	int rollno;
	float percentage;
	
	Student(){
		System.out.println("In Default of Student:");
	}
	Student(int r,int p){
		this.rollno = r;
		this.percentage = p;
		System.out.println("In parameter const of Student:");
	}
	void show(){
		System.out.println(rollno+" "+percentage);
	}
}
class CollegeStudent extends Student {
	int semester;
	CollegeStudent(){
		System.out.println("In Default of CollegeStudent:");
	}
	CollegeStudent(int s){
		super();
		semester = s;
	}
	void show(){
		System.out.println("semester = "+semester);
	}
	
}
class SchoolStudent extends Student{
	int className;
	SchoolStudent(){
		System.out.println("In Default of SchoolStudent:");
	}
	SchoolStudent(int c){
		super();
		className = c;
	}
	void show(){
		System.out.println(className);
	}
}

class Demo45{
	public static void main(String args[]){
		Student s = new SchoolStudent(10);
		s.show();
		Student s1 = new CollegeStudent(2);
		s1.show();
		
		int[][] arr=new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
	}
}



























