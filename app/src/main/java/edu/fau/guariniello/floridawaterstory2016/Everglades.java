package edu.fau.guariniello.floridawaterstory2016;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Everglades extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "FloridaWaterStory";

    private SharedPreferences.Editor edit;
    Context context;
    private SharedPreferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.everglades);
        //-------
        Button menu_evergladesButton = (Button) findViewById(R.id.menu_everglades);
        menu_evergladesButton.setOnClickListener(this);
        //-------
        Button game_evergladesButton = (Button) findViewById(R.id.game_everglades);
        game_evergladesButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //-------
            case R.id.menu_everglades:
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                Log.d(TAG, "clicked on everglades menu button");
                break;
            //--------
            case R.id.game_everglades:
                i = new Intent(this, Game.class);
                startActivity(i);
                Log.d(TAG, "clicked on everglades game button");
                break;
            //--------

        }
    }
}
