public class Main {
    public static void main(String[] args) {
        int rows = 5;   // number of rows
        int cols = 10;  // number of columns

        // outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // inner loop for columns
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            // move to the next line after printing each row
            System.out.println();
        }
    }
}
