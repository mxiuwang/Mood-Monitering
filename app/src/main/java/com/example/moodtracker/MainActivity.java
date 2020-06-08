package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickRecordAnActivity(View view) { // button object is of type View

        EditText hoursSleptEntryHomepage = (EditText) findViewById(R.id.hoursSleptEntryHomepage); // findViewByID returns a view, which we cast to EditText object

        Log.i("Info", "RecordAnAcitivity button pressed"); // optiona: displays action in logs
        Log.i("Values", hoursSleptEntryHomepage.getText().toString()); // displays text entered in logs
    }

    @Override // overrides the onCreate method in the parent class (AppCompatActivity)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // super refers to onCreate method that exists in AppCompatActivity
        setContentView(R.layout.activity_main); // runs activity_main.xml interface
    }
}