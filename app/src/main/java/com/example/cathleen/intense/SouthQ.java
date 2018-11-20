package com.example.cathleen.intense;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SouthQ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south_q);
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
        if (v.getId() == R.id.button){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5813, 121.0082"));
            chooser = Intent.createChooser(i, "Select application");
            startActivity(chooser);
        } else if (v.getId() == R.id.button7){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5813, 121.0082"));
            chooser = Intent.createChooser(i, "Select application");
            startActivity(chooser);
        }else if (v.getId() == R.id.button15){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5813, 121.0082"));
            chooser = Intent.createChooser(i, "Select application");
            startActivity(chooser);
        }else if (v.getId() == R.id.button17){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5813, 121.0082"));
            chooser = Intent.createChooser(i, "Select application");
            startActivity(chooser);
        }else if (v.getId() == R.id.button16) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5813, 121.0082"));
            chooser = Intent.createChooser(i, "Select application");
            startActivity(chooser);
        }else if (v.getId() == R.id.button18){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5813, 121.0082"));
            chooser = Intent.createChooser(i, "Select application");
            startActivity(chooser);
        }else if (v.getId() == R.id.button19){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5813, 121.0082"));
            chooser = Intent.createChooser(i, "Select application");
            startActivity(chooser);
        }
    }
}
