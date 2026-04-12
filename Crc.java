// CRC creation cyclic reduncy check
import java.util.Scanner;

public class Crc {

    // Method to perform XOR division
    void crc_calculation(String data, String generator) {

        int m = generator.length();

        // Append zeros
        String appended = data + "0".repeat(m - 1);

        char[] dividend = appended.toCharArray();
        char[] divisor = generator.toCharArray();

        for (int i = 0; i <= appended.length() - m; i++) {

            if (dividend[i] == '1') {

                for (int j = 0; j < m; j++) {
                    // XOR operation
                    dividend[i + j] = (dividend[i + j] == divisor[j]) ? '0' : '1';
                }
            }
        }

        // Remainder is last (m-1) bits
        String remainder = "";
        for (int i = appended.length() - (m - 1); i < appended.length(); i++) {
            remainder += dividend[i];
        }

        System.out.println("Appended Data: " + appended);
        System.out.println("Remainder: " + remainder);
        System.out.println("Codeword: " + data + remainder);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Crc obj = new Crc();

        System.out.print("Enter Data: ");
        String data = sc.next();

        System.out.print("Enter Generator: ");
        String generator = sc.next();

        obj.crc_calculation(data, generator);
    }
}

