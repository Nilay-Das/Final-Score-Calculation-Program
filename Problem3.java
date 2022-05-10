/**
 * This problem:
 * Takes input of student name and banner number.
 * Takes input of the number of completed learning objectives.
 * The uncompleted learning objectives are assumed as 100.
 * Prints the individual assessment marks of the student.
 * Calculates the final score.
 * Calculates the median of the assessment marks.
 *
 * @author Nilay Das 
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Weight of the assessments ('w' stands for weight in the variable name)
        double wTests = 0.28;
        double wPod = 0.1;
        double wAssignments = 0.28;
        double wPracticums = 0.24;
        double wLabs = 0.105;

        //Inputs
        String studentName = in.nextLine();
        String bannerID = in.nextLine();
        int objectives = in.nextInt();

        //Array to hold the marks
        int arry[] = new int[5];

        /*
        If statements to fill up the array named 'arry'.
        The first for loop fills up the array with the marks based on the objectives input.
        The second for loop sets the rest of the spaces/marks of the array to '100'.
        */
        if (objectives == 1) {
            for (int i = 0; i < objectives; i++) {
                arry[i] = in.nextInt();
            }
            for (int i = objectives; i < arry.length; i++) {
                arry[i] = 100;
            }
        }

        if (objectives == 2) {
            for (int i = 0; i < objectives; i++) {
                arry[i] = in.nextInt();
            }
            for (int i = objectives; i < arry.length; i++) {
                arry[i] = 100;
            }
        }

        if (objectives == 3) {
            for (int i = 0; i < objectives; i++) {
                arry[i] = in.nextInt();
            }
            for (int i = objectives; i < arry.length; i++) {
                arry[i] = 100;
            }
        }

        if (objectives == 4) {
            for (int i = 0; i < objectives; i++) {
                arry[i] = in.nextInt();
            }
            for (int i = objectives; i < arry.length; i++) {
                arry[i] = 100;
            }
        }

        if (objectives == 5) {
            for (int i = 0; i < objectives; i++) {
                arry[i] = in.nextInt();
            }
            for (int i = objectives; i < arry.length; i++) {
                arry[i] = 100;
            }
        }

        //Calculation of total marks
        double marks = ((arry[0] * wTests) + (arry[1] * wPod) + (arry[2] * wAssignments) + (arry[3] * wPracticums) + (arry[4] * wLabs));

        //Method calls for median
        int medianValue = median(arry);

        //Output
        System.out.print("Hi " + studentName + " (" + bannerID + ")," + " based on the input given ");
        System.out.print("for " + objectives + "/5 scores: ");
        System.out.print("Tests= " + arry[0] + "% " + "PoDs= " + arry[1] + "%, " + "Assignments= " + arry[2] + "%, ");
        System.out.print("Practicums=" + arry[3] + "%, " + "Labs=" + arry[4] + "%, ");
        System.out.printf("your final score is %.2f", marks);
        System.out.print("% ");
        System.out.print("with a median of " + medianValue + "%.");


    }

    /**
     * This method is used to calculate the median value of the marks
     *
     * @param  integer array holding the value of the marks
     * @return calculated median value of the marks
     */
    public static int median(int[] arry) {
        //Creating a new array to copy and hold the values of the array passed in through the method
        int copyArry[] = new int[arry.length];

        // For loop to copy the array elements of arry into copyArry
        for (int i = 0; i < copyArry.length; i++) {
            copyArry[i] = arry[i];
        }

        //Sorting the copyArry
        Arrays.sort(copyArry);

        //Length of the copyArry
        int length = copyArry.length;

        int medianValue = 0;

        //Calculating median
        if (length % 2 == 1) {
            medianValue = copyArry[(length + 1) / 2 - 1];
        } else {
            medianValue = (copyArry[length / 2 - 1] + copyArry[length / 2]) / 2;
        }

        return medianValue;


    }

}
