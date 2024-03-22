/** Jude White
 *  2/28/24
*/
public class Exercise3 {
    public static void main(String[] args){
        double cash = 2500;
        int years = 0;
        do{
           cash = cash * 1.075;
           years += 1;
        }while(cash <= 5000);
        System.out.println("It will take " + years + " years.");
    }
}
