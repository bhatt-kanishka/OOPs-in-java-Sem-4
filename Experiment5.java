
import java.util.Scanner;

class Arthemetic1 {
    void division() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int div = a / b;
            System.out.println("The division is : " + div);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

class NumberFormatException1 {
    void numberFormat() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number in string format: ");
            String str = sc.next();

            int num = Integer.parseInt(str);
            System.out.println("The number is : " + num);
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.Invalid format exception.");
        }
    }
}



class ArrayIndexOutOfBoundsException1 {

    void arrayIndex() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        while (true) {
            try {
                System.out.print("Enter index to access: ");
                int index = sc.nextInt();

                System.out.println("Element at index " + index + " is: " + arr[index]);
                break; // correct index → exit loop
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index out of bounds. Please enter index between 0 and " + (n - 1));
            }
        }
    }
}


public class Experiment5 {
    public static void main(String[] args) {

        Arthemetic1 art = new Arthemetic1();
        art.division();

        NumberFormatException1 numFormat = new NumberFormatException1();
        numFormat.numberFormat();

        ArrayIndexOutOfBoundsException1 arrIndex = new ArrayIndexOutOfBoundsException1();
        arrIndex.arrayIndex();
    }
}
