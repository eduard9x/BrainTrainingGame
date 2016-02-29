package home.eduard.braintraininggame;

import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class GameFragment extends Fragment {

    private AlertDialog mDialog;
    private final int MaximumDigitsAnswer = 6;
    private int numberOfQuestions = 1;
    private CountDownTimer myTimer;
    private int numberOfTimes = 0;
    private View buttonHash;

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
        buttonHash = rootView.findViewById(R.id.buttonHash);
        final View buttonMinus = rootView.findViewById(R.id.buttonMinus);
        final Switch switchHints = (Switch) rootView.findViewById(R.id.hints);
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
        //region ButtonHash1
        setButtonHash1(rootView);
        //endregion
        //region SwitchHints
        switchHints.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    setButtonHash3(rootView);
                } else {
                    setButtonHash1(rootView);
                }
            }
        });
        //endregion

        doTimer(rootView);

        return rootView;
    }

    public void goNextQuestion(View rootView) {

        makeAllInvisible(rootView);

        TextView txt = (TextView) rootView.findViewById(R.id.level_chosen);
        int level = Integer.parseInt((String) txt.getText());
        Question nextQuestion = new Question(level);
        nextQuestion.start();

        txt = (TextView) rootView.findViewById(R.id.guess);
        txt.setText(nextQuestion.getChallenge());
        //this will set the question to the Guess TextView

        txt = (TextView) rootView.findViewById(R.id.user_answer);
        txt.setText("=?");
        //reset the user's answer field to default '?'

        //reset the limit number of times
        numberOfTimes = 0;

        txt = (TextView) rootView.findViewById(R.id.good_answer);
        txt.setText(Integer.toString(nextQuestion.getAnswer()));
        //this will save the good answer in an invisible text field

        doTimer(rootView);
        //start a new timer for a new question

        numberOfQuestions++;
        //add one more to the counter
    }

    @Override
    public void onPause() {
        super.onPause();

        // Get rid of the about dialog if it's still up
        if (mDialog != null)
            mDialog.dismiss();
    }

    public int compareAnswer(View rootView) {

        int userAnswer;

        TextView ans = (TextView) rootView.findViewById(R.id.user_answer);
        TextView goodAns = (TextView) rootView.findViewById(R.id.good_answer);

        String userAnswerRough = (String) ans.getText();
        userAnswerRough = userAnswerRough.substring(1, userAnswerRough.length());
        //1 because I want to skip the '=' sign

        int goodAnswer = Integer.parseInt((String) goodAns.getText());
//        System.out.println("Good answer: " + goodAnswer);

        userAnswer = Integer.parseInt(userAnswerRough);

        return userAnswer - goodAnswer;
    }

    public void doScore(View rootView) {
        TextView score = (TextView) rootView.findViewById(R.id.score);
        TextView time = (TextView) rootView.findViewById(R.id.time);

        String scoreRough = (String) score.getText();
        //this will have a string as-> Score:242
        int colon = scoreRough.indexOf(":");
        int previousScore = Integer.parseInt(scoreRough.substring(colon + 1, scoreRough.length()));
        //get the number after the colon ':'

        String timer = (String) time.getText();
        int timeRemaining = Integer.parseInt(timer.substring(0, timer.indexOf(" ")));

        int toAdd = (int) Math.round((double) 100 / (10 - timeRemaining));

        int finalScore = previousScore + toAdd;
        score.setText("Score:" + Integer.toString(finalScore));
    }

    public void doTimer(final View rootView) {
        myTimer = new CountDownTimer(10000, 1000) {
            final TextView timer = (TextView) rootView.findViewById(R.id.time);

            public void onTick(long millisUntilFinished) {
                timer.setText(millisUntilFinished / 1000 + " secs");
            }

            public void onFinish() {
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

    public void setButtonHash1(final View rootView) {
        buttonHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isProperAnswer(rootView)) {
                    int result = compareAnswer(rootView);
                    //compare the answer with the correct one
                    myTimer.cancel();
                    //stop the timer no matter what
                    doResults(result, rootView);
                    //check if the result is good and display the proper message
                    setButtonHash2(rootView);
                    //change the event to the next one -- expecting to get a new question
                }
            }
        });
    }

    public void setButtonHash2(final View rootView) {
        buttonHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //need to start a new question
                goNextQuestion(rootView);
                //change the event to the first one
                setButtonHash1(rootView);
            }
        });
    }

    public void setButtonHash3(final View rootView) {
        buttonHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isProperAnswer(rootView)) {
                    int result = compareAnswer(rootView);
                    //compare the answer with the correct one

                    if (numberOfTimes < 3) {
                        doResultsWithHints(result, rootView);
                        //check if the result is good and display the proper message
                    } else {
                        myTimer.cancel();
                        //stop the timer
                        goNextQuestion(rootView);
                        //start a new question
                    }
                }
            }
        });
    }

    public void setButtonHash4(final View rootView) {
        buttonHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //need to start a new question
                goNextQuestion(rootView);
                //change the event to the one that allows hints
                setButtonHash3(rootView);
            }
        });
    }

    public boolean isProperAnswer(View rootView) {

        TextView userAnswer = (TextView) rootView.findViewById(R.id.user_answer);
        String answer = (String) userAnswer.getText();

        switch (answer) {
            case "=?":
                return false;
            case "=-":
                return false;
            case "=":
                return false;
            default:
                return true;
        }
    }

    public void doResults(int result, View rootView) {
        if (result == 0) {
            //the answer is correct
            makeCorrectVisible(rootView);
            //add points to the score
            doScore(rootView);
        } else
            //the answer is wrong
            makeWrongVisible(rootView);
    }

    public void doResultsWithHints(int result, View rootView) {
        if (result == 0) {
            myTimer.cancel();
            //the answer is correct
            makeCorrectVisible(rootView);
            //add points to the score
            doScore(rootView);
            //set the event listener to the one that gives a nest question and hints
            setButtonHash4(rootView);
        } else if (result > 0) {
            //the answer is wrong less
            makeWrongLess(rootView);
            //add one turn to the counter
            numberOfTimes++;
        } else {
            //the answer is wrong greater
            makeWrongGreater(rootView);
            //add one turn to the counter
            numberOfTimes++;
        }
    }

}

//todo need to remove the bug: if you have a correct answer, timer stops, click hints:on, click #, get credited again for results