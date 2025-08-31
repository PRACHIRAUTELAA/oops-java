import java.util.Scanner;

public class NumberLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        number = Math.abs(number);
        int length = 0;

        if (number == 0) {
            length = 1;
        } else {
            while (number > 0) {
                number /= 10;
                length++;
            }
        }

        System.out.println("Length of the number: " + length);
        scanner.close();
    }
}
