/**
 * Purpose : Payroll application uses Scanner to read data from a file and catches
 * FileNotFoundException and InputMismatchException.
 */

import java.io.*;
import java.util.*;

public class Lab1Start {
    
    private static final String INPUT_FILE_NAME  = "payroll.txt";
    private static final String OUTPUT_FILE_NAME = "payroll_report.txt";
    
    public static void main(String[] args) throws Exception {
        try {
            readWritePayrollData();
            
        } 
        catch (FileNotFoundException notFound) {
            System.out.println("\nError.. File " + INPUT_FILE_NAME + " was not found\n");
            System.exit(-1);
        } 
        catch (InputMismatchException inputMissmatch) {
            System.out.println("\nError.. Stopped reading data from " + INPUT_FILE_NAME +". The data is not formatted correctly.\n");
            System.exit(-1);
        }
    }
    
    public static void readWritePayrollData() throws Exception {
        File        file = new File(INPUT_FILE_NAME);
        Scanner     in = new Scanner(file);
        
        FileWriter  fw = new FileWriter(OUTPUT_FILE_NAME);
        PrintWriter pw = new PrintWriter(fw);
        
        
        //put some code here
        
        
        while(in.hasNext()) {
            employeeNbr = in.nextInt();
            lastName    = in.next();
            firstName   = in.next();
            hoursWorked = in.nextDouble();
            payRate     = in.nextDouble();

            
            pw.format("Put format code here");   //add code to format the line of output file
            
            
            pw.println("");  //forces a new line into the output file
            pw.flush();      //forces Java to write to the file NOW and not later
        }
        System.out.println();
        in.close();
    }
    
    //insert a lot of functions here:
    
    //public static void printFileHeader(PrintWriter pw) {
    //public static void printHeaderToConsole() {
    
    //public static void printDataToConsole(int employeeNbr, String firstLastName, double payRate, double hoursWorked, double[] pay) {
    //OR
    //public static double[] printDataToConsole(int employeeNbr, String firstLastName, double payRate, double hoursWorked) {
    
    //public static double calcOvertimeHours(double hours) {
    //public static double calcRegularHours(double hours) {
    //public static void calcPay(double hoursWorked, double payRate, double[] pay) {
    
}
