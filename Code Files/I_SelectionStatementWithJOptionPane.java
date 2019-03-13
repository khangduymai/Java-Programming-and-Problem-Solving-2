/* Class     : I_SelectionStatement
 * Purpose   : To demonstrate:
 *     - Declaring final String constants
 *     - Selecting an option using the JOptionPane showInputDialog method.
 *     - Obtaining String input from a JOptionPane using its showInputDialog method
 *     - Converting String input to a double using Double.valueOf
 *     - Using an if statement to determine whether to calculate a discounted price
 *     - Converting a double to a String
 *     - Appending a number of Strings to a StringBuffer
 *     - Converting a StringBuffer to a String
 *     - Displaying results in a JOptionPane using its showMessageDialog method
 *    
 * Programmer: F D'Angelo
 * Created   : 5/29/2013
 */

import javax.swing.JOptionPane;

public class I_SelectionStatementWithJOptionPane
{
 public static void main(String[] args) 
 {
  final int NUMBER_OF_ITEMS_REQUIRED_FOR_DISOUNT = 3 ; // a constant
  final double DISCOUNT_RATE = 0.20 ; // a constant
   
  String inputValue = new String();

  StringBuffer discountMessageSB = new StringBuffer();  // We use StringBuffers because Java can efficiently modify them.
  StringBuffer resultsBuffer = new StringBuffer(); // Strings in Java are not modifiable; it often appears that we can modify, but
         // this actually creates a new String and marks the old one for deletion.
  
  String msg1 = new String() ;
  
  final String ITEM_OPTION_1 = "Blue jeans" ;  // a constant
  final String ITEM_OPTION_2 = "T-Shirts" ;  // a constant
  final String ITEM_OPTION_3 = "Slacks" ;  // a constant
  final String ITEM_OPTION_4 = "Button shirts" ;  // a constant

  int numberOfItemsPurchased = 0;
  double purchasePricePerItem = 0.0 ;
  double totalPrice = 0.0 ;
  
  // Array of String objects for the list of options to display in a drop down list. 
  // Using final constants reduces errors in the "if" statement below.

  Object[] choices = {ITEM_OPTION_1, ITEM_OPTION_2, ITEM_OPTION_3, ITEM_OPTION_4}; 
  
  String typeOfItemToPurchase = (String)JOptionPane.showInputDialog(
                      null,    // parent object
                      "Select the item to purchase", // Message
                      "Choose Items to Purchase",  // Title
                      JOptionPane.QUESTION_MESSAGE, // Question mark icon
                      null,
                      choices,    // Array of options
                      choices[0]);   // Default option
  
  // Get input
  inputValue = JOptionPane.showInputDialog(null, "Enter number of items to purchase", typeOfItemToPurchase, JOptionPane.PLAIN_MESSAGE);
  
  numberOfItemsPurchased = Integer.valueOf(inputValue) ;
  
  inputValue = JOptionPane.showInputDialog(null, "Enter regular price of " + typeOfItemToPurchase, 
        typeOfItemToPurchase, JOptionPane.PLAIN_MESSAGE);
  
  purchasePricePerItem = Double.valueOf(inputValue) ;
  
  if (numberOfItemsPurchased >= NUMBER_OF_ITEMS_REQUIRED_FOR_DISOUNT ) // Using final constants reduces errors.
  {
   purchasePricePerItem *= (1 - DISCOUNT_RATE); // equivalent to purchasePricePerItem = (1 - DISCOUNT_RATE) * purchasePricePerItem ;
   discountMessageSB.append("\nThe price reflects a "); // Notice the newline character.
   double discountPercent = 100 * DISCOUNT_RATE ;
   discountMessageSB.append( Double.toString( discountPercent ));
   discountMessageSB.append("% discount.");
  }
  
  totalPrice = purchasePricePerItem * numberOfItemsPurchased ;
  
  // Here we build the final message in a StringBuffer by appending more data to it.
  resultsBuffer.append("The amount owed for ");
  resultsBuffer.append(Integer.toString(numberOfItemsPurchased));
  resultsBuffer.append(" ");
  resultsBuffer.append(typeOfItemToPurchase);
  resultsBuffer.append("(s) at ");
  resultsBuffer.append(Double.toString(purchasePricePerItem));
  resultsBuffer.append(" is ");
  resultsBuffer.append(Double.toString(totalPrice));
  resultsBuffer.append(discountMessageSB);
  
  String result = resultsBuffer.toString();
  
  // showMessageDialog is a static method of the JOptionPane class.
  JOptionPane.showMessageDialog(null, result, "Bill", JOptionPane.PLAIN_MESSAGE);
 }
}