package home.eduard.braintraininggame;

import android.app.Activity;
import android.os.Bundle;

public class GameActivity extends Activity {
    protected int val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        String intentVal = getIntent().getStringExtra("DIFFICULTY");

        val = Integer.parseInt(intentVal);

        switch (val) {
            case 0:
                novice();
                break;
        }

    }

    public void novice() {

        double number = Math.floor(Math.random() * 2 + 2);
        int operations = (int) number;


    }
}