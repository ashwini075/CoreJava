import java.util.Scanner;
class Q13a{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	   	
		System.out.println("Enter x");
		int x = sc.nextInt();
		System.out.println("Enter y");
		int y = sc.nextInt();
		System.out.println("Enter z");
		int z = sc.nextInt();
		
		
		if(x>y && y>z)
			System.out.println("X is greater");
		else if(y>z)
			System.out.println("y is greater");
		else
			System.out.println("z is greater");
		
	}
}