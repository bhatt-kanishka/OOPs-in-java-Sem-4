import java.util.*;

// 1. Payment Interface
interface Payment {
    void pay(double amount) throws Exception;
}

// 2. Custom Exceptions
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class InvalidCardException extends Exception {
    public InvalidCardException(String msg) {
        super(msg);
    }
}

class InvalidUPIException extends Exception {
    public InvalidUPIException(String msg) {
        super(msg);
    }
}

// 3. Credit Card Payment Class
class CreditCardPayment implements Payment {
    private String cardNumber;
    private double balance;

    public CreditCardPayment(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public void pay(double amount) throws Exception {
        
        // Validate card number (must be 16 digits)
        if (cardNumber.length() != 16 || !cardNumber.matches("\\d+")) {
            throw new InvalidCardException("Invalid Credit Card Number!");
        }

        // Check balance
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }

        balance -= amount;
        System.out.println("Payment successful via Credit Card!");
        System.out.println("Remaining Balance: " + balance);
    }
}

// 4. UPI Payment Class
class UPIPayment implements Payment {
    private String upiId;
    private double balance;

    public UPIPayment(String upiId, double balance) {
        this.upiId = upiId;
        this.balance = balance;
    }

    public void pay(double amount) throws Exception {

        // Validate UPI ID (basic check: must contain '@')
        if (!upiId.contains("@")) {
            throw new InvalidUPIException("Invalid UPI ID!");
        }

        // Check balance
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }

        balance -= amount;
        System.out.println("Payment successful via UPI!");
        System.out.println("Remaining Balance: " + balance);
    }
}

// 5. Main Class
public class PaymentPlatform {
    public static void main(String[] args) {
        try {
            Payment p1 = new CreditCardPayment("1234567812345678", 5000);
            p1.pay(2000);

            System.out.println();

            Payment p2 = new UPIPayment("user@upi", 3000);
            p2.pay(3500); // Will throw exception

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}