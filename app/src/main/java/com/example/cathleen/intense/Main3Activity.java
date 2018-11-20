package com.example.cathleen.intense;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent i = new Intent(this, CustomService.class);
        this.startService(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("start", "onStart has executed...");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("resume", "onResume has executed...");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("pause", "onPause has executed...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("stop", "onStop has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("restart", "onRestart has executed...");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("destroy", "onDestroy has executed...");

    }

    public void showMessage(View v){
        Toast.makeText( this, "previous page", Toast.LENGTH_LONG).show();

    }

    public void showMess(View v) {
        Toast.makeText( this, "next page", Toast.LENGTH_LONG).show();
    }

    public void process (View v){
        Intent i=null, chooser=null;
        if (v.getId() == R.id.imageView4){
            i = new Intent(this, Main4Activity.class);
            startActivity(i);
        } else if (v.getId() == R.id.imageView6){
            i = new Intent(this, SafetyTips.class);
            startActivity(i);
        }   else if (v.getId() == R.id.imageView7){
            i = new Intent(this, Hotlines.class);
            startActivity(i);
        }else if (v.getId() == R.id.imageView8){
            i = new Intent(this, Main3Activity.class);
            startActivity(i);
        }

    }
}
