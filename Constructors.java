//import java.lang.reflect.Constructor;

/* 
public class Constructors {
    
     int a ;
     int b;
    public static void main(String[] args) {
       Constructors c1 = new Constructors();
        System.out.println(c1.a);                       // just normal prog. of default constructor.
        System.out.println(c1.b);
    }
}
*/


/*
public class Constructors(int k , int v) {
    
    
    static int a ;
    static int b;
    public static void main(String[] args) {
       // Constructors c1 = new Constructors();
        System.out.println(a);                       
                                                     // just normal prog. of default constructor using static.

        System.out.println(b);
    }
    */


/*public class Constructors{
    int a;
    int b;

    Constructors(int x , int y){
       a=x;                                       // here we will not declare the datattype 
       b=y;
    }
                                                     
void Display(){
    System.out.println("value of a: "+a);
    System.out.println("value of b: "+b);
}

public static void main(String[] args) {
    Constructors c1 = new Constructors(3,2);        // we will just pass the value as the para meter
    //c1.a=13;
    //c1.b=56;
    c1.Display();

}}
*/


/* 
public class Constructors{
                                                 // there can only 1 public class in 1 java program.
    Constructors(){
        System.out.println("This Is A Default Constructor");

    }
}

 class Test{ 
public static void main(String[]args){                 // main can placed under non public class like in this one test is non public.
Constructors cp1 = new Constructors();
}}
*/
class Student{
String name;
int age;
Student() {
name = "Unknown";
age = 0;
}
Student(String n) {
name = n;
age = 18;
}
Student(String n, int a) {
name = n;
age = a;
}
void display() {
System.out.println(name + " " + age);
}
}
public class  Constructors {
public static void main(String[] args) {
Student s1 = new Student();
Student s2 = new Student("Bob");
Student s3 = new Student("Charlie", 22);
s1.display(); // Unknown 0
s2.display(); // Bob 18
s3.display(); // Charlie 22
}
}
