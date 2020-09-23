
class MathOperation{
	
	static void multiply(int i,int j){
		int product = i * j;
		System.out.println("mul="+product);
	}
	static void multiply(float i,float j,float k){
		float product = i * j * k;
		System.out.println("mul="+product);
	}
	
	static void multiply(){
		int arr[]= {1,2,3,4,5};
		int product=1;
		for(int i=0;i<arr.length;i++)
		{
			product = arr[i] * product;
		}
		System.out.println("mul of array ="+product);
	}
	
	static void multiply(double i,int j){
		double product = i * j;
		System.out.println("mul="+product);
	}
	
	
}
class Demo{
	public static void main(String args[]){
		MathOperation.multiply(10,20);
		MathOperation.multiply(1f,2f,3f);
		MathOperation.multiply();
		MathOperation.multiply(10.2,20);
	}
}