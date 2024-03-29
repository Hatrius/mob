package com.example.imageslider;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.annotation.NonNull;

public class CustomDialogFragment extends DialogFragment {

    @NonNull


    public Dialog onCreateDialog (Bundle savedInstanceState){

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        return builder
                .setTitle("Вы ошиблись")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage("Попробуйте еще раз!")
                .setPositiveButton("OK", null)
                .create();
    }
}
