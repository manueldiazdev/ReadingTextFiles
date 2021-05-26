import java.util.*;
import java.io.*;
/*
    Manuel Diaz
    CSC 15
    Project #3
    Adding Numbers




 */
public class SumMain {
    public static final int SIZE = 25;

    public static void main(String[] args) throws FileNotFoundException {
        //select the file that is going to read.
        Scanner file = new Scanner(new File("sum.txt"));
        //does all the calculations
        System.out.print("Total lines = " + SumHelper.calculationDisplay(file));
    }
}



