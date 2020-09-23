import java.util.Scanner;
class Q23{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a size:");
		
		int n= sc.nextInt();
		
		int a[]=new int[n];
		
		
		for(int i=0;i<a.length;i++){
			System.out.println("Enter a Number:");
			a[i]= sc.nextInt();
		}
					
		System.out.println("Array before reverse:");
		for(int i=0;i<a.length;i++)
			 System.out.print(a[i] +" ");
		 
		 
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		} 
		
		System.out.println("\nArray after reverse:");
		for(int i=0;i<a.length;i++)
			 System.out.print(a[i] +" ");
		  
	}
}
