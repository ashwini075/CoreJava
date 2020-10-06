class Animal { 

}  
  
class Cat extends Animal {  
  static void method(Animal a) {  
    if(a instanceof Cat){  
       Cat d=(Cat)a;//downcasting  
       System.out.println("Downcasting done");  
    }  
  }  
   
  public static void main (String [] args) {  
    Animal a=new Cat();  
    Cat.method(a);  
  }  
    
 }  