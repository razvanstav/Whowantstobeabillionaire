import java.util.Objects;

public class Answer {

    String answer;
    Boolean isCorrect;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer1 = (Answer) o;
        return Objects.equals(answer, answer1.answer) &&
                Objects.equals(isCorrect, answer1.isCorrect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answer, isCorrect);
    }
}
