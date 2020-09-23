import java.util.Scanner;
class Q6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		double r = sc.nextDouble();
		double area =(3.14*r*r);
		double circumference=3.14*2*r;
		System.out.println("Area of circle "+area);
		System.out.println("Circumference of circle "+circumference);

	}
}