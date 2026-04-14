import java.io.*;
import java.util.Scanner;

class Write{

    void writee(){
        try{
        System.out.println("Enter the data to be written in a file : ");
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        FileOutputStream fow = new FileOutputStream("calculatetext.txt");

        fow.write(text.getBytes());

        }
        catch(IOException e){
            System.out.println("this is forming an exception : "+e);
        }
    }
}



public class Calculatelines {
    public static void main(String[] args) {
        
    
    Write obj = new Write();
    obj.writee();
    }
}
