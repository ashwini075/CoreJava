import java.util.Scanner;
class Employee{
	static int empNo=0;
	static int salary =0;
	int totalSalary;
	
	Employee(int salary){
		empNo++;
		this.salary+= salary;
		
	  
	}
	void display(){
		
		System.out.println(empNo+" "+salary);
	}

}
class EmployeeDemo{
	public static void main(String args[]){
		Employee e1 = new Employee(10000);
		Employee e2 = new Employee(10000);
		Employee e3 = new Employee(10000);
		Employee e4 = new Employee(10000);
		Employee e5 = new Employee(10000);
		
			e1.display();		
		}
		
}
