import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        int lcm = numbers[0];
        int gcd = numbers[0];
        
        for (int i = 1; i < n; i++) {
            lcm = findLCM(lcm, numbers[i]);
            gcd = findGCD(gcd, numbers[i]);
        }
        
        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);
    }
    
    public static int findLCM(int a, int b) {
        return a * b / findGCD(a, b);
    }
    
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
