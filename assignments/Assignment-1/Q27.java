import java.util.Scanner;
class Q27{
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
		int max,min;
		 max = min = a[0];
		for(int i=0;i<a.length;i++){
				if(a[i]>max){
				max= a[i];
			}
			else if(a[i]<min)		
					min=a[i];
		}
		
			
		System.out.println("max="+max);
		System.out.println("min="+min);
	}
}