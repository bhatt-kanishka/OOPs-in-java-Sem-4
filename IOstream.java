/*   READING DATA USING BYTESTREAM !  */
import java.io.*;

class A{
    void readfile(){
    try(FileInputStream fis = new FileInputStream("input.txt")){
        int data;
        while((data = fis.read()) != -1){
            System.out.print((char)data);
        }

    }
    catch(FileNotFoundException e){
    System.out.println("this file do not exist");}
    catch(IOException e){
        System.out.println("an error occured while reading the file ");
    }

}}

public class IOstream{
    public static void main(String[] args) {
        A obj = new A();
        obj.readfile();


    }
}
   


