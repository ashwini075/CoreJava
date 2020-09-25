import java.util.Scanner;
 class OneBHK {
	  float roomArea;
	  float hallArea;
	  float price;
  
  OneBHK(){
	  System.out.println("Default values");
	  this.roomArea = 500;
	  this.hallArea = 700;
	  this.price = 25_00_000;
  }
   OneBHK(float roomArea,float hallArea,float price){
	  this.roomArea = roomArea;
	  this.hallArea = hallArea;
	  this.price = price;
  }
  void show(){
	  System.out.println("roomArea = "+roomArea+" hallArea = "+hallArea+" price = "+price);
  }
}
class TwoBHK extends OneBHK{
	float room2Area;
	
	TwoBHK(){
	  super();
	  this.room2Area=600;
  }
   TwoBHK(float roomArea,float hallArea,float price,float room2Area){
	  super();
	  this.room2Area=room2Area;
  }
  void show(){
	  System.out.println("roomArea = "+roomArea+" hallArea = "+hallArea+" price = "+price+" room2Area = "+room2Area);
  }
	
}
class flat{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roomArea:");
		float roomArea=sc.nextFloat();
		System.out.println("Enter hallArea:");
		float hallArea=sc.nextFloat();
		System.out.println("Enter price:");
		float price=sc.nextFloat();
		System.out.println("Enter room2Area:");
		float room2Area=sc.nextFloat();
		
		//OneBHK d = new OneBHK();
		//d.show();
		//OneBHK o = new OneBHK(roomArea,hallArea,price);
		//o.show();
		
		//TwoBHK d2 = new TwoBHK();
		//d2.show();
		TwoBHK t = new TwoBHK(roomArea,hallArea,price,room2Area);
		t.show();
	}
}