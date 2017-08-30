
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");// Type your program here:
        int number = Integer.parseInt(reader.nextLine());
        
        if (number > 0) {
            System.out.println("The number is positive. ");
         else { 
            System.out.println("Your number is not positive. ");
        }
        }
        
   
    }
}
