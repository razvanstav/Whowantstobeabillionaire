import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Billionaire {

    private static List<Question> questionsLevel1 = new ArrayList<>();
    private static List<Question> questionsLevel2 = new ArrayList<>();
    private static List<Question> questionsLevel3 = new ArrayList<>();

    public static void main(String[] args) {

        initQuestions();

        ArrayList<Question> gameQuestions = getGameQuestions();
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to play Billionaire? ");
        String answerPlayer = scan.nextLine();


        Game game = new Game(gameQuestions, scan);
        do {
            game.start();
        }
        while(!game.isFinished());


    }

    private static void initQuestions() {


        //the list of answers from question 1
        List<Answer> answers1Q1 = new ArrayList<>();

        answers1Q1.add(new Answer("7.5"));
        answers1Q1.add(new Answer("5"));
        answers1Q1.add(new Answer("6"));
        answers1Q1.add(new Answer("7", true));

        //creating question 1
        Question question1Diff1 = new Question("How many dwarfs does White Snow have?", 1, answers1Q1);


        List<Answer> answers2Q1 = new ArrayList<>();

        answers2Q1.add(new Answer("Brazil"));
        answers2Q1.add(new Answer("Romania", true));
        answers2Q1.add(new Answer("USA"));
        answers2Q1.add(new Answer("Belgium"));

        //creating question 1

        Question question2Diff1 = new Question("Which country is Bulgaria's neighbour?", 1, answers2Q1);

        // adding question to list
        questionsLevel1.add(question1Diff1);
        questionsLevel1.add(question2Diff1);


        //the list of answers from question 1
        List<Answer> answers1Q2 = new ArrayList<>();

        answers1Q2.add(new Answer("Paris"));
        answers1Q2.add(new Answer("Bucharest"));
        answers1Q2.add(new Answer("London", true));
        answers1Q2.add(new Answer("Lisbon"));

        //creating question 1

        Question question1Diff2 = new Question("Which of this cities is the capital of Romania?", 2, answers1Q2);

        // adding question to list

        questionsLevel2.add(question1Diff2);

        //the list of answers from question 1
        List<Answer> answers2Q2 = new ArrayList<>();

        answers2Q1.add(new Answer("Everest"));
        answers2Q1.add(new Answer("Eiffel Tower"));
        answers2Q1.add(new Answer("BMW"));
        answers2Q1.add(new Answer("Airbus"));

        //creating question 1

        Question question2Diff2 = new Question("Which of this cities is the capital of Romania?", 2, answers2Q2);

        // adding question to list

        questionsLevel2.add(question2Diff2);
    }

    private static ArrayList<Question> getGameQuestions() {

        ArrayList<Question> gameQuestions = new ArrayList<>();
        Random r = new Random();

        int randomLevel1Index = r.nextInt(questionsLevel1.size());
        gameQuestions.add(questionsLevel1.get(randomLevel1Index));

        int randomLevel2Index = r.nextInt(questionsLevel2.size());
        gameQuestions.add(questionsLevel2.get(randomLevel1Index));

//        int randomLevel3Index = r.nextInt(questionsLevel3.size());
//        gameQuestions.add(questionsLevel3.get(randomLevel1Index));

        return gameQuestions;
    }


}






