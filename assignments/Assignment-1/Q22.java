import java.util.Scanner;

class Q22{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i,size=10;
		int ar[]=new int[size];
		System.out.println("Enter a element:");
		for(i=0;i<ar.length;i++){
			ar[i]=sc.nextInt();
		}
		for(i=0;i<ar.length;i++){
			for(int j=i+1;j<ar.length;j++){
				if(ar[i]<ar[j]){
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
					
		}
		System.out.println("\n Sorted array:");
		for(i=0;i<ar.length;i++){
			System.out.print(" "+ar[i]);
		}
			
	}
		
		
}