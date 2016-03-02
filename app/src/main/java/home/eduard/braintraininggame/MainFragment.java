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
import android.widget.TextView;

public class MainFragment extends Fragment {

    private AlertDialog mDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        initViews(rootView);

        return rootView;
    }

    void createIntent(int difficulty){
        Intent intent_difficulty = new Intent(getActivity(), GameActivity.class);
        intent_difficulty.putExtra("DIFFICULTY",Integer.toString(difficulty));
        getActivity().startActivity(intent_difficulty);
    }

    public void initViews(View rootView){
        //region Declarations
        View newGameButton = rootView.findViewById(R.id.new_button);
        View continueButton = rootView.findViewById(R.id.continue_button);
        View aboutButton = rootView.findViewById(R.id.about_button);
        View exitButton = rootView.findViewById(R.id.exit_button);
        //endregion
        //region New game listener
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
        //endregion
        //region Continue listener
        continueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), GameActivity.class);
                intent.putExtra(GameActivity.KEY_RESTORE,true);
                getActivity().startActivity(intent);
            }
        });
        //endregion
        //region About listener
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
        //endregion
        //region exit listener
        exitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder =
                        new AlertDialog.Builder(getActivity());
                builder.setTitle(R.string.save_label);
                builder.setMessage(R.string.save_message);
                builder.setPositiveButton(R.string.save_btn,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface,
                                                int i) {
                                System.out.println("Saving the stage of this game.");
                                getActivity().finish();
                                System.exit(0);
                            }
                        });
                builder.setNegativeButton(R.string.exit_label,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface,
                                                int i) {
                                getActivity().finish();
                                System.exit(0);
                            }
                        });
                builder.setCancelable(false);
                mDialog = builder.show();
            }
        });
        //endregion
    }

    @Override
    public void onPause() {
        super.onPause();

        // Get rid of the about dialog if it's still up
        if (mDialog != null)
            mDialog.dismiss();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
}