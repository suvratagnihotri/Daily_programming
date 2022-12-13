import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to check it is prime or not.");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        sc.close();
        for(int i = 1; i<number/2; i++){
            if(number%i==0){
                count++;
            }
        }
        if(count>1){
            System.out.println(number +"  Is not a prime number");
        }
        else{
            System.out.println(number +"  Is a prime number");
        }
    }
}
