/** Jude White
 *  2/28/24
*/
import java.util.*;
public class Grades {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number grade (1-100): ");
        int yourGrade = input.nextInt();
        input.close();
        if(yourGrade >= 91){
            System.out.println("Your letter grade is an A. Outstanding work!");
        }
        else if(yourGrade >= 82){
            System.out.println("Your letter grade is a B. You're doing decent.");
        }
        else if(yourGrade >= 73){
            System.out.println("Your letter grade is a C. You could probably do put some more effort in.");
        }
        if(yourGrade >= 65){
            System.out.println("Your letter grade is an D. You're doing pretty badly.");
        }
        else{
            System.out.println("Your letter grade is an F. How did you even fail this bad like wow that requires active effort I'm impressed.");
        }
    }
}
