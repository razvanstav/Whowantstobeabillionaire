import java.util.ArrayList;
import java.util.List;

public class Billionaire {


    public static void main(String[] args) {

        Game game = new Game();
        game.start();

        List<Question> questions = new ArrayList<>();




        //the list of answers from question 1
        List<Answer> answersQ1 = new ArrayList<>();
        Answer a1q1 = new Answer("7.5");
        Answer a2q1 = new Answer("5");
        Answer a3q1 = new Answer("6");
        Answer a4q1 = new Answer("7",true);

        answersQ1.add(a1q1);
        answersQ1.add(a2q1);
        answersQ1.add(a3q1);
        answersQ1.add(a4q1);

        //creating question 1

        Question q1 = new Question("Cati pitici are Alba-ca-Zapada?",1,answersQ1);

        // adding question to list

        questions.add(q1);


        //the list of answers from question 1
        List<Answer> answersQ2 = new ArrayList<>();
        Answer a1q2 = new Answer("Paris");
        Answer a2q2 = new Answer("Bucharest");
        Answer a3q2 = new Answer("London",true);
        Answer a4q2 = new Answer("Lisbon");

        answersQ1.add(a1q1);
        answersQ1.add(a2q1);
        answersQ1.add(a3q1);
        answersQ1.add(a4q1);

        //creating question 1

        Question q2 = new Question("Which of this cities is the capital of Romania?",2,answersQ2);

        // adding question to list

        questions.add(q2);

        //the list of answers from question 1
        List<Answer> answersQ = new ArrayList<>();
        Answer a1q3 = new Answer("Paris");
        Answer a2q3 = new Answer("Bucharest");
        Answer a3q3 = new Answer("London",true);
        Answer a4q3 = new Answer("Lisbon");

        answersQ1.add(a1q3);
        answersQ1.add(a2q3);
        answersQ1.add(a3q3);
        answersQ1.add(a4q3);

        //creating question 1

        Question q3 = new Question("Which of this cities is the capital of Romania?",3,answersQ2);

        // adding question to list

        questions.add(q2);





    }


}






