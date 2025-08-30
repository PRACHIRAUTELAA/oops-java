import java.util.*;
public class QuadraticEqn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients a, b, and c of the quadratic equation (ax^2 + bx + c = 0):");
        double a = sc.nextInt();
        double b = sc.nextInt(); 
        double c = sc.nextInt();
        double d = Math.sqrt(b*b -4*a*c);
            if (d > 0){
                System.out.println("the roots are real and distinct");
                double root1 = (-b + d) / (2 * a);
                double root2 = (-b - d) / (2 * a);
                System.out.println("Root 1: " + root1 + ", Root 2: " + root2);
            } else if (d == 0) {
                System.out.println("the roots are real and equal");
                double root = -b / (2 * a);
                System.out.println("Root: " + root);
            } else {
                System.out.println("the roots are complex");
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(4 * a * c - b * b) / (2 * a);
                System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
                System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
            }
        }

    }
