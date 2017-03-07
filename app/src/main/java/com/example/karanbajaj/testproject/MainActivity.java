package com.example.karanbajaj.testproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.karanbajaj.mylibrary.MyLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyLibrary myLibrary = new MyLibrary(MainActivity.this);
        myLibrary.callMyLibrary();
    }
}
