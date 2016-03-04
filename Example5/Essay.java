/**
 * Created by Jeff on 2/18/2016.
 */
 
 //Extend parent class: Line 7
 
public class Essay extends GradedActivity {

    private double grammar, spelling, correctLength, content;

    public double getGrammar() {
        return grammar;
    }
    public void setGrammar(double grammar) {
        this.grammar = grammar;
    }

    public double getSpelling() {
        return spelling;
    }
    public void setSpelling(double spelling) {
        this.spelling = spelling;
    }

    public double getCorrectLength() {
        return correctLength;
    }
    public void setCorrectLength(double correctLength) {
        this.correctLength = correctLength;
    }

    public double getContent() {
        return content;
    }
    public void setContent(double content) {
        this.content = content;
    }
}
