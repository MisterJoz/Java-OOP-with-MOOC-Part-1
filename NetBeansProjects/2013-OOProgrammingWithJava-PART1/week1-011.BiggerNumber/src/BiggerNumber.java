
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");// Implement your program here. Remember to ask the input from user
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        int big = Math.max(number1, number2);
        System.out.println("the bigger of the two numbers given was: " + big);
                
        
        
      
        

    }
}
