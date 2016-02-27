package home.eduard.braintraininggame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends Activity {
    protected int level;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        String intentVal = getIntent().getStringExtra("DIFFICULTY");

        View root = findViewById(android.R.id.content);

        level = Integer.parseInt(intentVal);
        Question firstQuestion = new Question(level);
        firstQuestion.start();
        //start method will generate a question

        TextView txt = (TextView) root.findViewById(R.id.guess);
        txt.setText(firstQuestion.getChallenge());
        //this will set the question to the TextView
    }

}
