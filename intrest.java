import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the number of years: ");
        double years = input.nextDouble();

        System.out.print("Is the customer a senior citizen (y/n): ");
        char customerType = input.next().charAt(0);

        double rateOfInterest = (customerType == 'y') ? 0.12 : 0.10;

        double interest = calculateSimpleInterest(principal, years, rateOfInterest);
        System.out.println("Interest: " + interest);

        input.close();
    }

    public static double calculateSimpleInterest(double principal, double years, double rate) {
        if (principal < 0 || years < 0) {
            return 0;
        }
        return principal * rate * years;
    }
}
