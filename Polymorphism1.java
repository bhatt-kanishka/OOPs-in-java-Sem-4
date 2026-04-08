/*class A{
    
    void show(){
        System.out.println("i am kanishka bhatt");
    }
    void show(String s){
        System.out.println("i am choti");
        System.out.println("parameter pass is : "+s);
        
    }
    void show(int a, int b){
        int res= a + b;
        System.out.println("Addition of a+b is : "+res);
    }}
    public class Polymorphism1 {
    
    public static void main(String[] args){
        A obj = new A();
        obj.show();
        obj.show("abcd");
        obj.show(4,5);
    
}}
 */

class A{
    void show(){
        System.out.println("iam college wali kanishka ");
    }
}

class B extends A{
    void show(){
        System.out.println("i am ghar wali kannu");
    }
}

public class Polymorphism1{
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }

}


