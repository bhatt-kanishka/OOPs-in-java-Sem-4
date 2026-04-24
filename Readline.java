/* Java program to wrrite in a file and count
Number of lines.
Number of charater.
Number of  words*/

import java.io.*;
import java.util.Scanner;

class A{
    int count_char;
    int count_lines;
    int count_words;
    Scanner sc = new Scanner(System.in);

    void no_of_lines(){
         
        try {
          
            FileWriter  fw = new FileWriter("readline.txt");
            System.out.println("Enter text into file and type 'exit' to stop : ");
                while (true) { 
                  
                    String s = sc.nextLine();
                    
                        if(s.equalsIgnoreCase("exit")){
                            break;
                        }

                        if(!s.trim().equals(" ")){
                            String words[] = s.trim().split("\\s+");
                            count_words += words.length;
                        }

                            if(!s.equals("")){
                                count_lines++;
                            }

                         fw.write(s+"\n");
                     } 
                fw.close();
               
             } catch (IOException e){
                 System.out.println(e);
}

System.out.println("\n\nNumber of lines: " + count_lines);
System.out.println("Number of words: " + count_words);

    }

    void charater(){
        try {

             FileReader fr = new FileReader("readline.txt");

             int ch;
              while ((ch = fr.read()) != -1){
                if(ch != '\n' && ch != ' '){
                count_char++;
              }
            } 

        
        fr.close();
    }
            catch (IOException  e) {
            System.out.println(e);
        }

        
    
System.out.println(" No of charters in this file : "+count_char);

}
    

}

public class Readline{
        public static void main(String[] args) {
            A obj = new A();
            obj.no_of_lines();
            obj.charater();
        }
    }