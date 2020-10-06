import java.util.Scanner;

interface taxable{
    double salesTax = 0.07;
    double incomeTax = 0.10;

   void calcTax();
}

class Employee implements taxable{
        int empid;
        int salary;
        String name;
        Employee() {}

        Employee( int empid,int salary,  String name  ){
            this.empid = empid;
            this.salary=salary;
            this.name=name;
        }

      public void calcTax(){
             double incomeTax1 = salary * incomeTax ;
             System.out.println("Total incometax is "+incomeTax1);
             }

}

class product implements taxable{
    int pid;
    int price;
    int quantity;
    product() {}

    product( int pid, int price,  int quantity  ){
        this.pid = pid;
        this.price=price;
        this.quantity=quantity;
    }

  public void calcTax(){
         double saleTax1 = ( price * quantity ) * salesTax ;
         System.out.println("Total saletax is "+saleTax1);
         }

}

class Q49{
public static void main(String args[]){
    taxable t = new Employee(1 , 1000, "Ashu");
    taxable t1 = new product(1 , 400, 5);
    t.calcTax();
    t1.calcTax();
    }
}