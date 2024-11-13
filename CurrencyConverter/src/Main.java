import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usdToPlnRate = 4.28; // Güncel kur oranını burada güncelleyebilirsiniz
        double plnToUsdRate = 1 / usdToPlnRate;

        System.out.println("Choose conversion direction:");
        System.out.println("1. USD to PLN");
        System.out.println("2. PLN to USD");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter amount in USD: ");
            double amountUSD = scanner.nextDouble();
            double amountPLN = convertCurrency(amountUSD, usdToPlnRate);
            displayConversion(amountUSD, "USD", amountPLN, "PLN", usdToPlnRate);
        } else if (choice == 2) {
            System.out.print("Enter amount in PLN: ");
            double amountPLN = scanner.nextDouble();
            double amountUSD = convertCurrency(amountPLN, plnToUsdRate);
            displayConversion(amountPLN, "PLN", amountUSD, "USD", plnToUsdRate);
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

        scanner.close();
    }

    public static double convertCurrency(double amount, double rate) {
        return amount * rate;
    }

    public static void displayConversion(double amountFrom, String fromCurrency, double amountTo, String toCurrency, double rate) {
        System.out.printf("%.2f %s at an exchange rate of %.2f is %.2f %s.%n", amountFrom, fromCurrency, rate, amountTo, toCurrency);
    }
}