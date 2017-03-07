package com.example.karanbajaj.mylibrary;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by karan.bajaj on 3/6/2017.
 */

public class MyLibrary {
    private final Activity activity;

    public MyLibrary(Activity activity) {
        this.activity = activity;
    }

    public void callMyLibrary() {
        Toast.makeText(activity, "Library called...", Toast.LENGTH_SHORT).show();
    }
}
