
import java.io.*;
import java.util.*;


public class Main {


    private static final String FILE_NAME = "payroll.txt";

    public static void main(String arg[]) throws Exception {


        checkFile(FILE_NAME);

        System.out.println();

        System.out.println("----------------------------------Pay Roll ---------------------------------------");

        readWriteFile(FILE_NAME);



    } // end main


    // CREATE FUNCTIONS:

    public static void checkFile(String FILE_NAME){
        java.io.File file = new java.io.File(FILE_NAME);
        System.out.println("Does the file exist?" + " " + file.exists() );

        System.out.println("The absolute path is: " + file.getAbsolutePath());
    } // end checkFile

    public static void readWriteFile(String FILE_NAME) throws Exception{

        File createFile = new File(FILE_NAME);
        Scanner readFile = new Scanner(createFile);

        PrintWriter outputFile = new PrintWriter("/Users/khangmai/GIT/Java-Programming-and-Problem-Solving-2/result.txt");

        
        while(readFile.hasNext()){
            int employeeID = readFile.nextInt();
            String lastName = readFile.next();
            String firstName = readFile.next();
            double hoursWork = readFile.nextDouble();
            double hourlyRate = readFile.nextDouble();
//            double regularPay = calRegularPay(hoursWork,hourlyRate);
//            double overPay =  calOverPay(hoursWork,hourlyRate);
//            double total = totalPay(regularPay,overPay);
            double[] calTotal;
            calTotal = calResult(hoursWork,hourlyRate);



            printLineResult(employeeID,lastName,firstName,hoursWork,hourlyRate,calTotal);

            outputFile.print(employeeID + " ");
            outputFile.print(lastName + " ");
            outputFile.print(firstName + " ");
            outputFile.print(hoursWork + " ");
            outputFile.println(hourlyRate + " ");



/*            System.out.println(
                    employeeID + " " + lastName + " " + firstName + " " + hoursWork + " " + hourlyRate + " " + regularPay
                    + " " +  overPay + " " + total
                    employeeID + " " + lastName + " " + firstName + " " + hoursWork + " " + hourlyRate + " " + Arrays.toString(calTotal)
            );*/
        }
        outputFile.close();
    } // end readWriteFile()

    public static double calRegularPay(double hoursWork, double hourlyRate){
        double regularPay;
        if(hoursWork > 0 && hoursWork <= 40){
            regularPay = hoursWork * hourlyRate;
        }
        else{
            regularPay = 40 * hourlyRate;
        }
        return regularPay;
    }

    public static double calOverPay(double hours, double rate){
        double overPay;
        if(hours > 0 && hours <= 40){
            overPay = 0.0;
        }
        else{
            overPay = (hours - 40) * rate * 1.5 ;
        }
        return overPay;
    }

    public static double totalPay(double regularPay, double overPay){
        double total;
        total = regularPay + overPay;
        return total;
    }

    public static double[] calResult(double hoursWork, double payRate){
        double[] result = new double[3];
        double regularPay, overPay, totalPay;

        if(hoursWork >= 0 && hoursWork <= 40){
            regularPay = 40 * payRate;
            overPay = 0.0;
            totalPay = regularPay + overPay;
        }
        else {
            regularPay = 40 * payRate;
            overPay = (hoursWork-40) * payRate * 1.5;
            totalPay = regularPay + overPay;
        }

        result[0]= regularPay;
        result[1]= overPay;
        result[2]= totalPay;

        return result;
    }

    public static void printArrayResult(double[] result){
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }


    public static void printLineResult(int employeeID, String LName, String FName,double hours, double rate, double[] pay){

        System.out.print(employeeID + " " + LName + " " + FName + " " + hours + " " + rate + " " );
        printArrayResult(pay);
        System.out.println();
    }


} // end Main Class
