class Student{
	private int id;
	private String name;
	private int std;
	
	void setData(int id,String name,int std){
			this.id = id;
			this.name = name;
			this.std = std;
	}
	void setShow(){
		System.out.println(id+" "+name+" "+std);
	}
	
	Student(){
		System.out.println("Constructor called:");
	}
}
class StudentDemo{
	public static void main(String args[]){
		Student s = new Student();
		s.setData(100,"Ashwini Gaikar",12);
		s.setShow();
	}
}