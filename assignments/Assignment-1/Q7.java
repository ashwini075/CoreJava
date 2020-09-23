import java.util.Scanner;
class Q7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double n=5;
		System.out.println("Enter marks of DS");
		double Ds=sc.nextDouble();
		System.out.println("Enter marks of DBT");
		double DBT=sc.nextDouble();
		System.out.println("Enter marks of AWP");
		double AWP=sc.nextDouble();
		System.out.println("Enter marks of MEAN");
		double Mean=sc.nextDouble();
		System.out.println("Enter marks of OS");
		double Os=sc.nextDouble();
		
		double avg =(Ds+DBT+AWP+Mean+Os)/n;
		
		System.out.println("percentage marks = "+avg);
	}
}