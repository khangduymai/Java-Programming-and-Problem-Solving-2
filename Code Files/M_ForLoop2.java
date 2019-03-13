/* Class     : K_ForLoop2
 * Purpose   : To demonstrate:
 *     - Declaring final String constants
 *     - Obtaining String input from a Scanner object
 *     - Converting String input to an int using Integer.parseInt
 *     - Using a for statement to control a repetition loop
 */
/*
 Things to try:
 
 - Change the test condition from less than to less than or equal to.
 - Change idxVar++ to idxVar +=3 or some other value
 
 */
import java.util.Scanner;

public class M_ForLoop2 {
   public static void main(String[] args) { 
      int sum = 0 ;
      int count = 0 ;
      int startValue = 0;
      int testValue = 0;
      double avg = 0.0 ;
      
      Scanner scannerObj = new Scanner(System.in);
      
      // Get input
      String inputValue = new String();
      System.out.print("\n\nEnter the starting value for the index that controls a \"for\" loop: ");
      
      inputValue = scannerObj.nextLine();
      startValue = Integer.parseInt( inputValue);
      
      System.out.print("Enter the test value that will terminate a \"for\" loop            : ");
      
      inputValue = scannerObj.nextLine();
      testValue = Integer.parseInt( inputValue);
      
      System.out.print("\n");
      
      for (int idxVar = startValue ; idxVar < testValue; idxVar++ ) {
         System.out.print("\nidxVar: " + idxVar );
      }
      
      System.out.println("\n");
   }
}