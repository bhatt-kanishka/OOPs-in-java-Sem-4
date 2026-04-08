import java.util.Scanner;

public class Strong_num {

    void checkStrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong Number.");
        } else {
            System.out.println(original + " is not a Strong Number.");
        }
    }

    public static void main(String[] args) {

System.out.println("Name- kanishka  , batch-4 , specilation-core ,sap-590017366");
        
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Strong_num obj = new Strong_num();
        obj.checkStrong(num);

        sc.close();
    }
}

