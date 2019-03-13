/*********************************************************************************************************************
  * SandLabFiles_V2.java   - this versions allows more than 10 saved particles
  *********************************************************************************************************************/
import java.io.*;
import java.util.*;

public class SandLabFiles_V2 {
    static FileWriter  fw;
    static PrintWriter pw;
    
    static FileReader fr;
    static BufferedReader br;
    
    static int nbrOfRows = 180;
    static int nbrOfCols = 220;
    
    
    public static void main(String[] args) throws IOException {
        System.out.println("SandLabFiles_V2.main");
        readFile("SandLabFile.txt");
    }
    
    public static void writeFile(int [][] sandLabArray, String fileName)  {
        System.out.println("Starting SandLabFiles_V2.writeFile()");
        try {
            fw = new FileWriter(fileName, false);
            pw = new PrintWriter(fw);
            
            for (int r = 0; r < nbrOfRows; r++) {
                for (int c = 0; c < nbrOfCols; c++) {
                    pw.print(sandLabArray[r][c] + " ");
                }
                pw.println();
            }
            pw.flush();
            pw.close();
            System.out.println("SandLabFiles.writeFile() is complete");
        }
        catch (Exception e) {
            System.err.println("Error writing file. Ending program.");
            System.exit(-1);
        } 
    }
    
    public static void setRowsAndCols(int rows, int cols){
        nbrOfRows = rows;
        nbrOfCols = cols;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////
    
    public static int[][] readFile(String fileName) {
        int [][] grid = new int[nbrOfRows][nbrOfCols]; 
        String value = "";
        
        try { 
            
            File file = new File(fileName);
            Scanner in = new Scanner(file);
            
            for (int r = 0; r < nbrOfRows; r++) {
                for (int c = 0; c < nbrOfCols; c++) {
                    grid[r][c] = in.nextInt();
                }
            }
            
        }
        catch (Exception e) {
            System.err.println("Error writing file. Ending program.");
            System.exit(-1);
        } 
        return grid;      
    }
}