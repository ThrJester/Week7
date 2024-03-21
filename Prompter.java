/** Jude White
 *  2/28/24
*/
import java.util.*;
public class Prompter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int minNum = input.nextInt();
        System.out.print("Enter a second number: ");
        int maxNum = input.nextInt();
        int temp;
        if(minNum > maxNum){
            temp = maxNum;
            maxNum = minNum;
            minNum = temp;
        }
        boolean numMet = false;
        int twixt = 0;
        while(!numMet){
            System.out.print("Enter a number between " + minNum + " and " + maxNum);
            twixt = input.nextInt();
            if(twixt > minNum && twixt < maxNum){
                numMet = true;
            }
            else{
                System.out.println(twixt + " is not between " + minNum + "and " + maxNum + ". Try again.");
            }
        }
        input.close();
        System.out.println(twixt + " is between " + minNum + "and " + maxNum + ". Good job.");
    }
}
