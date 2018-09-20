import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private int currentLevel = 1;
    private List<Question> gameQuestions = new ArrayList<>();
    private Scanner scanner;

    public Game(List<Question> gameQuestions, Scanner scanner) {
        this.gameQuestions.addAll(gameQuestions);
        this.scanner = scanner;
    }


    public void start() {

        // show menu, show first question

        /**
         *
         for (int i = 0; i < gameQuestions.size(); i++) {
         System.out.println(gameQuestions.get(i).getQuestion());
         }

         for checking the questions
         */
        askQuestion();

    }

    public void askQuestion() {

        for (Question question : gameQuestions) {
            if (question.getDifficultyLevel() == currentLevel) {
                question.printQuestionAndAnswers();

                // TODO: answerQuestion
            }
        }

    }

    public void answerQuestion() {
        // get user input and check if correct
    }

    public void fiftyFifty() {
        //show the same question but only with 2 possible answers
    }

    public boolean askForWithdraw() {
        System.out.println("Do you want to continue?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("yes");
    }

}
