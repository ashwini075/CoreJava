import java.util.Scanner;
class Q24{
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
		
		System.out.println("Enter element to be searched :");
		int searchNumber= sc.nextInt();
		int flag=0;
		for(int i : a){
			if(i == searchNumber){
				System.out.println("Element "+searchNumber+" is found ");
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("Element not found.");
		
		
		//output array
		System.out.println("Array list:");
		for(int i=0;i<a.length;i++)
			 System.out.print(a[i] +" ");
		 
		 
		
		
		
	}
}