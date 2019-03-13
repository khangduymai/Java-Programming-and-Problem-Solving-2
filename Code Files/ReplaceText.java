/* To Do: 
 *    This program accepts input from the command line using this format:
 *         java ReplaceText sourceFile targetFile oldStr newStr
 * 
 *    Run this program using the run button of Dr. Java and see what happens (in the console window below) 
 *    What happened?
 * 
 *    Run this program from the Interactions pane below using this text, replacing yourName with your name: 
 *         java ReplaceText lucyfile.txt newfile.txt Lucy YourName
 *    What happened? Look in the Console pane for any messages. 
 *    How can you fix that so the program runs? 
 *    Fix the error. 
 *    Run it now and look at the output file. 
*/

import java.io.*;
import java.util.*;

public class ReplaceText {
  public static void main(String[] args) throws Exception {
    System.out.println("Starting replaceText program");
    
    checkParameters(args);
    System.out.println("java ReplaceText " + args[0] + " " + args[1] + " " + args[2] + " " + args[3]);
    
    File sourceFile = checkSourceFile(args);
    File targetFile = checkTargetFile(args);
  
    createFile(sourceFile, targetFile, args);
    
    System.out.println("Program Completed Successfully");
  }
  
  //---------------------------------------------------------------------------------------------------------------
  
  private static void checkParameters(String[] args){
      // Check command line parameter usage
      if (args.length != 4) {
          System.out.println("Missing Parameters. Enter: java ReplaceText sourceFile targetFile oldStr newStr");
          System.exit(1);
      }      
  }
  
  // Check if source file exists
  private static File checkSourceFile(String[] args){
      File sourceFile = new File(args[0]);
      if (!sourceFile.exists()) {
          System.out.println("Source file " + args[0] + " does not exist");
          System.exit(2);
      }
      return sourceFile;
  }
  
  // Check if target file exists
  private static File checkTargetFile(String[] args){
      File targetFile = new File(args[1]);
      if (targetFile.exists()) {
          System.out.println("Target file " + args[1] + " already exists");
          System.exit(3);
      }
      return targetFile;
  }
  
  // Create output file
  private static void createFile(File sourceFile, File targetFile, String[] args) throws Exception{
      try (
           Scanner input      = new Scanner(sourceFile);
           PrintWriter output = new PrintWriter(targetFile);
           ) 
      {
          while (input.hasNext()) {
              String s1 = input.nextLine();
              String s2 = s1.replaceAll(args[2], args[3]);
              output.println(s2);
          }
      }
  }
  
}//end of class