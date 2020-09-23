import java.util.Scanner;
class Q20{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n= sc.nextInt();
		int x,i;
			for(i=1;i<n;i++)
			{	
			System.out.print(i+"^2+");
			}
			System.out.print(i+"^2=");
			x=(n*(n+1)*(2*n+1))/6;
			System.out.println(x);
	}
}