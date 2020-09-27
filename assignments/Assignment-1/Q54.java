
import java.util.Scanner;
class Q54{
	public static void main (String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();

		StringBuffer a = new StringBuffer(str);
		
		System.out.println(a.reverse());
	}
}