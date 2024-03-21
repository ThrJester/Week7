/** Jude White
 *  2/28/24
*/
import java.util.*;
public class NumberSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number. Preferably not too high. ");
        int endGoal = input.nextInt();
        input.close();
        boolean counted = false;
        int numCount = 1;
        int totalCount = 1;
        while(!counted){
            System.out.println(numCount);
            numCount += 1;
            totalCount += numCount;
            if(numCount == endGoal)
            counted = true;
        }
        System.out.println(totalCount);
    }
}
