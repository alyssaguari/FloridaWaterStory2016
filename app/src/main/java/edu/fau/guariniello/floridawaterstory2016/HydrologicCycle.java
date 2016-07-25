package edu.fau.guariniello.floridawaterstory2016;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class HydrologicCycle extends AppCompatActivity implements View.OnClickListener {


    private static final String TAG = "FloridaWaterStory";

    private SharedPreferences.Editor edit;
    Context context;
    private SharedPreferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hydrologic_cycle);
        //-------
        Button menu_hydrologic_cycleButton = (Button) findViewById(R.id.menu_hydrologic_cycle);
        menu_hydrologic_cycleButton.setOnClickListener(this);
        //-------
        Button game_hydrologic_cycleButton = (Button) findViewById(R.id.game_hydrologic_cycle);
        game_hydrologic_cycleButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //-------
            case R.id.menu_hydrologic_cycle:
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                Log.d(TAG, "clicked on hydrologic_cycle menu button");
                break;
            //--------
            case R.id.game_hydrologic_cycle:
                i = new Intent(this, Game.class);
                startActivity(i);
                Log.d(TAG, "clicked on hydrologic_cycle game button");
                break;
            //--------

        }
    }
}
