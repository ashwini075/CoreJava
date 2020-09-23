import java.util.Scanner;
class Q15{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter gender m for male and f for female:");
	char g = sc.next().charAt(0);          //for char value
	System.out.println("Enter age:");
	int age=sc.nextInt();
	
	String s=((g=='m' && age>20)||(g=='f' && age>18))?"Eligible for marriage":"Not Eligiable for marriage";
	
	System.out.println(s);
	
	}
}