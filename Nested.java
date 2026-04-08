/*import java.util.Scanner;

class School{
    String name;
    int grade;

    static class  Student{
        void display(String name , int grade){
            System.out.println("Name of the student is : "+name);
            System.out.println("grade of the student is :"+grade);
        }
    }
}


public class Nested{
public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);

    System.out.println("enter the no. of student whose data has to be printed : ");

    int n = sc.nextInt();
    sc.nextLine();


    String[] arr = new String[n];
    int[] arr1   = new int[n];

    for(int i=0 ; i<n ; i++){
        System.out.println("enter the name of student "+(i+1)+ ":");
        arr[i] = sc.nextLine();
        
        System.out.println("enter the grade of student "+(i+1)+":");
        arr1[i] = sc.nextInt();
        sc.nextLine();


    }
    School.Student s=  new School.Student();

        System.out.println("\n---- Student Details ----");

        // Displaying data
        for (int i = 0; i < n; i++) {
            s.display(arr[i], arr1[i]);
        }

        sc.close();
    }


}
    */

/*
class Laptop{
    String brand="hp";
    int price=12000;

    class Processor{
        int cores;
        int speed=12;
        void display(){
            System.out.println("brand of this laptop is : "+brand);
            System.out.println("cores of this processor is : "+cores);
            System.out.println("speed of this processor is : "+speed);
        
        }
    }
}
public class Nested{
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop.Processor l2 = l1.new Processor();
        l2.display();
    }
} */

   /*  class Outer{
        int a =10;
        float k=1.2f;

        void show(){
            class Inner{
                String name = "kanishka";

                void display1(){
                 
                 System.out.println("value of a : "+a);
                 System.out.println("name of the person is :"+name);
            }
        }
        Inner obj = new Inner();
        obj.display1();
    }
        void display(){
            System.out.println("float is :"+k);
        }
    }
    public class Nested{
        public static void main(String[] args) {
            Outer obj = new Outer();
        //  Outer.Inner obj2 = obj.new Inner();
            obj.show();
            obj.display();
    }} */

    class Outer {
        int a=10;
        static int b=12;
     
     static class Inner{
        int c = 110;
        void display(){
        System.out.println("value of b :"+b);
        System.out.println("value of b :"+a);
        System.out.println("value of c :"+c);
        }
     }}

     public class Nested {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
        }    
    }
