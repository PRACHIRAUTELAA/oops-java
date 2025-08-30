import java.util.Scanner;
public class Difference{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int diff=a-b;
        if(diff >= 0){
            System.out.println("The difference is positive");
        }
        else{
            System.out.println("The difference is negative");
        }
    }
}
