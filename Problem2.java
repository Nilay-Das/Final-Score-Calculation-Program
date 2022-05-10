/**
 * This problem:
 * Prints the individual assessment marks of a student.
 * Calculates the final score.
 * Calculates the median of the assessment marks.
 *
 * @author Nilay Das 
 */

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
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
        int tests = in.nextInt();
        int pod = in.nextInt();
        int assignments = in.nextInt();
        int practicums = in.nextInt();
        int labs = in.nextInt();

        //Array to hold the marks
        int arry [] = {tests, pod, assignments, practicums, labs};

        //Calculation of total marks
        double marks = ((tests * wTests) + (pod * wPod) + (assignments * wAssignments) + (practicums * wPracticums) + (labs * wLabs));

        //Method calls for median
        int medianValue = median(arry);

        //Output
        System.out.print("Hi " + studentName + " (" + bannerID + ")," + " based on the input given: ");
        System.out.print("Tests= " + tests + "% " + "PoDs= " + pod + "%, " + "Assignments= " + assignments + "%, ");
        System.out.print("Practicums=" + practicums + "%, " + "Labs=" + labs + "%, ");
        System.out.printf("your final score is %.2f", marks);
        System.out.print("% ");
        System.out.print("with a median of " + medianValue + "%.");


    }

    /**
     * This method is used to calculate the median value of the marks
     *
     * @param integer array holding the value of the marks
     * @return calculated median value of the marks
     */
    public static int median(int [] arry) {
        ////Creating a new array to copy and hold the values of the array passed in through the method
        int copyArry [] = new int [arry.length];

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
