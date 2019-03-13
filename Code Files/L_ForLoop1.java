/* Class     : L_ForLoop1
 * Purpose   : To demonstrate:
 *     - Declaring final String constants
 *     - Obtaining String input from a Scanner object
 *     - Converting String input to an int using Integer.parseInt
 *     - Using a for statement to control a repetition loop
 *    
 * Programmer: F D'Angelo
 * Created   : 8/13/2014
 */

/*
 Things to try:
 
 - Change the initial value of idxVar to that of the test value.
 - Make other changes to the initial value of idxVar to that of the test value.
 - Change the test condition from less than to less than or equal to.
 - Change idxVar++ to idxVar +=3 or some other value
 
 */

public class L_ForLoop1{
   public static void main(String[] args){ 
      
      System.out.println("");
      
      for (int idxVar = 0 ; idxVar < 10; idxVar++ ){
         System.out.println("idxVar: " + idxVar );
      }
      
      System.out.println("\n");
   }
}