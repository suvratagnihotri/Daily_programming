import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number to check whether it is even or odd :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        if(number%2==0){
            System.out.println("Number is Even.");
        }
        else{
            System.out.println("Number is Odd.");
        }

    }
}
