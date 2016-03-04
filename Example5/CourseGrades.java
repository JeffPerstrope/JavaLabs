/**
 * Created by Jeff on 2/18/2016.
 */

//If-else: Line 46 & 50
//Decimal format: Line 13

import java.text.DecimalFormat;

public class CourseGrades {

    private GradedActivity grades[] = new GradedActivity[4], lab, passFailExam, essay, finalExam;
    DecimalFormat df = new DecimalFormat("##0.00");
    private String passOrFail;

    public void setLab(GradedActivity l)
    {
        lab = new GradedActivity();
        lab.setScore(l.getScore());
        grades[0] = lab;
    }

    public void setPassFailExam(PassFailExam pa)
    {
        passFailExam = new GradedActivity();
        passFailExam.setScore(pa.getScore());
        grades[1] = passFailExam;
        passedOrFailed();
    }

    public void setEssay(Essay e)
    {
        essay = new GradedActivity();
        essay.setScore(e.getScore());
        grades[2] = essay;
    }

    public void setFinalExam(FinalExam fe)
    {
        finalExam = new GradedActivity();
        finalExam.setScore(fe.getScore());
        grades[3] = finalExam;
    }

    public void passedOrFailed()
    {
        if(passFailExam.getScore() >= 70)
        {
            passOrFail = "PASSED";
        }
        else
        {
            passOrFail = "FAILED";
        }
    }

    @Override
    public String toString() {
        return "\n\nLab grade: " + df.format(lab.getScore()) + "% " + lab.getGrade() +
                "\nPass Fail Exam: " + df.format(passFailExam.getScore()) + "% " + passFailExam.getGrade() + "    " + passOrFail +
                "\nEssay: " + df.format(essay.getScore()) + "% " + essay.getGrade() +
                "\nFinal Exam: " + df.format(finalExam.getScore()) + "% " + finalExam.getGrade();
    }
}
