/*2.2.  Write a Java program to input n numbers using command line arguments and print them in reverse order. */

public class Reverseno {
    public static void main(String[] args){
        System.out.println("Name- kanishka  , batch-4 , specilation-core ,sap-590017366");
        int num = Integer.parseInt(args[0]);
        int reverse = 0;
        
        while(num!=0){
            int digit = num%10;
            reverse = reverse*10 + digit;
            num = num / 10;
          }
          System.out.println("reverse number is : "+reverse);
    }
    
}
