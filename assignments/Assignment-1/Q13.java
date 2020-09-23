import java.util.Scanner;
class Q13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	   	
		System.out.println("Enter x");
		int x = sc.nextInt();
		System.out.println("Enter y");
		int y = sc.nextInt();
		System.out.println("Enter z");
		int z = sc.nextInt();
		
		String s= (x>y && y>z)?"X is greater":(y>z)?"y is greater":"z is greater";
		System.out.println(s);
		
	}
}