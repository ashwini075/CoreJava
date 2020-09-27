class Q53{

	
	public static void main(String[] args) {
		String s = "67 89 23 67 12 55 66";
		String[] str = s.split("\\s");
			
		//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		int sum=0;
		for(String w:str){  
		
		int i = Integer.parseInt(w);
		sum = sum+i;
		 
		System.out.println(w);  
		}  
		System.out.println("sum = "+sum); 
			
		
	}
}