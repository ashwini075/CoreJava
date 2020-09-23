import java.lang.Math;
class MathOperation{
	
	static void add(int i,int j){	
		int sum=i+j;
		System.out.println("Sum= "+sum);
	}
	static void subtract(int i,int j){
		int diff=i-j;
		System.out.println("diff="+diff);
	}
	static void multiply(int i,int j){
		int product=i * j;
		System.out.println("mul="+product);
	}
	static void power(int i,int j){
		
		System.out.println("power="+Math.pow(i,j));;
	}
	/*
	void show(){
		System.out.println(sum+" "+subtract+" "+multiply+" "+power);
	}
	*/
}
class MathOp{
	public static void main(String args[]){
		MathOperation.add(10,20);
		MathOperation.subtract(20,10);
		MathOperation.multiply(5,2);
		MathOperation.power(2,2);
		//show();
	}
}