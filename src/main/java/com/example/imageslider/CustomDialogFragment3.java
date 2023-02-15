package com.example.imageslider;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class CustomDialogFragment3 extends DialogFragment {

    @NonNull


    public Dialog onCreateDialog (Bundle savedInstanceState){

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        return builder
                .setTitle("Ты решил всё правильно!")
                .setIcon(android.R.drawable.ic_dialog_info)
                .setMessage("Домашние задание выполнено! \nТы прошёл весь курс\n Не останавливайся и продолжай развивать свои навыки программиста")
                .setPositiveButton("Круто", null)
                .create();
    }
}

