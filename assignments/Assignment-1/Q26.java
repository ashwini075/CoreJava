import java.util.Scanner;
class Q26{
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
		
		int sum=0;
		for(int i : a)
			sum=sum+i;	
			
		System.out.println("Sum of array elements  :"+sum);
		
	}
}