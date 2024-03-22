/** Jude White
 *  2/28/24
*/
import java.util.*;
public class Exercise6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();
        int ones = num % 10;
        int tens = ((num % 100) - ones)/10;
        int huns = (num - (ones + tens))/100;
        int sum = ones + tens + huns;
        System.out.println("The sum of the digits is " + sum);
    }
}
