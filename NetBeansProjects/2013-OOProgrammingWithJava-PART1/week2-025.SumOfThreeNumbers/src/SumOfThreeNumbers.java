
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable


        System.out.println("Type the first number: ");// Write your program here
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        System.out.println("Type the second number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        System.out.println("Type the third number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
