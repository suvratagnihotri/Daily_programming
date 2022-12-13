import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        try{
            System.out.println("Enter the number to check it is prime or not.");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            if(number<=0){
                sc.close();
                throw new ArithmeticException();
            }
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
        catch(InputMismatchException inputMismatchException){
            System.out.println("Input must be an Integer.");
        }
        catch(NoSuchElementException noSuchElementException){
            System.out.println("No input value exist.");
        }
        catch(IllegalStateException illegalStateException){
            System.out.println("Unable to read the value as the scanner is closed.");
        }
        catch(ArithmeticException arithmeticException){
            System.out.println("Number must be greater than 0");
        }
        
    }
}
