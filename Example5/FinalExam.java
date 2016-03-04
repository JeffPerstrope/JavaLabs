/**
 * Created by Jeff on 2/18/2016.
 */
public class FinalExam {

    private double score;

    public double getScore() {
        return score;
    }
    public void setScore(double points) {
        double gradedScore = (points / 50) * 100;
        this.score = gradedScore;
    }
}
