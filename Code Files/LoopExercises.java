public class LoopExercises {
    
    final static String DISPLAY_CHAR = "# ";
    
    public static void main(String[] args){
        displayWelcomeMessage();
        
        printRectangle(10,10);              // Rectangle
        printBox(10,10);                    // Box    
        printLeftTriangle(10,10);           // Left-leaning Triangle
        printUpsideDownLeftTriangle(10,10); // Upside-down Left-leaning Triangle
        printMultiplicationTable(9,9);      // Multiplication Table
        
        System.out.println("\n----- Program Complete -----"); 
    }
    
    private static void displayWelcomeMessage() {
        System.out.println("");
        System.out.println("************************************************");
        System.err.println("                 For-Loop Exercises");
        System.out.println("************************************************");
        System.out.println("");  
    }
    
    //Display a filled in rectangle
    private static void printRectangle(int rows, int cols) {
        System.out.println("\n--- " + rows + "X" + cols + " Shape 1 ---");
        
        //insert code here...
    }
    
    //Display a box
    private static void printBox (int rows, int cols) {
        System.out.println("\n--- " + rows + "X" + cols + " Shape 2 ---");
        
        //insert code here...
    }
    
    //Display a left-leaning triangle
    private static void printLeftTriangle (int rows, int cols) {
        System.out.println("\n--- " + rows + "X" + cols + " Shape 3 ---");
        
        //insert code here...
    }
    
    //Display an upside-down left-leaning triangle
    private static void printUpsideDownLeftTriangle (int rows, int cols) {
        System.out.println("\n--- " + rows + "X" + cols + " Array3 ---");
        
        //insert code here...
    }
    
    
    //Display a multiplication table
    private static void printMultiplicationTable (int rows, int cols) {
        System.out.println("\n--- Multiplication Table ---");
        
        /* Sample output: (EXACTLY like this! Note right justified single digits!)
         * 
         * |  1  2  3  4  5  6  7  8  9
         ------------------------------
         1 |  1  2  3  4  5  6  7  8  9 
         2 |  2  4  6  8 10 12 14 16 18 
         3 |  3  6  9 12 15 18 21 24 27 
         4 |  4  8 12 16 20 24 28 32 36 
         5 |  5 10 15 20 25 30 35 40 45 
         6 |  6 12 18 24 30 36 42 48 54 
         7 |  7 14 21 28 35 42 49 56 63 
         8 |  8 16 24 32 40 48 56 64 72 
         9 |  9 18 27 36 45 54 63 72 81 
         
         */    
        
        System.out.println("* |  1  2  3  4  5  6  7  8  9");
        System.out.println("------------------------------");
        
        //insert code here...
    }
    
}//End of Class