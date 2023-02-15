package com.example.imageslider;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class Lesson_3Activity extends AppCompatActivity implements View.OnClickListener {

    Button btn_2;
    EditText Ed_t;
    ImageView Imv_1;
    ImageView Imv_2;
    ImageView Imv_3;
    ImageButton im_btn_1;
    ImageView Imv_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3);

        btn_2 = findViewById(R.id.btn_11);
        Imv_1 = findViewById(R.id.imageView4);
        Imv_2 = findViewById(R.id.imageView5);
        Ed_t = findViewById(R.id.editTextTextMultiLine2);
        im_btn_1 = findViewById(R.id.im_btn2);
        Imv_3 = findViewById(R.id.imageView8);
        Imv_4 = findViewById(R.id.imageView19);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_11:

                if (Ed_t.getText().toString().equals("print(\"Dragon\" + \"stone\")")) {
                    CustomDialogFragment2 dialog = new CustomDialogFragment2();
                    dialog.show(getSupportFragmentManager(), "custom");
                    Imv_1.setVisibility(VISIBLE);
                    Imv_2.setVisibility(INVISIBLE);
                    Imv_3.setVisibility(INVISIBLE);
                } else {
                    CustomDialogFragment dialog = new CustomDialogFragment();
                    dialog.show(getSupportFragmentManager(), "custom");
                    Imv_1.setVisibility(INVISIBLE);
                    Imv_2.setVisibility(VISIBLE);
                    Imv_3.setVisibility(INVISIBLE);
                }
        }
        switch (view.getId()) {
            case R.id.im_btn2:
                Intent intent = new Intent(this, VideoPlayer_3.class);
                startActivity(intent);
                break;
            default:
                break;
        }

        }
    }
