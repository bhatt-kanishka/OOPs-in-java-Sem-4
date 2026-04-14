import java.io.*;
import java.util.Scanner;


class WriteInFile{
    void write(){
        
    try{
        
    System.out.println("enter the text to becopied : ");
       
    Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
      
    FileOutputStream fos = new FileOutputStream("file-1.txt");

    fos.write(str.getBytes());

    fos.close();

    System.out.println("Data is Succesfully copied **");
}   catch(IOException e){
    System.out.println("Error : " + e.getMessage());
}}
}


class Readfromfile extends WriteInFile {

    void copy(){  
        try{ 
    FileInputStream fis = new FileInputStream("file-1.txt");
    
    FileOutputStream fos = new FileOutputStream("file-2.txt");

    int data;
    while((data=fis.read()) != -1){
    fos.write(data);
    }
fis.close();
fos.close();
System.out.println("data is copied from file 1 to 2");
}
catch(IOException e){
    System.out.println("Error caught while reading data : "+e);
}}
}


       
       
       public class CopingData {
    public static void main(String[] args) throws IOException {

        WriteInFile abc = new WriteInFile();
        abc.write();
          Readfromfile obj = new Readfromfile();

       
        obj.copy();  
    }
}


    