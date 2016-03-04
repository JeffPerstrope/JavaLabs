/**
 * Created by Jeff on 2/18/2016.
 */

//While loop: Line 23

import java.util.Scanner;

public class CourseGradesDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        GradedActivity lab = new GradedActivity();
        CourseGrades allGrades = new CourseGrades();
        PassFailExam pfExam = new PassFailExam();
        Essay essay = new Essay();
        FinalExam fe = new FinalExam();

        System.out.print("Grade for lab: ");
        double userLab = keyboard.nextDouble();
        lab.setScore(userLab);
        System.out.print("# of correct answers for Pass Fail Exam: ");
        double userPFExam = keyboard.nextDouble();
        while(userPFExam > 10 || userPFExam < 0)
        {
            System.out.print("Invalid number. Re-enter # of correct answers for Pass Fail Exam: ");
            userPFExam = keyboard.nextDouble();
        }
        pfExam.setScore(userPFExam);
        System.out.print("Grade for essay: ");
        double userEssay = keyboard.nextDouble();
        essay.setScore(userEssay);
        System.out.print("# of correct answers for Final Exam: ");
        double userFinal = keyboard.nextDouble();
        while(userFinal > 50 || userFinal < 0)
        {
            System.out.print("Invalid number. Re-enter # of correct answers for Final Exam: ");
            userFinal = keyboard.nextDouble();
        }
        fe.setScore(userFinal);

        allGrades.setLab(lab);
        allGrades.setPassFailExam(pfExam);
        allGrades.setEssay(essay);
        allGrades.setFinalExam(fe);

        System.out.println(allGrades);
    }
}
