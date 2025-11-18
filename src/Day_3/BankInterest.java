package Day_3;
import java.util.Locale;
import java.util.Scanner;

class Bank {
    // Method 1: accept account type as String and amount as double
    public double getInterestRate(String accountType, double amount) {
        String type = accountType.trim().toLowerCase(Locale.ROOT);
        double rate;
        switch (type) {
            case "savings":
                rate = 4.0;
                break;
            case "fixeddeposit":
            case "fixed deposit":
                rate = 6.0;
                break;
            case "recurringdeposit":
            case "recurring deposit":
                rate = 5.0;
                break;
            default:
                // unknown type -> assume 0% interest
                rate = 0.0;
        }
        // reuse the double,double overload
        return getInterestRate(rate, amount);
    }

    // Method 2: accept account code as int and amount as double
    // (1 = Savings, 2 = FixedDeposit, 3 = RecurringDeposit)
    public double getInterestRate(int accountCode, double amount) {
        double rate;
        switch (accountCode) {
            case 1: rate = 4.0; break; // Savings
            case 2: rate = 6.0; break; // FixedDeposit
            case 3: rate = 5.0; break; // RecurringDeposit
            default: rate = 0.0;       // unknown code
        }
        return getInterestRate(rate, amount);
    }

    // Method 3: accept rate (percent) and amount -> compute interest
    public double getInterestRate(double ratePercent, double amount) {
        return (ratePercent / 100.0) * amount;
    }
}

public class BankInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Accept either:
        // 1) Two-line input: first line = account type (e.g. "Savings"), second line = amount
        // 2) One-line input: "Savings 1000" (type and amount on same line)
        String accountType = "";
        double amount = 0.0;

        String firstLine = sc.hasNextLine() ? sc.nextLine().trim() : "";
        if (!firstLine.isEmpty()) {
            String[] parts = firstLine.split("\\s+");
            if (parts.length >= 2) {
                // e.g. "Savings 1000" or "FixedDeposit 2000"
                accountType = parts[0];
                try {
                    amount = Double.parseDouble(parts[1]);
                } catch (NumberFormatException e) {
                    // fall back to reading next token as double if present
                    if (sc.hasNextDouble()) {
                        amount = sc.nextDouble();
                    }
                }
            } else {
                // only account type on the first line; read amount from next token/line
                accountType = parts[0];
                if (sc.hasNextDouble()) {
                    amount = sc.nextDouble();
                }
            }
        }
        sc.close();

        Bank bank = new Bank();
        // Compute interest using the String,double overload (as required by input format)
        double interest = bank.getInterestRate(accountType, amount);

        // Print result in the sample format: "Interest: 400.0"
        System.out.printf("Interest: %.1f%n", interest);
    }
}
