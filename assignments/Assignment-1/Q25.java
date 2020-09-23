import java.util.Scanner;
class Q25{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a size:");
		
		int n= sc.nextInt();
		
		int a[]=new int[n];
		
		//input array
		for(int i=0;i<a.length;i++){
			System.out.println("Enter a Number:");
			a[i]= sc.nextInt();
		}							
		
		int sumOfEven=0,sumOfOdd=0;
		for(int i : a){
			if(i%2 == 0)
			sumOfEven=sumOfEven+i;	
			else
			sumOfOdd=sumOfOdd+i;
		}
		System.out.println("Sum of even numbers:"+sumOfEven);
		System.out.println("Sum of odd numbers:"+sumOfOdd);
	}
}