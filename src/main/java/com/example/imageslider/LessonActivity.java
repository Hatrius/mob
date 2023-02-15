package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btn_4;
    Button btn_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        btn_1 = findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this);
        btn_2 = findViewById(R.id.btn_2);
        btn_2.setOnClickListener(this);
        btn_3 = findViewById(R.id.btn_3);
        btn_3.setOnClickListener(this);
        btn_4 = findViewById(R.id.btn_4);
        btn_4.setOnClickListener(this);
        btn_5 = findViewById(R.id.btn_5);
        btn_5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_1:
                Intent intent = new Intent(this, Lesson_1Activity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.btn_2:
                Intent intent = new Intent(this, Lesson_2Activity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.btn_3:
                Intent intent = new Intent(this, Lesson_3Activity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
        switch (view.getId()) {
            case R.id.btn_4:
                Intent intent = new Intent(this, Lesson_4Activity.class);
                startActivity(intent);
                break;
            default:
                break;
        }switch (view.getId()) {
            case R.id.btn_5:
                Intent intent = new Intent(this, Lesson_5Activity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}