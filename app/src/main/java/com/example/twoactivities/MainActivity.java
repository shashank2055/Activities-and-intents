package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT =
            "com.example.twoactivities.extra.TEXT";
    private String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendTextOne(View view) {
        string = getString(R.string.article_text_one);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_TEXT, string);
        startActivity(intent);
    }

    public void sendTextTwo(View view) {
        string = getString(R.string.article_text_two);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_TEXT, string);
        startActivity(intent);
    }

    public void sendTextThree(View view) {
        string = getString(R.string.article_text_three);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_TEXT, string);
        startActivity(intent);
    }
}