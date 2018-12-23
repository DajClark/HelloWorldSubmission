package com.example.helloworldsubmission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // Overrides the activities onCreate method responsible for creating the
    // activity upon launch to provide custom functionality
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Calls the Activity super class code to run alongside custom code
        super.onCreate(savedInstanceState);

        //Sets the view using the xml data contained within the layout folder
        setContentView(R.layout.activity_main);
    }
}
