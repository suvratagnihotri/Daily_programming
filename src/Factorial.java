import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number to find the factorial of a number :");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        sc.close();
        double factorial = 1;
        for(int i=1; i<=number;i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial of the number is :"+factorial);

    }
}
