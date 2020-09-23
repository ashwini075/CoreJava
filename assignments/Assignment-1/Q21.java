import java.util.Scanner;
class Q21{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		
		for(int i= n1; i<= n2; i++) {
			boolean prime = true;  //start by assuming the current number is prime
			for(int j=2; j<i; j++) { // Loop till j < i
				if(i%j == 0) {
				  prime = false; //Set the current number as not prime if it is divisible by any number lesser than it
				}
		}
		
	    if (prime) {
			System.out.println(i);   //Add to result
		}
	}
	}
}