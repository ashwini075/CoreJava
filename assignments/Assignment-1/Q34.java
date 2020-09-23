import java.util.Scanner;
class Circle{
	private double radius;
	private double area;
	
	void init(double r){
		radius = r;
	return ;
	}
	void calculateArea(){
		
	area = 3.14 * radius * radius;
	//System.out.println(area);
	return;
		
	}
	void display(){
		System.out.println("Area of Circle: "+area+" "+" and radius= "+radius);
	}
	
}
class CircleDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius:");
		double r = sc.nextDouble();
		
		Circle c = new Circle();
		c.init(r);
		c.calculateArea();
		c.display();
	}
	
}
