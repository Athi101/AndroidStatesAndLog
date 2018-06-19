package com.example.aathirad.androidstatesandlog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "StateChange";

    @Override
    protected void onCreate(Bundle savedInstanceState) { //at first it will be null
        if(savedInstanceState != null) {
            //restore
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //R is a class, contains all the resources and layouts
        Log.v(TAG,"OnCreate()");

    }
    //Ctrl+O


    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG,"OnStart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG,"OnPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG,"OnDestroy()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG,"OnStop()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG,"OnResume()");
    }



    @Override
    protected void onSaveInstanceState(Bundle outState) {//bundle is a class used to save state of an application
        Log.v(TAG,"onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) { //onCreate and onRestore both restore the data. So both are not needed
        Log.v(TAG,"onRestoreInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
    }
}
