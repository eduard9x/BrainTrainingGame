package home.eduard.braintraininggame;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;


public class GameFragment extends Fragment {

    private AlertDialog mDialog;
    private final int MaximumDigitsAnswer = 6;
    private int numberOfQuestions = 1;
    private CountDownTimer myTimer;
    private int numberOfTimes = 0;
    private final int questionsAvailable = 10;
    private View buttonHash;
    private View rootView;
    private int hashEvent = 0;
    private boolean continueGame = false;
    private int secondsTimer = 10;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_game, container, false);
        // Retain this fragment across configuration changes.
        setRetainInstance(true);

        //region Declarations
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
        final View buttonStart = rootView.findViewById(R.id.start_button);
        buttonHash = rootView.findViewById(R.id.buttonHash);
        final View buttonMinus = rootView.findViewById(R.id.buttonMinus);
        final Switch switchHints = (Switch) rootView.findViewById(R.id.hints);
        //endregion

        TextView questionLabel = (TextView) rootView.findViewById(R.id.guess);
        questionLabel.setVisibility(View.INVISIBLE);

        TextView answerLabel = (TextView) rootView.findViewById(R.id.user_answer);
        answerLabel.setVisibility(View.INVISIBLE);

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
        setButtonHash1();
        //endregion
        //region SwitchHints
        switchHints.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if (anyVisible()) setButtonHash4();
                    else
                        setButtonHash3();
                } else {
                    if (anyVisible()) setButtonHash2();
                    else
                        setButtonHash1();
                }
            }
        });
        //endregion
        //region Button Start
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Button startBtn = (Button) rootView.findViewById(R.id.start_button);
                startBtn.setVisibility(View.INVISIBLE);

                TextView questionLabel = (TextView) rootView.findViewById(R.id.guess);
                questionLabel.setVisibility(View.VISIBLE);

                TextView answerLabel = (TextView) rootView.findViewById(R.id.user_answer);
                answerLabel.setVisibility(View.VISIBLE);

                TextView timeLabel = (TextView) rootView.findViewById(R.id.time);
                String timeOnScreen = (String) timeLabel.getText();
                int time = Integer.parseInt(timeOnScreen.substring(0, timeOnScreen.indexOf(" ")));

                Log.d("Time", "time = " + time);
                Log.d("Fragment", "Continue = " + isContinueGame());

                CountDownTimer timer = getMyTimer();
                if (timer != null) timer.cancel();


                if (isContinueGame()) {
                    if (!anyVisible()) {
                        doTimer(time);
                    }
                } else {
                    doTimer(time);
                }

                /* todo in here, the continue is true, so I can add a switch or something to make sure
                ** I have some kind of behaviour on continue and a different one in the new game.
                */

            }
        });
        //endregion

//        doTimer();

        return rootView;
    }

    public void continueWithLabels() {
        Button startBtn = (Button) rootView.findViewById(R.id.start_button);
        startBtn.setVisibility(View.INVISIBLE);

        TextView questionLabel = (TextView) rootView.findViewById(R.id.guess);
        questionLabel.setVisibility(View.VISIBLE);

        TextView answerLabel = (TextView) rootView.findViewById(R.id.user_answer);
        answerLabel.setVisibility(View.VISIBLE);
    }

    public void goNextQuestion() {
        makeAllInvisible();

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

        doTimer(secondsTimer);
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

    public int compareAnswer() {

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

    public void doScore() {
        TextView score = (TextView) rootView.findViewById(R.id.score);
        TextView time = (TextView) rootView.findViewById(R.id.time);

        String scoreRough = (String) score.getText();
        //this will have a string as-> Score:242
        int colon = scoreRough.indexOf(":");
        int previousScore = Integer.parseInt(scoreRough.substring(colon + 1, scoreRough.length()));
        //get the number after the colon ':'

        String timer = (String) time.getText();
        int timeRemaining = Integer.parseInt(timer.substring(0, timer.indexOf(" ")));

        if (timeRemaining == 10) timeRemaining = 9;
        int toAdd = (int) Math.round((double) 100 / (10 - timeRemaining));

        int finalScore = previousScore + toAdd;
        score.setText("Score:" + Integer.toString(finalScore));
    }

    public void doTimer(int miliseconds) {
        myTimer = new CountDownTimer(miliseconds * 1000, 1000) {
            final TextView timer = (TextView) rootView.findViewById(R.id.time);

            public void onTick(long millisUntilFinished) {
                timer.setText(millisUntilFinished / 1000 + " secs");
            }

            public void onFinish() {
                goNextQuestion();
            }
        }.start();
    }

    public void makeAllInvisible() {
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

    public void makeCorrectVisible() {
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

    public void makeWrongVisible() {
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

    public void makeWrongLess() {
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

    public void makeWrongGreater() {
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

    public void setButtonHash1() {
        hashEvent = 1;

        buttonHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("hash event:" + hashEvent);
                if (isProperAnswer()) {
                    //compare the answer with the correct one
                    int result = compareAnswer();
                    //stop the timer no matter what
                    CountDownTimer timer = getMyTimer();
                    if (timer != null) timer.cancel();
                    //check if the result is good and display the proper message
                    doResults(result);
                    //using this to make sure the game will send a pop-up message at the end of 10th question
                    switch (numberOfQuestions) {
                        case questionsAvailable:
                            doEnding();
                            break;
                        default:
                            hashEvent = 2;
                            setButtonHash2();
                            //change the event to the next one -- expecting to get a new question
                            break;
                    }
                }
            }
        });
    }

    public void setButtonHash2() {
        hashEvent = 2;

        buttonHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("hash event:" + hashEvent);
                if (isProperAnswer()) {
                    //need to start a new question
                    goNextQuestion();
                    //change the event to the first one
                    setButtonHash1();
                }
            }
        });
    }

    public void setButtonHash3() {
        hashEvent = 3;

        buttonHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("hash event:" + hashEvent);
                if (isProperAnswer()) {

                    int result = compareAnswer();
                    //compare the answer with the correct one

                    if (numberOfTimes < 3) {
                        doResultsWithHints(result);
                        //check if the result is good and display the proper message
                    } else {
                        //stop the timer
                        CountDownTimer timer = getMyTimer();
                        if (timer != null) timer.cancel();
                        //using this to make sure the game will send a pop-up message at the end of 10th question
                        switch (numberOfQuestions) {
                            case questionsAvailable:
                                doEnding();
                                break;
                            default:
                                goNextQuestion();
                                //start a new question
                                break;
                        }
                    }
                }
            }
        });
    }

    //when you answer correctly with hints on, this will be executed for next question
    public void setButtonHash4() {
        hashEvent = 4;

        buttonHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("hash event:" + hashEvent);
                if (isProperAnswer()) {
                    //need to start a new question
                    goNextQuestion();
                    //change the event to the one that allows hints
                    setButtonHash3();
                }
            }
        });
    }

    public boolean isProperAnswer() {

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

    public void doResults(int result) {
        if (result == 0) {
            //the answer is correct
            makeCorrectVisible();
            //add points to the score
            doScore();
        } else
            //the answer is wrong
            makeWrongVisible();
    }

    public void doResultsWithHints(int result) {
        if (result == 0) {
            CountDownTimer timer = getMyTimer();
            if (timer != null) timer.cancel();
            //the answer is correct
            makeCorrectVisible();
            //add points to the score
            doScore();

            //using this to make sure the game will send a pop-up message at the end of 10th question
            switch (numberOfQuestions) {
                case questionsAvailable:
                    doEnding();
                    break;
                default:
                    //set the event listener to the one that gives a nest question and hints
                    setButtonHash4();
                    break;
            }

        } else if (result > 0) {
            //the answer is wrong less
            makeWrongLess();
            //add one turn to the counter
            numberOfTimes++;
        } else {
            //the answer is wrong greater
            makeWrongGreater();
            //add one turn to the counter
            numberOfTimes++;
        }
    }

    public boolean anyVisible() {
        boolean anyVisible = false;
        TextView myTextView;

        myTextView = (TextView) rootView.findViewById(R.id.correct);
        if (myTextView.getVisibility() == View.VISIBLE) anyVisible = true;
        myTextView = (TextView) rootView.findViewById(R.id.wrong);
        if (myTextView.getVisibility() == View.VISIBLE) anyVisible = true;
        myTextView = (TextView) rootView.findViewById(R.id.hint_less);
        if (myTextView.getVisibility() == View.VISIBLE) anyVisible = true;
        myTextView = (TextView) rootView.findViewById(R.id.hint_greater);
        if (myTextView.getVisibility() == View.VISIBLE) anyVisible = true;

        return anyVisible;
    }

    public void doEnding() {

        CountDownTimer timer = getMyTimer();
        if (timer != null) timer.cancel();

        AlertDialog.Builder builder =
                new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.ending_label);

        TextView score = (TextView) rootView.findViewById(R.id.score);
        String message = "Good job.\nYou managed to get this " + (String) score.getText();
        builder.setMessage(message);
        builder.setPositiveButton(R.string.ok_label,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface,
                                        int i) {
                        getActivity().finish();
                    }
                });
        builder.setCancelable(false);
        mDialog = builder.show();

    }

    /**
     * Create a string containing the state of the game.
     */
    public String getState() {
        StringBuilder builder = new StringBuilder();

        TextView myView = (TextView) rootView.findViewById(R.id.guess);
        String myString = (String) myView.getText();

        builder.append(myString);
        builder.append(',');

        myView = (TextView) rootView.findViewById(R.id.level_chosen);
        myString = (String) myView.getText();

        builder.append(myString);
        builder.append(',');

        myView = (TextView) rootView.findViewById(R.id.score);
        myString = (String) myView.getText();

        builder.append(myString);
        builder.append(',');

        myView = (TextView) rootView.findViewById(R.id.user_answer);
        myString = (String) myView.getText();

        builder.append(myString);
        builder.append(',');

        myView = (TextView) rootView.findViewById(R.id.time);
        myString = (String) myView.getText();

        builder.append(myString);
        builder.append(',');

        myView = (TextView) rootView.findViewById(R.id.good_answer);
        myString = (String) myView.getText();

        builder.append(myString);
        builder.append(',');

        myString = Integer.toString(hashEvent);

        builder.append(myString);
        builder.append(',');

        myView = (TextView) rootView.findViewById(R.id.correct);
        myString = Integer.toString(myView.getVisibility());

        builder.append(myString);
        builder.append(',');

        myView = (TextView) rootView.findViewById(R.id.wrong);
        myString = Integer.toString(myView.getVisibility());

        builder.append(myString);
        builder.append(',');

        myView = (TextView) rootView.findViewById(R.id.hint_greater);
        myString = Integer.toString(myView.getVisibility());

        builder.append(myString);
        builder.append(',');

        myView = (TextView) rootView.findViewById(R.id.hint_less);
        myString = Integer.toString(myView.getVisibility());

        builder.append(myString);
        builder.append(',');

        Switch mySwitch = (Switch) rootView.findViewById(R.id.hints);
        boolean switchToBeSaved = mySwitch.isChecked();
        myString = Boolean.toString(switchToBeSaved);

        builder.append(myString);
        builder.append(',');

        myString = Integer.toString(numberOfQuestions);

        builder.append(myString);
        builder.append(',');


        return builder.toString();
    }

    /**
     * Restore the state of the game from the given string.
     */
    public void putState(String gameData) {
        String[] fields = gameData.split(",");
        int index = 0;

        String question = fields[index];
        index++;
        String level = fields[index];
        index++;
        String score = fields[index];
        index++;
        String answer = fields[index];
        index++;
        String time = fields[index];
        index++;
        String goodAnswer = fields[index];
        index++;
        String hashListener = fields[index];
        index++;
        String correctVisibility = fields[index];
        index++;
        String wrongVisibility = fields[index];
        index++;
        String greaterVisibility = fields[index];
        index++;
        String lessVisibility = fields[index];
        index++;
        String switchChange = fields[index];
        index++;
        String numberOfQuestionsReached = fields[index];
        index++;

        restoreQuestion(question);
        restoreLevel(level);
        restoreScore(score);
        restoreUserAnswer(answer);
        restoreGoodAnswer(goodAnswer);
        restoreHashListener(hashListener);
        restoreCorrect(correctVisibility);
        restoreWrong(wrongVisibility);
        restoreGreater(greaterVisibility);
        restoreLess(lessVisibility);
        restoreSwitch(switchChange);
        restoreNumberOfQuestions(numberOfQuestionsReached);
        restoreTime(time);
    }

    public void restoreNumberOfQuestions(String numberOfQuestionsReached) {
        int number = Integer.parseInt(numberOfQuestionsReached);
        numberOfQuestions = number;
    }

    public void restoreSwitch(String switchChange) {
        boolean switchState = Boolean.parseBoolean(switchChange);
        Switch mySwitch = (Switch) rootView.findViewById(R.id.hints);
        mySwitch.setChecked(switchState);
    }

    public void restoreLess(String lessVisibility) {
        int less = Integer.parseInt(lessVisibility);
        TextView lessView = (TextView) rootView.findViewById(R.id.hint_less);

        switch (less) {
            case View.VISIBLE:
                lessView.setVisibility(View.VISIBLE);
                continueWithLabels();
                break;
            default:
                lessView.setVisibility(View.INVISIBLE);
                break;
        }

    }

    public void restoreGreater(String greaterVisibility) {
        int greater = Integer.parseInt(greaterVisibility);
        TextView greaterView = (TextView) rootView.findViewById(R.id.hint_greater);

        switch (greater) {
            case View.VISIBLE:
                greaterView.setVisibility(View.VISIBLE);
                continueWithLabels();
                break;
            default:
                greaterView.setVisibility(View.INVISIBLE);
                break;
        }

    }

    public void restoreWrong(String wrongVisibility) {
        int wrong = Integer.parseInt(wrongVisibility);
        TextView wrongView = (TextView) rootView.findViewById(R.id.wrong);

        switch (wrong) {
            case View.VISIBLE:
                wrongView.setVisibility(View.VISIBLE);
                continueWithLabels();
                break;
            default:
                wrongView.setVisibility(View.INVISIBLE);
                break;
        }

    }

    public void restoreCorrect(String correctVisibility) {
        int correct = Integer.parseInt(correctVisibility);
        TextView correctView = (TextView) rootView.findViewById(R.id.correct);

        switch (correct) {
            case View.VISIBLE:
                correctView.setVisibility(View.VISIBLE);
                continueWithLabels();
                break;
            default:
                correctView.setVisibility(View.INVISIBLE);
                break;
        }

    }

    public void restoreHashListener(String hashListener) {
        int hash = Integer.parseInt(hashListener);

        switch (hash) {
            case 1:
                setButtonHash1();
                break;
            case 2:
                setButtonHash2();
                break;
            case 3:
                setButtonHash3();
                break;
            default:
                setButtonHash4();
                break;
        }

    }

    public void restoreGoodAnswer(String goodAnswer) {
        TextView goodAnswerView = (TextView) rootView.findViewById(R.id.good_answer);
        goodAnswerView.setText(goodAnswer);
    }

    public void restoreTime(String time) {
        TextView Time = (TextView) rootView.findViewById(R.id.time);
        Time.setText(time);
    }

    public void restoreUserAnswer(String answer) {
        TextView Answer = (TextView) rootView.findViewById(R.id.user_answer);
        Answer.setText(answer);
    }

    public void restoreScore(String score) {
        TextView Score = (TextView) rootView.findViewById(R.id.score);
        Score.setText(score);
    }

    public void restoreQuestion(String question) {
        TextView guess = (TextView) rootView.findViewById(R.id.guess);
        guess.setText(question);
    }

    public void restoreLevel(String level) {
        TextView lvl = (TextView) rootView.findViewById(R.id.level_chosen);
        lvl.setText(level);
    }

    public void setNumberOfQuestions(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public int getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public CountDownTimer getMyTimer() {
        return myTimer;
    }

    public int getHashEvent() {
        return hashEvent;
    }

    public void setHashEvent(int hashEvent) {
        this.hashEvent = hashEvent;
    }

    public boolean isContinueGame() {
        return continueGame;
    }

    public void setContinueGame(boolean continueGame) {
        this.continueGame = continueGame;
    }
}
