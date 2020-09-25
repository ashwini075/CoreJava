class Tile{
	int length=10;
	int area;
	int areaofTile(){
		area=length*length;
		System.out.println("Square Tile Area:"+area);
		return area;
	}

}
class Floor extends Tile{
	 int width=6;
	 int areaOfFloor;
	 int totalTiles;
	 
	 int areaofTile(){
		area=length*width;
		System.out.println("Area of Rectangular Tile:"+area);
		return area;
		
	}
	int areaofFloor(){
		 areaOfFloor=200*100;
		System.out.println("areaOfFloor: "+areaOfFloor);
		return areaOfFloor;
	}
	
	 int totalTile(Tile t){
		 int p = areaofFloor();
		 int q = areaofTile();
		  totalTiles = p / q;
		  System.out.println("No.Of  Tiles Required:"+totalTiles);
	
		return totalTiles;
	}
	void show(){
		
		System.out.println("No.Of  Tiles Required:"+totalTiles);
	}
}
class Q42{
	public static void main(String args[]){
		Floor t1 = new Floor();
		totalTile();
		t1.areaofFloor();
		t1.areaofTile();
		t1.show();
	}
}