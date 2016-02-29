package home.eduard.braintraininggame;

public class Question {

    private int level;
    private final String[] oper = {"*", "/", "+", "-"};
    private final int maximumNumber = 10;
    private String challenge;
    private int howManyNumbers;
    private int answer;

    public Question(int level) {
        this.level = level;
        challenge = "Guess:";
        answer = 999999;
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
        howManyNumbers = 2;
        createChallenge(howManyNumbers);
    }


    public void easy() {
        double number = Math.floor(Math.random() * 2 + 2);
        howManyNumbers = (int) number;
        createChallenge(howManyNumbers);
    }

    public void medium() {
        double number = Math.floor(Math.random() * 3 + 2);
        howManyNumbers = (int) number;
        createChallenge(howManyNumbers);
    }

    public void guru() {
        double number = Math.floor(Math.random() * 5 + 2);
        howManyNumbers = (int) number;
        createChallenge(howManyNumbers);
    }

    public void createChallenge(int numbers) {

        int i = 1, randomNumber, sign;
        double number;

        //first random number: 0 -> maximumNumber
        number = Math.floor(Math.random() * maximumNumber);
        randomNumber = (int) number;

        //adding the first random number to the challenge string and answer
        setChallenge(randomNumber);
        answer = randomNumber;

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

            //add the operation and number to the final good answer
            doAnswer(oper[sign], randomNumber);

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

    public void doAnswer(String operation, int number) {
        switch (operation) {
            case "*":
                answer *= number;
                break;
            case "/":
                double toSet = (double) answer / number;
                answer = (int) Math.round(toSet);
                break;
            case "-":
                answer -= number;
                break;
            default:
                answer += number;
                break;
        }
    }

    public int getAnswer() {
        return answer;
    }
}
