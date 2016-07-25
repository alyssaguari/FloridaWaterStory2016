package edu.fau.guariniello.floridawaterstory2016;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Aquifers extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "FloridaWaterStory";

    private SharedPreferences.Editor edit;
    Context context;
    private SharedPreferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aquifers);
        //-------
        Button menu_aquifersButton = (Button) findViewById(R.id.menu_aquifers);
        menu_aquifersButton.setOnClickListener(this);
        //-------
        Button game_aquifersButton = (Button) findViewById(R.id.game_aquifers);
        game_aquifersButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //-------
            case R.id.menu_aquifers:
                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                Log.d(TAG, "clicked on aquifers menu button");
                break;
            //--------
            case R.id.game_aquifers:
                i = new Intent(this, Game.class);
                startActivity(i);
                Log.d(TAG, "clicked on aquifers game button");
                break;
            //--------

        }
    }
}


