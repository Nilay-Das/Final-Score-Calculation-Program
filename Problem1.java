/**
 * This problem:
 * Prints the individual assessment marks of a student.
 * Calculates the final score.
 *
 * @author Nilay Das
 */

import java.util.Scanner;

public class Problem1 {
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

        //Calculation of total marks
        double marks = ((tests*wTests)+(pod*wPod)+(assignments*wAssignments)+(practicums*wPracticums)+(labs*wLabs));

        //Output
        System.out.print("Hi " + studentName + " (" + bannerID + ")," + " based on the input given: ");
        System.out.print("Tests= " + tests + "% " + "PoDs= " + pod + "%, " + "Assignments= " + assignments + "%, ");
        System.out.print("Practicums=" + practicums + "%, " + "Labs=" + labs + "%, ");
        System.out.printf("your final score is %.2f", marks);
        System.out.print("%.");


    }


}
