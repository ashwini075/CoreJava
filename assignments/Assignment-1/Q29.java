class Q29{
	public static void main(String args[]){
		int a[]={1,2,3,5,6,7,8,};
		int b[]={4,5,6,0,2,3,};
		int c[]={7,8,9};
		int arr[][] = new int[3][];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		
		for(int ar[] :arr){
		
		System.out.println(" "+ar.length);	
		}
		
		for(int ar[] :arr){
			for(int e:ar){
				System.out.print(" "+e );
			}
		System.out.println(" ");	
		}
	}
	
}