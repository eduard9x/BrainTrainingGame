package home.eduard.braintraininggame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        String intentVal = getIntent().getStringExtra("DIFFICULTY");

        View root = findViewById(android.R.id.content);

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
    }

}
