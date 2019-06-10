/*******************************************************************************************************************
  * InputValidationPractice.java
  * CIS 129 - Programming and Problem Solving I 
  * Pima Community College 
  ****************************************************************************************************************** 
  * To Do: 
  * 1. Compile. The program should compile successfully.
  * 2. Create the below program output using standard input validation routines.
  * 3. The first two questions should use the same input validation function.
  * 
  * 
  * 
  * 
  * Please enter a low value (3 through 9)
  * 7
  * Please enter a high value (8 through 15) <-- note: low value shown here is 1 more than the low value entered above
  * 12
  * 7 + 8 + 9 + 10 + 11 + 12 = 57
  * 
  * Requirements:  
  *     - Odd number
  *     - greater than 10 and less than 200 -OR- equal to 300 or 400 or 1000
  *     - not 103, 133, 166, or 199 
  *     - not equal to the number calculated above (57, in this example) 
  * Please enter an integer that meets the above requirements: 
  * 103
  * That number does not meet the requirements
  * Please enter an integer that meets the above requirements: 
  * 135
  * That works! 
  * 
  * Do you want to do this again? (y/n)              <-- note: use IR4.getYorN("....")
  * 
  ******************************************************************************************************************/ 

public class InputValidationPractice {
    //Global Constants
    final static int ENTERED_LOW_VALUE_1 = 3;
    final static int ENTERED_HIGH_VALUE_1 = 9;
    final static int ENTERED_HIGH_VALUE_2 = 15;
    
    final static int GOOD_LOW_VALUE = 11;
    final static int GOOD_HIGH_VALUE = 199;
    final static int SPECIAL_VALUE_1 = 300;
    final static int SPECIAL_VALUE_2 = 400;
    final static int SPECIAL_VALUE_3 = 1000;
    final static int SPECIAL_VALUE_4 = 103;
    final static int SPECIAL_VALUE_5 = 133;
    final static int SPECIAL_VALUE_6 = 166;
    final static int SPECIAL_VALUE_7 = 199;
    
    public static void main(String[] args) {
        do {

            
            
            
            
            
            
        }while (IR4.getYorN("Do you want to do this again? (y/n)"));
        
        IR4.closeScanner();
        System.out.println("Program Terminating Normally");
    }//end of main
    
    
    
    
    
    
    
     private static void displayRequirements(){
        System.out.println("Requirements:");  
        System.out.println("     - Odd number");
        System.out.println("     - greater than 10 and less than 200 -OR- equal to 300 or 400 or 1000");
        System.out.println("     - not 103, 133, 166, or 199");
        System.out.println("     - not equal to the number calculated above (57, in this example)");
    }
    
}//end of class