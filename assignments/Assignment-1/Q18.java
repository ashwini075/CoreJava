import java.util.Scanner;
class Q18{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n= sc.nextInt();
		boolean flag=false;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
					flag=true;
					break;
			
			}
			if(!flag)
				System.out.println(n+" is prime number");
			else
				System.out.println(n+" is not prime number");
	}
}