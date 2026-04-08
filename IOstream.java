/*import java.io.*;

public class IOstream {
    public static void main(String[] args)throws IOException {
        FileInputStream fis = new  FileInputStream("input.txt");
         FileOutputStream fos = new  FileOutputStream("output.txt");
         int data;
         while ((data = fis.read()) !=-1) {
fos.read(data);
}
fis.close();
fos.close();
}
}

*/

/* 
import java.io.*;

public class IOstream {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close the file
        try (FileInputStream fis = new FileInputStream("input.txt")) {
            
            int data;
            // fis.read() returns the byte as an int, or -1 if the end is reached
            while ((data = fis.read()) != -1) {
                // Convert the byte (int) back to a character to see the text
                System.out.print((char) data);
            }
            
        } catch (FileNotFoundException e) {
            System.err.println("The file 'input.txt' was not found.");
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
        }
    }
}*/


/*   READING DATA USING BYTESTREAM !
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
    */


import java.io.*;
import java.util.Scanner;



class A{
    

}
