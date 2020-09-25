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
		System.out.println("===========");
	}
	static void calculate(){
		int total;
		total = price * quantity;
		System.out.println("Total price" +total);
		
	}
	
}
class ProductDemo{
	public static void main(String args[]){
		
		
		Product ar[] = new Product[5];
			for(int i=0;i<5;i++){
				 
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter pid:");
				int pid = sc.nextInt();
				
				System.out.println("Enter price:");
				int price = sc.nextInt();
				
				System.out.println("Enter quantity:");
				int quantity = sc.nextInt();
		
				Product P = new Product(pid,price,quantity);
				ar[i] = P;
			}
		
		for(Product p : ar){
			p.display();
			p.calculate();
		}
	
	//finding highest price
		/*	 
		Product max = ar[0];
		for(int i=1; i < ar.length;i++){
			
			if( max < ar[i])
				max = ar[i];
		System.out.println("Max Price");
		}
		*/
	}
	
}