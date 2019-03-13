/* Class     : O_WhileLoop
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
 - Make other changes to the initial value of iCount to that of the test value.
 - Change the test condition from less than to less than or equal to.
 - Change iCount++ to iCount +=3 or some other value

*/

public class O_WhileLoop
{
 public static void main(String[] args) 
 { 
  System.out.print("\n");

  int iCount = 0 ; // Note that this variable exists outside the loop.
  while ( iCount++  < 10 ) // Using the postfix increment.
  {
   System.out.println("Using postfix++, the value of iCount is " + iCount ) ;
  }
  System.out.println("") ;
  
  iCount = 0 ; // must reset iCount to 0 because it has its last value from the previous loop.
  while ( ++iCount  < 10 ) // Using the prefix increment.
  {
   System.out.println("Using prefix++, the value of iCount is " + iCount ) ;
  }
 }
}