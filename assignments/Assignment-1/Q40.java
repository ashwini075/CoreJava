import java.util.Scanner;
class Student{
        private String name;
        private int rollNo;
        private int age;
        private int score;

    Student(String name,int rollNo,int age ,int score){
        this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.score = score;
    }
    static void studentRecord(Student ar[][]){
        for(Student arr[] :ar){
            for(Student a : arr){
                System.out.println("Name of student     : "+a.name);
				System.out.println("Roll no of student     : "+a.rollNo);
				System.out.println("Age of student     : "+a.age);
				System.out.println("Score of student    : "+a.score);
			
				System.out.println("===================================");
				
            }
        }
    }
}

class Q40{
    public static void main(String args[]){
       
       Student ar[] = new Student[10];

            Student s1[] = new Student[3];
            int p1 = 0;
            Student s2[] = new Student[3];
            int p2 = 0;
            Student s3[] = new Student[3];
            int p3 = 0;
            Student s4[] = new Student[3];
            int p4 = 0;
			for(int i=0;i<10;i++){
				 
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter name:");
				String name= sc.next();
				
				System.out.println("Enter RollNo:");
				int rollNo = sc.nextInt();
				
				System.out.println("Enter age:");
                int age = sc.nextInt();
                
                System.out.println("Enter score:");
				int score = sc.nextInt();
		
				Student s = new Student(name,rollNo,age,score);
                ar[i] = s;
                
                if( score <= 50) {
					
					s1[p1] =  s;
					p1++;
				}
				else if( score > 50 && score <= 65 ) {
				
					s2[p2] = s;
					p2++;
				}
				else if( score > 65 && score <= 80 ) {
				
					s3[p3] = s;
					p3++;
				}
				else {
				
					s4[p4] = s;
					p4++;
				}
            }

        Student s[][] = new Student[4][];
		
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4;
		
		Student.studentRecord(s);
    
            
    }
}