/*  Write a java program to calculate compund intereset. Take required inputs using Scanner class. */
// more clearner version 

import java.util.Scanner;

public class Compoundintrest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
          System.out.println("Name- kanishka  , batch-4 , specilation-core ,sap-590017366");
        
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest = " + compoundInterest);
        System.out.println("Total Amount = " + amount);


        sc.close();
        System.out.println("Name- kanishka  , batch-4 , specilation-core ,sap-590017366");
    }}
    

