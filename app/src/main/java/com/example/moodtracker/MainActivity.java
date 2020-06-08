package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override // overrides the onCreate method in the parent class (AppCompatActivity)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // super refers to onCreate method that exists in AppCompatActivity
        setContentView(R.layout.activity_main); // runs activity_main.xml interface

    }

    public void clickRecordAnActivity(final View view) { // button object is of type View

        Intent intent = new Intent(view.getContext(), MakeEntry.class);
        startActivity(intent);

        Log.i("Info", "RecordAnAcitivity button pressed"); // optiona: displays action in logs
    }
}