/*class ThreadLearning extends Thread {
    public void run() {
        try {
            System.out.println("Running...");
            Thread.sleep(1000); 
            System.out.println("Finished work");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        ThreadLearning t = new ThreadLearning(); // NEW

        t.start(); // Runnable → Running

        System.out.println("Main thread running");
    }
} */

  /*   class A extends Thread {
public void run() {
System.out.println("Priority: " + getPriority());
}
}
public class ThreadLearning {

public static void main(String[] args) {
A t1 = new A();
A t2 = new A();
t1.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(Thread.MAX_PRIORITY);
t1.start();
t2.start();
}
}
*/

/* 
class A extends Thread {
    public void run(){
        for(int i=0 ;i<5;i++){
            System.out.println("Thread of class A");
            try{ 
                Thread.sleep(500);
             }catch(InterruptedException e){
                System.out.println(e);
             }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0 ;i<5;i++){
            System.out.println("Thread of class B"); 
            try{ 
                Thread.sleep(500);
             }catch(InterruptedException e){
                System.out.println(e);
             }
        }
    }
}

public class ThreadLearning {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
       
    }
}*/

/* 
class A implements Runnable{
   public void run(){
    for(int i=0 ; i<5 ; i++){
        System.out.println("this ia a thread of class A");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }}
}
class B implements Runnable{
    public void run(){
        for(int i=0 ; i<5 ; i++){
        System.out.println("this ia a thread of class B");
        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }}
    }
}
public class ThreadLearning{
    public static void main(String[] args) {
        Runnable obj1=new A();
        Runnable obj2=new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
    */

/*                         USING ANAONYMUS CLASS
public class ThreadLearning{
    public static void main(String[] args) {

        Runnable obj1 = new Runnable(){
            public void  run(){
             
                for(int i=0 ; i<5 ; i++){
                    System.out.println("this is a thread of anonymous class 1 ");
                try {
                    
                    Thread.sleep(500);
                } catch (InterruptedException  e) {
                    System.out.println(e);
                }
                }

            }

        };

        Runnable obj2 = new Runnable(){
            public void run(){
                for(int i=0 ; i<5 ; i++){
                    System.out.println("this is a thread of anonymous class 2");

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();


        
    }
}*/

/*                        USING LAMBDA EXPRESSION 
public class ThreadLearning{

    public static void main(String[] args) {
        Runnable obj1 = () ->
        {
        for(int i=0 ; i<5 ;i++){
            System.out.println(" this is a lambda expression Thread -1 ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        };


     Runnable obj2 = () ->
        {
        for(int i=0 ; i<5 ;i++){
            System.out.println(" this is a lambda expression Thread-2");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        };

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();


}}
    */

/* 
public class ThreadLearning{
    public static void main(String[] args) {
        
        Thread t1 = new Thread(() ->
        {
            for(int i=0 ; i<5 ;i++){
            System.out.println(" this is a lambda expression Thread-2");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    });

     Thread t2 = new Thread(() ->
        {
            for(int i=0 ; i<5 ;i++){
            System.out.println(" this is a lambda expression Thread-2");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    });

    t1.start();
    t2.start();

}}*/


/* public class ThreadLearning extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " Priority: " + Thread.currentThread().getPriority());
                  System.out.println(Thread.currentThread().getName());
                  System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {

        ThreadLearning t1 = new ThreadLearning();
        ThreadLearning t2 = new ThreadLearning();

        t1.setName("Low Priority Thread");
        t2.setName("High Priority Thread");

       // t1.setPriority(5);  // 1
        //t2.setPriority(6);  // 10

        t1.start();
        t2.start();
    
}}*/




/*
class Counter {
    int count = 0;

    synchronized void increment() {
        count++;   // Now safe
    }
}

class MyThread extends Thread {
    Counter c;

    MyThread(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

public class ThreadLearning  {
    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.count);
    }
}
    */