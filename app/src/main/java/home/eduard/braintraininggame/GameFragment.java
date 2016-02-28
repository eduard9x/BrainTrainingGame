package home.eduard.braintraininggame;

import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class GameFragment extends Fragment {

    private AlertDialog mDialog;
    private final int MaximumDigitsAnswer = 6;

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
                final TextView test = (TextView) rootView.findViewById(R.id.answer);
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
                final TextView test = (TextView) rootView.findViewById(R.id.answer);
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
                final TextView test = (TextView) rootView.findViewById(R.id.answer);
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
                final TextView test = (TextView) rootView.findViewById(R.id.answer);
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
                final TextView test = (TextView) rootView.findViewById(R.id.answer);
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
                final TextView test = (TextView) rootView.findViewById(R.id.answer);
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
                final TextView test = (TextView) rootView.findViewById(R.id.answer);
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
                final TextView test = (TextView) rootView.findViewById(R.id.answer);
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
                final TextView test = (TextView) rootView.findViewById(R.id.answer);
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
                final TextView test = (TextView) rootView.findViewById(R.id.answer);
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
                final TextView test = (TextView) rootView.findViewById(R.id.answer);
                String toSet = (String) test.getText();
                if (toSet.compareTo("=?") == 0) toSet = "=";
                else if (!(toSet.compareTo("=") == 0)) {
                    toSet = toSet.substring(0,toSet.length()-1);
                }
                test.setText(toSet);
            }
        });
        //endregion
        //region ButtonMinus
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final TextView test = (TextView) rootView.findViewById(R.id.answer);
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

        return rootView;
    }

    public void goNextQuestion(View rootView){
        final TextView test = (TextView) rootView.findViewById(R.id.answer);
        String toSet = (String) test.getText();
        System.out.println("Go next with: " + toSet);
    }

    @Override
    public void onPause() {
        super.onPause();

        // Get rid of the about dialog if it's still up
        if (mDialog != null)
            mDialog.dismiss();
    }

}