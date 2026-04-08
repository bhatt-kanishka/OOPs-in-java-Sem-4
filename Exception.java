/*class A{
    int a = 10;
    void display(){
    try {
        int div = a/0;
        System.out.println(div);
    }
    catch(ArithmeticException e){
        System.out.println("cannot be divited by zero");
    }
    finally{
        System.out.println("i am kannu");
    }
}} // normal try catch block

public class Exception{
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}*/


/*class A{
    int a=56;
    void show(){
        try{
        int div = a/0;
        }
        catch(ArithmeticException e){
            //System.out.println(e.getMessage);
            throw new ArithmeticException("cannot be divited by zero");
            }
    }}

    public class Exception{
    public static void main(String[] args){
        A obj = new A();
        obj.show();
    }} */

/*import java.util.Scanner;


class A{
    Scanner sc = new Scanner(System.in);
    
    void show(){
   
        System.out.println("enter your age:");
        int age = sc.nextInt();
    
    
        if(age<18){
            throw new ArithmeticException("you are not eligible for voting");

        }
        else{
            System.out.println("you can vote");
        }
    }}

    public class Exception{
        public static void main(String[] args) {
            A obj = new A();
            obj.show();

}} */

/*import java.util.Scanner;

class Bank{
    Scanner sc = new Scanner(System.in);
     int balance = 20;
      
     void show(){
        System.out.println("enter the amount of withdrawl money: ");
        int withd = sc.nextInt();

        if(balance<withd){
            throw new ArithmeticException("insufficient balance");
        }
        else{
            int current= balance-withd;
            System.out.println("your current balance is "+current);
        }
    }}

    public class Exception{
        public static void main(String[] args) {
            Bank obj = new Bank();
            obj.show();
        }}
    */

   /*  class A {

    void show() {
        throw new RuntimeException("Something went wrong");
    }
}

public class Exception {

    public static void main(String[] args) {

        A obj = new A();
        obj.show();

    }
}
*/
    
