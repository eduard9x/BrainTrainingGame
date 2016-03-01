package home.eduard.braintraininggame;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MainFragment extends Fragment {

    private AlertDialog mDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        // Handle buttons here...

        View newGameButton = rootView.findViewById(R.id.new_button);
        View continueButton = rootView.findViewById(R.id.continue_button);
        View aboutButton = rootView.findViewById(R.id.about_button);

        newGameButton.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View view){

                AlertDialog.Builder builder =
                        new AlertDialog.Builder(getActivity());
                builder.setTitle(R.string.difficulty_label);
                builder.setItems(new CharSequence[]{"Novice", "Easy", "Medium", "Guru"}, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0:
                                createIntent(which);
                                break;
                            case 1:
                                createIntent(which);
                                break;
                            case 2:
                                createIntent(which);
                                break;
                            case 3:
                                createIntent(which);
                                break;
                        }
                    }
                });
                builder.setCancelable(false);
                mDialog = builder.show();
            }
        });

//        continueButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//        public void onClick(View view){
//                Intent intent = new Intent(getActivity(), GameActivity.class);
////                intent.putExtra(GameActivity.KEY_RESTORE,true);
//                getActivity().startActivity(intent);
//            }
//        });

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(getActivity());
                builder.setTitle(R.string.about_title);
                builder.setMessage(R.string.about_text);
                builder.setCancelable(false);
                builder.setPositiveButton(R.string.ok_label,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface,
                                                int i) {
                                // nothing
                            }
                        });
                mDialog = builder.show();
            }
        });
        return rootView;
    }

    void createIntent(int difficulty){

        Intent intent_difficulty = new Intent(getActivity(), GameActivity.class);
        intent_difficulty.putExtra("DIFFICULTY",Integer.toString(difficulty));
        getActivity().startActivity(intent_difficulty);

    }

    @Override
    public void onPause() {
        super.onPause();

        // Get rid of the about dialog if it's still up
        if (mDialog != null)
            mDialog.dismiss();
    }
}