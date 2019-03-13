/* Class     : H_TempConversion
 * Purpose   : To demonstrate:
 *     - Obtaining String input from a Scanner object using its nextLine() method
 *     - Converting String input to a double using Double.valueOf
 *     - Using an if statement to determine which calculation to perform
 *     - Converting a double to a String
 *    - Promoting int values in an assignment statement to a double
 */

import java.util.Scanner;

public class H_TempConversion 
{
 public static void main(String[] args) 
 {
  final String FAHRENHEIT_TO_CELSIUS_OPTION = "1" ;
  final String CELSIUS_TO_FAHRENHEIT_OPTION = "2" ;
  
  String inputValue = new String();
  String resultsMsg = "";
 
  double fahrenheitTemp = 0.0;
  double celsiusTemp = 0.0;
  double tempToConvert = 0.0;

  Scanner scannerObj = new Scanner(System.in);
   
  // Get input
  System.out.println("\n\nEnter " + FAHRENHEIT_TO_CELSIUS_OPTION + " to convert degrees Fahrenheit to degrees Celsius or");
  System.out.print("enter " + CELSIUS_TO_FAHRENHEIT_OPTION    + " to convert degrees Celsius to degrees Fahrenheit   : ");

  String conversionType = scannerObj.nextLine();
  
  System.out.print("\n\nEnter the temperature to convert: ");
  inputValue = scannerObj.nextLine();

  tempToConvert = Double.valueOf(inputValue);
  
  // Must use a method, like equals not ==, to compare String values.
  if (conversionType.equals(FAHRENHEIT_TO_CELSIUS_OPTION)) // Using final constants reduces errors. 
  {   
   celsiusTemp = (5.0/9) * (tempToConvert - 32) ; // notice using .0 to force Java to promote the results to a double.

   resultsMsg = Double.toString(tempToConvert) + " in degrees Fahrenheit is " + 
     Double.toString(celsiusTemp) + " in degrees Celsius.\n" ;
  }
  
  else if (conversionType.equals(CELSIUS_TO_FAHRENHEIT_OPTION)) // Using final constants reduces errors.
  {   
   fahrenheitTemp = (9.0/5.0) * tempToConvert + 32.0 ; // notice using .0 to force Java to promote the results to a double.

   resultsMsg = Double.toString(tempToConvert) + " in degrees Celsius is " + 
     Double.toString(fahrenheitTemp) + " in degrees Fahrenheit.\n" ;
  } 
  
  System.out.println("\n\n" + resultsMsg); // Notice that we use a pre-built String here.
 }
}