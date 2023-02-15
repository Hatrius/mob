package com.example.imageslider;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.annotation.NonNull;

public class CustomDialogFragment2 extends DialogFragment {

    @NonNull


    public Dialog onCreateDialog (Bundle savedInstanceState){

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        return builder
                .setTitle("Ты решил всё правильно!")
                .setIcon(android.R.drawable.ic_dialog_info)
                .setMessage("Домашние задание выполнено! \nМожешь приступать к следующему уроку.")
                .setPositiveButton("Круто", null)
                .create();
    }
}

