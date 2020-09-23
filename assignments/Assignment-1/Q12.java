import java.util.Scanner;

class Q12{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Basic salary:");
		double basic= sc.nextDouble();
		double HRA,DA;
		double GS;
		if(basic<10000){
		HRA=0.10*basic;
		DA=0.90*basic;
	
		}
		else{
		HRA=2000;
		DA=0.98*basic;
		
		}
		GS= basic + DA + HRA ;
		System.out.println("Gross Salary = "+GS);
		
	}
}