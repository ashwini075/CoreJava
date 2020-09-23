import java.util.Scanner;
class Q8{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	   	
		System.out.println("Enter principle amount");
		float p = sc.nextFloat();
		System.out.println("Enter rate of intrest");
		float r=sc.nextFloat();
		System.out.println("Enter time");
		float t=sc.nextFloat();
		
		double SI=(p*r*t)/100;
		System.out.println("Simple Intrest ="+SI);
	}
}