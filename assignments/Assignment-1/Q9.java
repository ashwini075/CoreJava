import java.util.Scanner;

class Q9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no.of days:");
		int no_of_days=sc.nextInt();
		
		int year,week,days;
		year=no_of_days/365;
		week=(no_of_days %365)/7;
		days=(no_of_days%365)%7;
		
		System.out.println("years ="+year);
		System.out.println("weeks ="+week);
		System.out.println("days ="+days);
	}
}