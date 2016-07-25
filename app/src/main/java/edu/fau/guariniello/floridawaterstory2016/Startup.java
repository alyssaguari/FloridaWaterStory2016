package edu.fau.guariniello.floridawaterstory2016;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Startup extends AppCompatActivity implements View.OnClickListener {

    private SharedPreferences preferences;

    private SharedPreferences.Editor edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        preferences = PreferenceManager.getDefaultSharedPreferences(getApplication());



        Button launchButton;
        launchButton = (Button) findViewById(R.id.launch);
        launchButton.setOnClickListener(this);

        //clean prefs
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //-------
            case R.id.launch:

                edit = preferences.edit();
                edit.clear();
                edit.apply();

                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;

        }
    }
}
