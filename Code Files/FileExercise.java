/*******************************************************************************************************************
 * FileExercise.java
 *******************************************************************************************************************/
import java.io.*;
import java.util.*;

public class FileExercise {
  public static void main(String[] args) throws IOException {
    useBufferedReader();   
  }
  //-------------------------------------------------------------------------------------------------------------------
  public static void useBufferedReader() throws IOException {
    System.out.println("------- Using PrintWriter and BufferedReader -----------------");

    FileWriter  fw = new FileWriter("file-1.txt");
    PrintWriter pw = new PrintWriter(fw);

    int nbrRecordsToWrite = getRandomNbr (1, 2); 
    for (int i = 0 to nbrRecordsToWrite)               // 1. Finish the for loop to write a random number of records (5 to 25) to the file. 
    {
       randomDouble = call getRandomNumber(etc)        // 2. Use getRandomNumber to randomly create a double number between 0.00 and 100.00 (not an integer)
       randomInt = call getRandomNumber(etc)           // 3. Use getRandomNumber to randomly create an integer number between 0 and 100.
      
       pw.println("Student#" + i);
       pw.println(randomDouble);
       pw.println(randomInt);
       
       int randomBoolean = getRandomNbr (0, 1);
       if (randomBoolean == 0) pw.println(false);
       if (randomBoolean == 1) pw.println(true);
       pw.println(randomBoolean);
       pw.println(randomBoolean);
       pw.println(randomBoolean);
       
       pw.flush();
    }
    pw.close();
    
    //Read the file and print it
    FileReader fr = new FileReader("file-1.txt");
    BufferedReader br = new BufferedReader(fr);
    
    String student = "";
    while ((student = br.readLine()) != null) {
      System.out.println(student + "   " + br.readLine() + "   " + br.readLine() + "   " + br.readLine());
    }
    br.close();                                         // 4. Verify the output looks like:  Student#1  12.34  54  true
  }                                                     //    Verify the file-1.txt file contains all the records being displayed to the console.
   
  //-------------------------------------------------------------------------------------------------------------------
  
  //Returns a random number from low to high, inclusive
  public static int getRandomNbr (int low, int high) {
    return (int)(Math.random() * ((high + 1) - low)) + low;
  }
}