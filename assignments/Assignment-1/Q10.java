import java.util.Scanner;

class Q10{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter temp in fahrenheit:");
		int f=sc.nextInt();
		int C= 5*(f-32)/9 ;
		
		System.out.println("temp in C ="+C);
		
	}
}