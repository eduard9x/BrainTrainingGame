package home.eduard.braintraininggame;

import android.view.View;
import android.widget.TextView;

public class Question {

    private int level;
    private final String[] oper = {"*", "/", "+", "-"};
    private final int maximumNumber = 10;
    private String challenge;
    private int operations;

    public Question(int level) {
        this.level = level;
        challenge = "Guess:";
    }

    public void start() {

        switch (level) {
            case 0:
                novice();
                break;
            case 1:
                easy();
                break;
            case 2:
                medium();
                break;
            default:
                guru();
                break;
        }
    }

    public void novice() {
        operations = 2;
        createChallenge(operations);
    }


    public void easy() {
        double number = Math.floor(Math.random() * 2 + 2);
        operations = (int) number;
        createChallenge(operations);
    }

    public void medium() {
        double number = Math.floor(Math.random() * 3 + 2);
        operations = (int) number;
        createChallenge(operations);
    }

    public void guru() {
        double number = Math.floor(Math.random() * 5 + 2);
        operations = (int) number;
        createChallenge(operations);
    }

    public void createChallenge(int numbers) {

        int i = 1, randomNumber, sign;
        double number;

        //first random number: 0 -> maximumNumber
        number = Math.floor(Math.random() * maximumNumber);
        randomNumber = (int) number;

        //adding the first random number to the challenge string
        setChallenge(randomNumber);

        while (i < numbers) {

            //generate random operation sign
            number = Math.floor(Math.random() * 4);
            sign = (int) number;
            //adding the sign to the final challenge expression
            setChallenge(oper[sign]);

            //random number: 0 -> maximumNumber
            randomNumber = generateNumber();

            if (oper[sign].equals("/"))
                while (randomNumber == 0)
                    randomNumber = generateNumber();

            /*
            * this basically means that if the sign is / (division),
            * then the following radom number should not be 0
            */

            //adding the random number to the challenge string
            setChallenge(randomNumber);
            i++;
        }

    }

    public String getChallenge() {
        return challenge;
    }

    public void setChallenge(String challenge) {
        this.challenge += challenge;
    }

    public void setChallenge(int number) {
        this.challenge += Integer.toString(number);
    }

    public int generateNumber() {
        //generate random number
        double number = Math.floor(Math.random() * maximumNumber);
        int randomNumber = (int) number;
        return randomNumber;
    }

    public int getOperations() {
        return 2*operations-1;
    }
}
