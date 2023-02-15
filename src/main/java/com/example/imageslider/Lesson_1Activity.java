package com.example.imageslider;

import static android.view.View.INVISIBLE;
import static android.view.View.ROTATION;
import static android.view.View.VISIBLE;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.media2.widget.MediaControlView;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.VideoView;

public class Lesson_1Activity extends AppCompatActivity implements View.OnClickListener {

    Button btn_1;
    EditText Ed_t;
    ImageView Imv_1;
    ImageView Imv_2;
    ImageView Imv_3;
    ImageButton im_btn_1;
    ImageView Imv_4;
    ScrollView Sc_V_1;
    TextView tx_v_1;
    TextView tx_v_2;
    ScrollView Sc_V_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1);


        btn_1 = findViewById(R.id.btn_8);
        btn_1.setOnClickListener(this);
        Imv_1 = findViewById(R.id.imageView2);
        Imv_2 = findViewById(R.id.imageView3);
        Ed_t = findViewById(R.id.editTextTextMultiLine);
        im_btn_1 = findViewById(R.id.im_btn);
        Imv_3 = findViewById(R.id.imageView10);
        Imv_4 = findViewById(R.id.imageView21);
        Sc_V_1 = findViewById(R.id.scrollView4);
        Sc_V_2 = findViewById(R.id.scrollView5);
        tx_v_1 = findViewById(R.id.textView3);
        tx_v_2 = findViewById(R.id.textView4);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_8:

                if (Ed_t.getText().toString().equals("print(\"Hello world!\")")) {
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
            case R.id.im_btn:
                Intent intent = new Intent(this, VideoPlayer_1.class);
                startActivity(intent);
                break;
            default:
                break;
        }

    }

}
