import java.util.Scanner;
class Product{
	private int pid;
	private int price;
	private int quantity;
	

	Product(int pid,int price,int quantity){
		this.pid = pid;
		this.price =price;
		this.quantity = quantity;
	}
	
	
	void display(){
		System.out.println("pid:"+pid);
		System.out.println("price:"+price);
		System.out.println("quantity:"+quantity);
		System.out.println("===========")
	}
	
}
class ProductDemo{
	public static void main(String args[]){
		 Product p1 = new Product(1,299,5);
		 Product p2 = new Product(2,399,5);
		 Product p3 = new Product(3,199,5);
		 Product p4 = new Product(4,299,5);
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter pid:");
		int pid = sc.nextInt();
		
		System.out.println("Enter price:");
		int price = sc.nextInt();
		
		System.out.println("Enter quantity:");
		int quantity = sc.nextInt();
		
		Product p5 = new Product(pid,price,quantity);
		
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		p5.display();
	
	
	

	}
	
}