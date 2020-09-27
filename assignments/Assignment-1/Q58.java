import java.util.Scanner;
class Q58{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter number :");
			int n = sc.nextInt();
			String day ="";
		try{
			
			
			switch(n)
			{				
				case 1:
					day ="MonDay";
					break;
				case 2:
					day ="TuesDay";
					break;
				case 3:
					day ="WednesDay";
					break;
				case 4:
					day ="ThursDay";
					break;
				case 5:
					day ="FriDay";
					break;
				case 6:
					day ="SatDay";
					break;
				case 7:
					day ="SunDay";
					break;
				default:
					day ="Invalid";
					break;
					
			}
			
			System.out.println(day);
				
		}catch(ArithmeticException  e){
		System.out.println("enter valid number");	
		}finally{
		System.out.println("finished");
	}
	
		
	}
}