/*class Base {
    String name ;
    void display(){
        System.out.println("kanishka is a cutie ");
    }
    void show(){
            System.out.println("aninymous class worked ");

        }
}
    
    //class anonymous extends Base{}
    class Derived{

        Base b = new Base(){
        void show(){
            System.out.println("aninymous class worked ");

        }
    };
        void print(){
            System.out.println("derived output ");

        }

    }

public class Annonymous {
    public static void main(String[] args) {

        Base b = new Base();
        b.display();
        b.show();
        Derived d =  new Derived();
        d.print();

        d.b.show();



    }
}  */

class Person{
    void speak(){
        System.out.println("person is speaking");
    }
    void eat(){
        System.out.println("person is eating");
    }
    void sleep(){
        System.out.println("person is sleeping");
    }
}

class Derived {

    Person p1 = new Person(){

        void speak(){
            System.out.println("person is speaking in an aninymous way");
        }
    void eat(){
        System.out.println("person is eating in an aninymous way");
    }
    };
}

public class Annonymous {
    public static void main(String[] args) {
       Person p1 = new Person();
       p1.speak();
       p1.eat();
       p1.sleep();

       Derived d = new Derived();
         d.p1.speak();
         d.p1.eat();


    
    
    }}