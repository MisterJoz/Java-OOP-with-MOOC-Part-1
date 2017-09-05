
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int num = 1;// Write your code here
        System.out.print("Up to what number? ");
        int upTo = Integer.parseInt(reader.nextLine());
        while (num <= upTo){
            System.out.println(num);
            num = num + 1;
        }
        
      
    }
}
