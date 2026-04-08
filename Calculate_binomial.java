// Calculating Binomial of a given number

import java.util.Scanner;

public class Calculate_binomial {

    static class Binomial {

        long factorial(int n) {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }

        long calculate(int n, int r) {

            if (r > n ) {
                return -1;   
            }

            long result = factorial(n) /
                    (factorial(r) * factorial(n - r));

            return result;
        }
    }

    public static void main(String[] args) {

 System.out.println("Name- kanishka  , batch-4 , specilation-core ,sap-590017366");

        Scanner sc = new Scanner(System.in);
        Binomial obj = new Binomial();

        System.out.println("Print the value of n:");
        int n = sc.nextInt();

        System.out.println("Print the value of r:");
        int r = sc.nextInt();

        long result = obj.calculate(n, r);

        if (result == -1) {
            System.out.println("Invalid data entry (r must be between 0 and n)");
        } else {
            System.out.println("Binomial coefficient of "
                    + n + " and " + r + " is: " + result);
        }

        sc.close();
    }
}
