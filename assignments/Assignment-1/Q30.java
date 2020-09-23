import java.util.Scanner;
class Q30{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[3];
		System.out.println("Enter a[] array elements:");
		for(int i=0;i<a.length;i++)
			 a[i] = sc.nextInt();
		 
		int b[] = new int[3];
		System.out.println("Enter b[] array elements:");
		for(int i=0;i<b.length;i++)
			 b[i] = sc.nextInt();
		 
		int c[]=new int[3];
		System.out.println("Enter c[] array elements:");
		for(int i=0;i<c.length;i++)
			 c[i] = sc.nextInt();
		 
		int arr[][] = new int[3][];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		
		int sum = 0;
		for(int i=0;i<arr.length;i++){
		sum = sum + arr[i][i];
		}
		System.out.println("Sum of diagonal element:"+sum);
		
		System.out.println("Output of array:")
		for(int ar[] :arr){
			for(int e:ar){
				System.out.print(" "+e );
			}
		System.out.println(" ");	
		}
		
		
	}
	
}