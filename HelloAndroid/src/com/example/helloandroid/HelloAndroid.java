package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageButton;

public class HelloAndroid extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}