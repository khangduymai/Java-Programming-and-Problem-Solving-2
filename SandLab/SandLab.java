/* A. StudentName
 * 
 * 
 */
import java.awt.*;
import java.util.*;

public class SandLab{
    static final int MAX_ROWS = 180;  
    static final int MAX_COLS = 220;  
    
    static final String FILE_NAME     = "SandLabFile.txt";  //This is the name of the input file.
    static final String NEW_FILE_NAME = "SandLabFileTesting.txt";  //This is the name of the file you are saving.

    //add constants for particle types here
    public static final int EMPTY = 0;
    public static final int METAL = 1;
    public static final int SAVEFILE  = 2;  
    
    //do not add any more fields
    private int[][] sandGrid;
    private LabDisplay display;

    //---------------------------------------------------------------------------------------------------------
    
    public static void main(String[] args){
        System.out.println("================= Starting Program =================");
        
        SandLab lab = new SandLab(MAX_ROWS, MAX_COLS);
        lab.run();
    }
    
    //SandLab constructor 
    public SandLab(int numRows, int numCols){
        String[] names = new String[3]; 
        
        names[EMPTY] = "Empty";
        names[METAL] = "Metal";
        names[SAVEFILE] = "SaveFile"; 
        
        display = new LabDisplay("SandLab", numRows, numCols, names);
        //grid =
        
        
        if (FILE_NAME != "") {
            System.out.println("loading " + FILE_NAME);
            //grid = SandLabFiles.readFile(FILE_NAME);   //uncomment this later to save your file...
        } 
    }
    
    //called when the user clicks on a location using the given tool
    private void locationClicked(int row, int col, int tool){
        
        //insert code here 
        
        
        if (tool == SAVEFILE) {
            //SandLabFiles.writeFile(grid, NEW_FILE_NAME);  //uncomment this later to save your file...
        }
    }
    
    //copies each element of grid into the display
    public void updateDisplay(){
        
        //insert code here
        
    }
    
    //called repeatedly.
    //causes one random particle to maybe do something.
    public void step(){
        
        //insert code here
        
        
    }
    
    //DO NOT modify anything below here!!! /////////////////////////////////////////////////////////////////
    public void run(){
        while (true){
            for (int i = 0; i < display.getSpeed(); i++)
                step();
            updateDisplay();
            display.repaint();
            display.pause(1);  //wait for redrawing and for mouse   
            int[] mouseLoc = display.getMouseLocation();
            if (mouseLoc != null)  //test if mouse clicked
                locationClicked(mouseLoc[0], mouseLoc[1], display.getTool());
        }
    }
    
    public int getRandomNumber (int low, int high){
        return (int)(Math.random() * (high - low)) + low;
    }
}