/* Class     : Q_ForEachDemo
 * Purpose   : To demonstrate:
 *     - Declaring and populating a String array
 *     - Declaring and populating a double array
 *     - Using a for each loop to iterate through arrays
 *    
 * Programmer: F D'Angelo
 * Created   : 6/11/2014
 */

public class Q_ForEachDemo{
   public static void main(String[] args) {
      
      String[] catsArray = { "cat", "tiger", "lion", "leopard", "cougar" };
      
      for (String cat : catsArray){ // think of this as for each cat in catsArray
         System.out.println(cat);
      }
      
      System.out.println('\n');
      
      double[] dblArray = { 12.345, 23.456, 34.567, 45.678, 56.789 };
      
      for (double dblValue : dblArray ){ // think of this as for each dblValue in dblArray
         System.out.println(dblValue);
      }
   }
}