package com.example.arshinskyandroid131;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private CharSequence text;
    public static final String TAG = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= findViewById(R.id.textview);

        if(savedInstanceState!=null){
            text = savedInstanceState.getCharSequence("text");
            textView.append("\n"+"bundle not null");
            textView.append(text);
        }
        else{
            textView.append("\n"+"bundle is null");
        }
        Log.d(TAG, "onCreate()");
        textView.append("\n" + "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart()");
        textView.append("\n" + "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume()");
        textView.append("\n" + "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause()");
        textView.append("\n" + "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop()");
        textView.append("\n" + "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
        textView.append("\n" + "onDestroy()");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart()");
        textView.append("\n" + "onRestart()");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(TAG, "onPostCreate()");
        textView.append("\n" + "onPostCreate()");

    }
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, "onPostResume()");
        textView.append("\n" + "onPostResume()");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d(TAG, "onKeyDown()");
        textView.append("\n" + "onKeyDown()");
        return super.onKeyDown(keyCode, event);
        //return true; // прекращает всплытие события - не вызывается onBackPressed
    }


    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d(TAG, "onKeyLongPress()");
        textView.append("\n" + "onKeyLongPress()");
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        Log.d(TAG, "onBackPressed()");
        textView.append("\n" + "onBackPressed()");
        super.onBackPressed();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d(TAG, "onSaveInstanceState()");
        textView.append("\n" + "onSaveInstanceState()");
        text = textView.getText();
        outState.putCharSequence("text",text);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState()");
        textView.append("\n" + "onRestoreInstanceState()");
        super.onRestoreInstanceState(savedInstanceState);
    }
}
