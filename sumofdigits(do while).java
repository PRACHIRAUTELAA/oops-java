import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int temp = n;

        do {
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        } while (temp > 0);

        System.out.println("Sum of digits of " + n + " = " + sum);
        sc.close();
    }
}
