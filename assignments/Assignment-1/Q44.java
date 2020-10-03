class Faculty{
	int facultyId;
	float salary;
	Faculty(){
		facultyId=0;
	}
	
	void input(int fId){
		facultyId = fId;
		
	}
	void printSalary(){
		System.out.println("Find Salary");
	}
}
class FullTimeFaculty extends Faculty{
	private int basicSalary;
	private int allowance;
	
	FullTimeFaculty(){
		super();
		basicSalary = 1000;
		allowance = 2000;
		
	}
	
	void input(int basic,int allow){
		
		basicSalary = basic;
		allowance = allow;
	}
	float calSal(){
		salary = basicSalary + allowance;
		return salary;
	}
	void printSalary(){
		System.out.println(facultyId+" Salary = "+calSal());
	}
}
class PartTimeFaculty extends Faculty{
	private int workingHours;
	private int ratePerHour;
	
	
	PartTimeFaculty(){
		super();
		workingHours = 0 ;
		ratePerHour = 0;
	}
	
	
	void input(int w,int r){
		workingHours =  w;
		ratePerHour = r;
	}
	float calSal(){
		salary = workingHours * ratePerHour ;
		return salary;
	}
	void printSalary(){
		System.out.println(facultyId+" Salary = "+calSal());
	}
}
class Demo{
	public static void main(String args[]){
		Faculty f = new Faculty();
			f.input(20);
			f.printSalary();
			
		FullTimeFaculty f1 = new FullTimeFaculty();
		f1.input(5000,1000);		
		f1.printSalary();

		
		PartTimeFaculty f2 = new PartTimeFaculty();
		f2.input(5,3000);		
		f2.printSalary();

		
	}
}