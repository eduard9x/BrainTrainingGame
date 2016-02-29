package home.eduard.braintraininggame;

import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class GameFragment extends Fragment {

    private AlertDialog mDialog;
    private final int MaximumDigitsAnswer = 6;
    private int numberOfQuestions = 0;
    private CountDownTimer myTimer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_game, container, false);
        // Handle buttons here...

        //region Keypad Declarations
        final View button1 = rootView.findViewById(R.id.button1);
        final View button2 = rootView.findViewById(R.id.button2);
        final View button3 = rootView.findViewById(R.id.button3);
        final View button4 = rootView.findViewById(R.id.button4);
        final View button5 = rootView.findViewById(R.id.button5);
        final View button6 = rootView.findViewById(R.id.button6);
        final View button7 = rootView.findViewById(R.id.button7);
        final View button8 = rootView.findViewById(R.id.button8);
        final View button9 = rootView.findViewById(R.id.button9);
        final View button0 = rootView.findViewById(R.id.button0);
        final View buttonDel = rootView.findViewById(R.id.buttonDel);
        final View buttonHash = rootView.findViewById(R.id.buttonHash);
        final View buttonMinus = rootView.findViewById(R.id.buttonMinus);
        //endregion

        //region Button1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView test = (TextView) rootView.findViewById(R.id.user_answer);
                String toSet = (String) test.getText();
                if (toSet.compareTo("=?") == 0) toSet = "=";
                if (toSet.length() < MaximumDigitsAnswer)
                    test.setText(toSet + "1");
            }
        });
        //endregion
        //region Button2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView test = (TextView) rootView.findViewById(R.id.user_answer);
                String toSet = (String) test.getText();
                if (toSet.compareTo("=?") == 0) toSet = "=";
                if (toSet.length() < MaximumDigitsAnswer)
                    test.setText(toSet + "2");
            }
        });
        //endregion
        //region Button3
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView test = (TextView) rootView.findViewById(R.id.user_answer);
                String toSet = (String) test.getText();
                if (toSet.compareTo("=?") == 0) toSet = "=";
                if (toSet.length() < MaximumDigitsAnswer)
                    test.setText(toSet + "3");
            }
        });
        //endregion
        //region Button4
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView test = (TextView) rootView.findViewById(R.id.user_answer);
                String toSet = (String) test.getText();
                if (toSet.compareTo("=?") == 0) toSet = "=";
                if (toSet.length() < MaximumDigitsAnswer)
                    test.setText(toSet + "4");
            }
        });
        //endregion
        //region Button5
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView test = (TextView) rootView.findViewById(R.id.user_answer);
                String toSet = (String) test.getText();
                if (toSet.compareTo("=?") == 0) toSet = "=";
                if (toSet.length() < MaximumDigitsAnswer)
                    test.setText(toSet + "5");
            }
        });
        //endregion
        //region Button6
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView test = (TextView) rootView.findViewById(R.id.user_answer);
                String toSet = (String) test.getText();
                if (toSet.compareTo("=?") == 0) toSet = "=";
                if (toSet.length() < MaximumDigitsAnswer)
                    test.setText(toSet + "6");
            }
        });
        //endregion
        //region Button7
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView test = (TextView) rootView.findViewById(R.id.user_answer);
                String toSet = (String) test.getText();
                if (toSet.compareTo("=?") == 0) toSet = "=";
                if (toSet.length() < MaximumDigitsAnswer)
                    test.setText(toSet + "7");
            }
        });
        //endregion
        //region Button8
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView test = (TextView) rootView.findViewById(R.id.user_answer);
                String toSet = (String) test.getText();
                if (toSet.compareTo("=?") == 0) toSet = "=";
                if (toSet.length() < MaximumDigitsAnswer)
                    test.setText(toSet + "8");
            }
        });
        //endregion
        //region Button9
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView test = (TextView) rootView.findViewById(R.id.user_answer);
                String toSet = (String) test.getText();
                if (toSet.compareTo("=?") == 0) toSet = "=";
                if (toSet.length() < MaximumDigitsAnswer)
                    test.setText(toSet + "9");
            }
        });
        //endregion
        //region Button0
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView test = (TextView) rootView.findViewById(R.id.user_answer);
                String toSet = (String) test.getText();
                if (toSet.compareTo("=?") == 0) toSet = "=";
                if (toSet.length() < MaximumDigitsAnswer)
                    test.setText(toSet + "0");
            }
        });
        //endregion
        //region ButtonDel
        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView test = (TextView) rootView.findViewById(R.id.user_answer);
                String toSet = (String) test.getText();
                if (toSet.compareTo("=?") == 0) toSet = "=";
                else if (!(toSet.compareTo("=") == 0)) {
                    toSet = toSet.substring(0, toSet.length() - 1);
                }
                test.setText(toSet);
            }
        });
        //endregion
        //region ButtonMinus
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView test = (TextView) rootView.findViewById(R.id.user_answer);
                String toSet = (String) test.getText();
                if (toSet.compareTo("=?") == 0 || toSet.compareTo("=") == 0) toSet = "=-";
                test.setText(toSet);
            }
        });
        //endregion
        //region ButtonHash
        buttonHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goNextQuestion(rootView);
            }
        });
        //endregion

        doTimer(rootView);

        return rootView;
    }

    public void goNextQuestion(View rootView) {

//        todo need to check how to add the 4 hints stuff
        //todo need to remove the visible/invisible condition. not enough.

        TextView correct = (TextView) rootView.findViewById(R.id.correct);
        int correctVisible = correct.getVisibility();
        TextView wrong = (TextView) rootView.findViewById(R.id.wrong);
        int wrongVisible = wrong.getVisibility();

        if (correctVisible == 4 && wrongVisible == 4) {//both invisible - first time pressed and timer expired
            compareAnswer(rootView);
            correctVisible = correct.getVisibility();
            if (correctVisible == 0) {
                myTimer.cancel();
            }
            //todo need to make it cancel only when the answer is correct -- needs testing properly
        } else {

            System.out.println("invisible");

            correct.setVisibility(View.INVISIBLE);
            wrong.setVisibility(View.INVISIBLE);

            numberOfQuestions++;
            Question nextQuestion = new Question(3);
            nextQuestion.start();

            TextView txt = (TextView) rootView.findViewById(R.id.guess);
            txt.setText(nextQuestion.getChallenge());
            //this will set the question to the TextView

            txt = (TextView) rootView.findViewById(R.id.good_answer);
            txt.setText(Integer.toString(nextQuestion.getAnswer()));
            //this will save the number of operations in an invisible text field
        }


    }

    @Override
    public void onPause() {
        super.onPause();

        // Get rid of the about dialog if it's still up
        if (mDialog != null)
            mDialog.dismiss();
    }

    public void compareAnswer(View rootView) {

        int userAnswer;

        final TextView ans = (TextView) rootView.findViewById(R.id.user_answer);
        final TextView goodAns = (TextView) rootView.findViewById(R.id.good_answer);

        String userAnswerRough = (String) ans.getText();

        userAnswerRough = userAnswerRough.substring(1, userAnswerRough.length());
        //1 because I want to skip the '=' sign

        int goodAnswer = Integer.parseInt((String) goodAns.getText());

        System.out.println("Good answer: " + goodAnswer);

        try {
            userAnswer = Integer.parseInt(userAnswerRough);
        } catch (Exception e) {
            userAnswer = -999999;
        }
        //todo try and crash this -- see if it really works all the time

        int timeRemaining = 7;
        //todo need to make connection with timer

//        doScore(userAnswer, goodAnswer, timeRemaining, rootView);

    }

//    public void doScore(int userAnswer, int goodAnswer, int timeRemaining, View rootView) {
//
//        if (goodAnswer == userAnswer) {
//            TextView ScoreView = (TextView) rootView.findViewById(R.id.score);
//            String scoreRough = (String) ScoreView.getText();
//            //this will have a string as-> Score:242
//            int colon = scoreRough.indexOf(":");
//            int score = Integer.parseInt(scoreRough.substring(colon + 1, scoreRough.length()));
//            //get the number after the colon ':'
//
//            int toAdd = (int) Math.round((double) 100 / (10 - timeRemaining));
//            //rounding the number in order to get 100/(10-4) = 100/6 = 17 points
//
//            score += toAdd;
//            ScoreView.setText("Score:" + Integer.toString(score));
//            TextView correct = (TextView) rootView.findViewById(R.id.correct);
//            correct.setVisibility(View.VISIBLE);
//            TextView wrong = (TextView) rootView.findViewById(R.id.wrong);
//            wrong.setVisibility(View.INVISIBLE);
//
//            TextView less = (TextView) rootView.findViewById(R.id.hint_less);
//            less.setVisibility(View.INVISIBLE);
//            TextView greater = (TextView) rootView.findViewById(R.id.hint_greater);
//            greater.setVisibility(View.INVISIBLE);
//        } else {
//            Switch Hints = (Switch) rootView.findViewById(R.id.Hints);
//            if (Hints.isChecked())
//                if (goodAnswer < userAnswer) {
//                    TextView less = (TextView) rootView.findViewById(R.id.hint_less);
//                    less.setVisibility(View.VISIBLE);
//                    TextView greater = (TextView) rootView.findViewById(R.id.hint_greater);
//                    greater.setVisibility(View.INVISIBLE);
//                } else {
//                    TextView less = (TextView) rootView.findViewById(R.id.hint_less);
//                    less.setVisibility(View.INVISIBLE);
//                    TextView greater = (TextView) rootView.findViewById(R.id.hint_greater);
//                    greater.setVisibility(View.VISIBLE);
//                }
//            TextView wrong = (TextView) rootView.findViewById(R.id.wrong);
//            wrong.setVisibility(View.VISIBLE);
//            TextView correct = (TextView) rootView.findViewById(R.id.correct);
//            correct.setVisibility(View.INVISIBLE);
//        }
//    }

    public void doScore(View rootView) {

    }


    public void doTimer(final View rootView) {
        myTimer = new CountDownTimer(10000, 1000) {
            final TextView timer = (TextView) rootView.findViewById(R.id.time);

            public void onTick(long millisUntilFinished) {
                timer.setText(millisUntilFinished / 1000 + " secs");
            }

            public void onFinish() {
                makeAllInvisible(rootView);
                goNextQuestion(rootView);
            }
        }.start();
    }

    public void makeAllInvisible(View rootView) {
        TextView myTextView;

        myTextView = (TextView) rootView.findViewById(R.id.correct);
        myTextView.setVisibility(View.INVISIBLE);
        myTextView = (TextView) rootView.findViewById(R.id.wrong);
        myTextView.setVisibility(View.INVISIBLE);
        myTextView = (TextView) rootView.findViewById(R.id.hint_less);
        myTextView.setVisibility(View.INVISIBLE);
        myTextView = (TextView) rootView.findViewById(R.id.hint_greater);
        myTextView.setVisibility(View.INVISIBLE);
    }

    public void makeCorrectVisible(View rootView) {
        TextView myTextView;

        myTextView = (TextView) rootView.findViewById(R.id.correct);
        myTextView.setVisibility(View.VISIBLE);
        myTextView = (TextView) rootView.findViewById(R.id.wrong);
        myTextView.setVisibility(View.INVISIBLE);
        myTextView = (TextView) rootView.findViewById(R.id.hint_less);
        myTextView.setVisibility(View.INVISIBLE);
        myTextView = (TextView) rootView.findViewById(R.id.hint_greater);
        myTextView.setVisibility(View.INVISIBLE);
    }

    public void makeWrongVisible(View rootView) {
        TextView myTextView;

        myTextView = (TextView) rootView.findViewById(R.id.correct);
        myTextView.setVisibility(View.INVISIBLE);
        myTextView = (TextView) rootView.findViewById(R.id.wrong);
        myTextView.setVisibility(View.VISIBLE);
        myTextView = (TextView) rootView.findViewById(R.id.hint_less);
        myTextView.setVisibility(View.INVISIBLE);
        myTextView = (TextView) rootView.findViewById(R.id.hint_greater);
        myTextView.setVisibility(View.INVISIBLE);
    }

    public void makeWrongLess(View rootView) {
        TextView myTextView;

        myTextView = (TextView) rootView.findViewById(R.id.correct);
        myTextView.setVisibility(View.INVISIBLE);
        myTextView = (TextView) rootView.findViewById(R.id.wrong);
        myTextView.setVisibility(View.VISIBLE);
        myTextView = (TextView) rootView.findViewById(R.id.hint_less);
        myTextView.setVisibility(View.VISIBLE);
        myTextView = (TextView) rootView.findViewById(R.id.hint_greater);
        myTextView.setVisibility(View.INVISIBLE);
    }

    public void makeWrongGreater(View rootView) {
        TextView myTextView;

        myTextView = (TextView) rootView.findViewById(R.id.correct);
        myTextView.setVisibility(View.INVISIBLE);
        myTextView = (TextView) rootView.findViewById(R.id.wrong);
        myTextView.setVisibility(View.VISIBLE);
        myTextView = (TextView) rootView.findViewById(R.id.hint_less);
        myTextView.setVisibility(View.INVISIBLE);
        myTextView = (TextView) rootView.findViewById(R.id.hint_greater);
        myTextView.setVisibility(View.VISIBLE);
    }




}