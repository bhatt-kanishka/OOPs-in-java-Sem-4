import java.util.Scanner;

public class NBitBinaryCounter {

    public static void main(String[] args) {

System.out.println("Name- kanishka  , batch-4 , specilation-core ,sap-590017366");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int limit = 1 << n;   // 2^n using left shift

        for (int i = 0; i < limit; i++) {

            for (int j = n - 1; j >= 0; j--) {

                int mask = 1 << j;

                // Using AND gate
                int bit = (i & mask);

                // Optional XOR demonstration (toggle logic)
                bit = (bit ^ 0);   // XOR with 0 keeps value same

                if (bit != 0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }

            System.out.println();
        }

        sc.close();
    }
}
