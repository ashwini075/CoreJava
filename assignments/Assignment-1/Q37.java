class Person{
	private String name;
	private int age = 18;
	
	void display(){
	System.out.println(name+" "+age);
	}
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	String getName()
	{
		return name;
	}
	int getAge()
	{
		return age;
	}
	
}
class PersonDemo{
	public static void main(String args[]){
		Person p = new Person("ashu",20);
		p.display();
		
	}
}