/*public class Practice {

    void draw() {
System.out.println("Drawing Shape");
}
}

class Circle extends Practice{
void draw() {
System.out.println("Drawing Circle");
}
}                                          //inheritance

class Square extends Practice {
void draw() {
System.out.println("Drawing Square");
}
}

class Test{
public static void main(String[] args) {
Practice s1 = new Circle();
Practice s2 = new Square();
s1.draw(); // Drawing Circle
s2.draw(); // Drawing Square

}}*/
 

/*public class Practice{
    
    void show(){
        System.out.println("hello i am kanishka ");
    }
       
    void show(int a){
        System.out.println("value o a is "+a);
    }

    int show(double b){
       System.out.println("value of a is "+b);
       return (int)b;
    }
    

    public static void main(String[] args){
        Practice obj1 = new Practice();
        obj1.show();
        obj1.show(13);
        obj1.show(33.33);

    }
}*/

class Practice{
    void show(){
        System.out.println(".(I am kannu)");
    }
}

class Vimmu extends Practice{
    void show(){
        System.out.println(".(i am vimmu)");
    }
}

class Choti extends Practice{
    void show(){
    System.out.println(" i am choti");
}
}
class Test{
    public static void main(String[] args) {
        Vimmu obj1 = new choti();
        //Choti obj2 = new Choti();
        obj1.show();
        //obj2.show();
    }
}
