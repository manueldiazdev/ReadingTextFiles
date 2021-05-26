import java.util.*;
/*
    Manuel Diaz
    CSC 15
    Project #3
    Adding Numbers




 */
//read each line with nextLine (convert to String)
//then save one digit(charAt or Character.getNumericValue) to an index(Starting from right to left)
//each index should have 1 digit. shift when theres more than two digits
public class SumHelper {


    /**
     * reads a file and takes a calculates all the numbers(int) on that line
     * it will run until no more lines are available
     * @param f send it file as a scanner
     * @return  the amount of lines in the file that were calculated
     */
    public static int calculationDisplay(Scanner f){
        int[] numbers = new int[SumMain.SIZE];
        int[] total = new int[SumMain.SIZE];
        int lineAmounts = 0;
        String line;
        String numPassing;
        //if there is a line of text with numbers it will calculate it
        while(f.hasNextLine()){
            line = f.nextLine();
            Scanner lineReader = new Scanner(line);
            //read a single String and print the number.
            while(lineReader.hasNext()){
                numPassing = lineReader.next();
                System.out.print(numPassing);
                //if there's more numbers to calculate it will display a "+"
                if(lineReader.hasNext()){
                    System.out.print(" + ");
                }

                arrayFill(numPassing, numbers);
                adding(total, numbers);


            }

            System.out.print(" = ");

            //need to get rid of zeros from arrays
            removeZeros(total);
            System.out.println();
            //refresh the array
            Arrays.fill(total, 0);
            //calculate the number of lines processed
            lineAmounts++;
        }
        return lineAmounts;




    }
    /**
     * fills in array with each next()
     * from rigth to left leaving 0's with the spaces that are not filled.
     * @param num the string is read and converted into an array
     * @param array array that will modified
     */
    public static void arrayFill(String num, int[] array) {
        Arrays.fill(array, 0);
        int numAmount = num.length()-1;
        char current;
        //fill in array with a single number in each index (starting from the right) as a String

        for(int i = array.length-1; i >= 0; i--){

            if(numAmount >= 0 ) {
                current = num.charAt(numAmount);
                array[i] = Character.getNumericValue(current);

            }
            numAmount--;
        }
    }




    /**
     * adds the second parameter to the first. using each index as a single digit.
     * @param total the total would be stored
     * @param num the array that will be added to the total
     */
    public static void adding(int[] total, int[] num){
        int carryOver = 0;

        for (int i = total.length-1; i>= 0; i--){
            total[i]= total[i]+num[i]+carryOver;

            if(total[i]>0){
                carryOver = total[i]/10;
                total[i] = total[i]%10;

            }

        }


    }


    /**
     * starts to print the elements of the array when it reaches a different number from 0(left to right)
     * @param array array that will be read(no change)
     */
    public static void removeZeros(int[] array){
        int counter = 0;
        //reads the length of the array.
        for(int i = 0; i < array.length-1; i++){
            //until it reaches a different number from 0 it will print the rest of the numbers(besides the last one)
            if(array[i] != 0){
                for(int j = counter; j < array.length-1;j++ ){
                    System.out.print(array[j]);
                }

                break;
            }
            counter++;

        }
        //displays the last number
        //to avoid having only 0 as an answer
        System.out.print(array[array.length-1]);



    }
    public static void total(int[] array1, int array2[] ){



    }
}
