/** Jude White
 *  2/28/24
*/
import java.util.*;
public class GCD {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int firstNum = input.nextInt();
        System.out.print("Enter a second number: ");
        int secondNum = input.nextInt();
        input.close();
        while(secondNum > 0){
            int temp = firstNum % secondNum;
            firstNum = secondNum;
            secondNum = temp;
        }
        System.out.println("The GCD is " + firstNum);
    }
}
