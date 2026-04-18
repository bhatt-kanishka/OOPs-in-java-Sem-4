/*  Write a Java program to create two threads. One thread prints numbers from 1–10. Another thread prints alphabets from A–J. Both should run simultaneously. */

class NumberThread  extends Thread{
    public void run(){
        for(int i=1 ; i<=10 ; i++){
            System.out.print(i);
            try {
                Thread.sleep(100);
                } catch(InterruptedException e){
                    System.out.println(e);
            }
        }
    }
}

class AlphabetThread extends Thread{
    public void run(){
        for(char ch='A'; ch<='J' ; ch++){
            System.out.print(ch);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            
        }
    }
}

public class Parallelthread {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread();
        AlphabetThread t2 = new AlphabetThread();

        t1.start();
        t2.start();
    }}