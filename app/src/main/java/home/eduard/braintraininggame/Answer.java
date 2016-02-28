package home.eduard.braintraininggame;

import java.util.Arrays;

public class Answer {

    String questionString;
    int limit;

    public Answer(String question, int limit) {
        questionString = question;
        this.limit = limit;
    }

    public int solve(){

        String dummy = "remove";
        String[] myQuestion = null;
        int smallest, aux, first, second, result, i = 0, j = 0;
        // limit is the number of operations&numbers added altogether
        //todo change this according to the level: for example 11 as the maximum number of numbers is 6 on guru level

        while (i != -1 || j != -1) {

            myQuestion = new String[limit];
            aux = 0;
            smallest = 100;

            while (smallest != -1) {

                int plus, minus, times, divide;

                plus = questionString.indexOf("+");
                minus = questionString.indexOf("-");
                times = questionString.indexOf("*");
                divide = questionString.indexOf("/");

                smallest = findSmallest(plus, minus, times, divide);

                if (smallest != -1) {
                    myQuestion[aux] = questionString.substring(0, smallest);
                    questionString = questionString.substring(smallest + 1, questionString.length());
                    aux++;

                    if (smallest == plus) myQuestion[aux] = "+";
                    else if (smallest == minus) myQuestion[aux] = "-";
                    else if (smallest == times) myQuestion[aux] = "*";
                    else myQuestion[aux] = "/";

                    aux++;

                } else {
                    myQuestion[aux] = questionString;
                }
            }

            //Rebuild the question string
            questionString = "";
            for (int k = 0; k < myQuestion.length; k++) {
                questionString += myQuestion[k];
            }

            i = -1;
            j = -1;
            //presume we don't have any Multiplication or Division

            for (int l = 0; l < myQuestion.length; l++) {
                if (myQuestion[l].equals("*") && i == -1) i = l;
                else if (myQuestion[l].equals("/") && j == -1) j = l;
            }
            //find both division and multiplication

            int pos;

            //execute the first one
            if (i == -1) pos = j;
            else if (j == -1) pos = i;
            else if (i < j) pos = i;
            else pos = j;

            if (i != -1 || j != -1) {
                first = Integer.parseInt(myQuestion[pos - 1]);
                second = Integer.parseInt(myQuestion[pos + 1]);

                if (myQuestion[pos].equals("*"))
                    result = first * second;
                else{
                    double resultD = (double) first / second;
                    result = (int) Math.round(resultD);
                }

                myQuestion[pos] = Integer.toString(result);

                myQuestion[pos + 1] = dummy;
                myQuestion[pos - 1] = dummy;
                limit -= 2;
                /*
                ** This is a bit tricky as the 'pos+1' element needs to be removed first
                ** otherwise if I remove 'pos-1', then 'pos+1' will become 'pos+1-1' because
                ** I have deleted a position, so all positions will decrease by one.
                */

                questionString = "";
                for (int k = 0; k < myQuestion.length; k++)
                    if (!myQuestion[k].equals(dummy))
                        questionString += myQuestion[k];
            }
        }
        //At the end of this while loop, I will have an array with numbers and operations of + and -

        int answer = Integer.parseInt(myQuestion[0]);
        //Storing the first int in the answer variable

        for (int k = 1; k < myQuestion.length; k++) {
            if (myQuestion[k].equals("+")) {
                answer += Integer.parseInt(myQuestion[k+1]);
                k++;
            }
            else if (myQuestion[k].equals("-"))  {
                answer -= Integer.parseInt(myQuestion[k+1]);
                k++;
            }
        }

        return answer;
    }

    public int findSmallest(int plus, int minus, int times, int divide) {

        int[] all = new int[4];

        all[0] = plus;
        all[1] = minus;
        all[2] = times;
        all[3] = divide;

        for (int i = 0; i < all.length; i++)
            if (all[i] == -1) all[i] = 100;
        //this is an impossible number for a position
        //I'm doing this to make sure I don't have -1 as the smallest number between them 4

        Arrays.sort(all);

        if (all[0] == 100) return -1;
        else return all[0];
    }
}

