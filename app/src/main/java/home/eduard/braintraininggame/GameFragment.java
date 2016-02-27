package home.eduard.braintraininggame;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class GameFragment extends Fragment {

    private AlertDialog mDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_game, container, false);
        // Handle buttons here...

        final View button1 = rootView.findViewById(R.id.button1);
        final View button2 = rootView.findViewById(R.id.button2);
//        final View answer = rootView.findViewById(R.id.answer);



//        answer.setOnTouchListener(new View.OnTouchListener() {
//            public boolean onTouch (View v, MotionEvent event) {
//                return true; // the listener has consumed the event
//            }
//        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("Name","Harneet");
                editor.apply();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
                String name = preferences.getString("Name", "");
//                if(!name.equalsIgnoreCase(""))
//                {
//                    name = name + "  Sethi";  /* Edit the value here*/
//                }

                final TextView test = (TextView) rootView.findViewById(R.id.answer);
                test.setText(test.getText() + name);

                System.out.println(name);
            }
        });

        return rootView;
    }

    @Override
    public void onPause() {
        super.onPause();

        // Get rid of the about dialog if it's still up
        if (mDialog != null)
            mDialog.dismiss();
    }

}