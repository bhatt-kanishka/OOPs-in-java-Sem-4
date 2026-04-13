// taking data from a file using Buffer reader class

import java.io.*;

public class IObuffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.println(" Enter your text : ");

        String str = br.readLine();

        System.out.println("Entered text is : "+str);
}
  }
