package home.eduard.braintraininggame;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends Activity {

    private GameFragment mGameFragment;
    private Handler mHandler = new Handler();
    public static final String KEY_RESTORE = "key_restore";
    public static final String PREF_RESTORE = "pref_restore";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        View root = findViewById(android.R.id.content);



        mGameFragment = (GameFragment) getFragmentManager().findFragmentById(R.id.fragment_game);

        boolean restore = getIntent().getBooleanExtra(KEY_RESTORE, false);
        if (restore) {
            mGameFragment.setContinueGame(true);
            Log.d("Continue", "Continue = " + mGameFragment.isContinueGame());

            String gameData = getPreferences(MODE_PRIVATE)
                    .getString(PREF_RESTORE, null);
            if (gameData != null) {
                mGameFragment.putState(gameData);
            }

        }else{
            mGameFragment.setContinueGame(false);
            Log.d("New Game", "Continue = " + mGameFragment.isContinueGame());

            String intentVal = getIntent().getStringExtra("DIFFICULTY");

            int level = Integer.parseInt(intentVal);

            Question firstQuestion = new Question(level);
            firstQuestion.start();
            //start method will generate a question

            TextView txt = (TextView) root.findViewById(R.id.guess);
            txt.setText(firstQuestion.getChallenge());
            //this will set the question to the Guess: TextView

            txt = (TextView) root.findViewById(R.id.good_answer);
            txt.setText(Integer.toString(firstQuestion.getAnswer()));
            //this will save the good answer in an invisible text field

            txt = (TextView) root.findViewById(R.id.level_chosen);
            txt.setText(Integer.toString(level));
            //this will save the level chosen in an invisible text field
        }
        Log.d("BTG", "restore = " + restore);



    }

    @Override
    protected void onPause() {
        super.onPause();

        CountDownTimer timer = mGameFragment.getMyTimer();
        if(timer!=null) timer.cancel();

        mHandler.removeCallbacks(null);
        String gameData = mGameFragment.getState();
        getPreferences(MODE_PRIVATE).edit()
                .putString(PREF_RESTORE, gameData)
                .commit();
        Log.d("BTG", "state = " + gameData);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
