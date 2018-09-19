import java.util.Objects;

public class Answer {

    private String answer;
    private Boolean correct;

    public  Answer (String answer, boolean c){
        this.answer = answer;
        this.correct = c;
    }
    public Answer (String answer){
        this.answer = answer;
        this.correct = false;
    }

    public String getAnswer(){
        return answer;
    }

    public Boolean isCorrect(){
        return correct;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer1 = (Answer) o;
        return Objects.equals(answer, answer1.answer) &&
                Objects.equals(correct, answer1.correct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answer, correct);
    }
}
