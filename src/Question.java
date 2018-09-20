import java.util.ArrayList;
import java.util.List;

public class Question {

    private static final int MAX_LEVEL = 3;
    private String question;
    private int difficultyLevel; // max 15
    private List<Answer> answerList = new ArrayList<>();

    public Question(String question, int difficultyLevel, List<Answer> answerList){
        this.question = question;
        this.difficultyLevel = difficultyLevel;
        this.answerList.addAll(answerList);
    }

    public Question(){

    }

    public int getMaxLevel(){
        return MAX_LEVEL;
    }

    public String getQuestion(){
        return question;
    }

    public int getDifficultyLevel(){
        return difficultyLevel;
    }

    public List<Answer> getAnswerList(){
        return answerList;
    }

    public Answer getCorrectAnswer(){
        for(Answer answer : answerList ){
            if (answer.isCorrect() ){
                return answer;
            }
        }

        return null;
    }

    public void printQuestionAndAnswers() {

    }


}





