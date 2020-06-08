package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MakeEntry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_entry);
    }

    public void clickSubmit (View view) {
        EditText hoursSleptEntry = (EditText) findViewById(R.id.hoursSleptEntry); // findViewByID returns a view, which we cast to EditText object
        Log.i("Values", hoursSleptEntry.getText().toString()); // displays text entered in logs

    }
}