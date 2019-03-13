/* Class     : K_LetterGrades2
 * Purpose   : To demonstrate:
 *     - Declaring and initializing variables
 *     - Using an object of the Scanner class to obtain input
 *     - Converting String input to a float using the Float.parseFloat method
 *     - Using a simple if statement to test whether a value falls in a range
 *     - Appending a number of Strings to a StringBuffer
 *     - Converting a StringBuffer to a String
 *    
 * Programmer: F D'Angelo
 * Created   : 5/29/2013
 */

import java.util.Scanner;

public class K_LetterGrades2 {
 public static void main(String[] args)  {
  Scanner scannerObj = new Scanner(System.in);

  String inputValue = "" ;
  String letterGrade = "" ;
  
  // Java assumes that numeric literals containing decimal places are doubles, so we must apend "F" or "f" to indicate it's a float.
  float numericGrade = 0.0F; 

  System.out.print("\nEnter a numeric grade: " );

  inputValue = scannerObj.nextLine();
  numericGrade = Float.parseFloat(inputValue);

  if ( numericGrade >= 90 )
   letterGrade = "A";
  else if ( numericGrade >= 80 )
   letterGrade = "B";
  else if ( numericGrade >= 70 )
   letterGrade = "C";
  else if ( numericGrade >= 60 )
   letterGrade = "D";
  else
   letterGrade = "F";

  System.out.println("\nA numeric grade of " + numericGrade + " corresponds to a letter grade of " + letterGrade + "\n");
 }
}