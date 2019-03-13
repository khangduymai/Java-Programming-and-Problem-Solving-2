/* Class     : P_DataEntryWithRepetition
 *
 * Purpose   : To demonstrate:
 *     - Declaring final String constants
 *     - Converting String input to an int using Integer.valueOf
 *     - Using while statement to control a repetition loop
 *     - Using the toLowerCase method of the String class to convert a value to lower case
 *     - Using the compareTo method of the String class to compare one String with another
 *     - Converting a String to a double
 *     - Converting an int to a String
 *    
 * Programmer: F D'Angelo
 *
 * Created   : 5/29/2013
 */

import java.util.Scanner;

public class P_DataEntryWithRepetition 
{
 public static void main(String[] args) 
 { 
  Scanner scannerObj = new Scanner(System.in);
     
  final String TERMINATE_SENTINEL = "n" ; // Entering "n" for continueFlag will terminate the loop.
  final int FREEZING_PT_OF_WATER = 32;
  
  int sum = 0 ;
  int count = 0 ;
  double fahrenheitTemp = 0.0 ;
  double celsiusTemp = 0.0 ;
  
  // Get input
  String inputValue = new String();
  String continueFlag = new String("y"); // Initialize to "y"
  
  // Since TERMINATE_SENTINEL is a String, we must use the compareTo method to compare it to other String objects. 
  // == will not compare values.

  while (continueFlag.toLowerCase().compareTo(TERMINATE_SENTINEL) != 0) 
  {
   System.out.print("\n\nEnter a temperature in degrees Fahrenheit to convert to Celsius: ");

   inputValue = scannerObj.nextLine();

   fahrenheitTemp = Double.valueOf(inputValue);
   celsiusTemp = (5.0 / 9) * ( fahrenheitTemp - FREEZING_PT_OF_WATER);

   System.out.print(fahrenheitTemp + " in degrees Fahrenheit is " + celsiusTemp + " in degress Celsius.");
   System.out.print("\n\nDo you want to convert another temperature from Fahrenheit to Celsius? Enter \"y\" or \"n\".: ");
  
   continueFlag = scannerObj.nextLine();
  }
 }
}