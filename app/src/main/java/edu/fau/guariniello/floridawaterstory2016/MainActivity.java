package edu.fau.guariniello.floridawaterstory2016;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "FloridaWaterStory";

    private SharedPreferences.Editor edit;
    Context context;
    private SharedPreferences preferences;

    ImageView evergladesButton;
    ImageView aquifersButton;
    ImageView okeechobeeButton;
    ImageView hydrologicCycleButton;
    ImageView kissimmeeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = PreferenceManager.getDefaultSharedPreferences(getApplication());
        //-----
        evergladesButton = (ImageView) findViewById(R.id.everglades);
        evergladesButton.setOnClickListener(this);
        //-----
        aquifersButton = (ImageView) findViewById(R.id.aquifers);
        aquifersButton.setOnClickListener(this);
        //-----
        okeechobeeButton = (ImageView) findViewById(R.id.okeechobee);
        okeechobeeButton.setOnClickListener(this);
        //-----
        hydrologicCycleButton = (ImageView) findViewById(R.id.hydrologic_cycle);
        hydrologicCycleButton.setOnClickListener(this);
        //-----
        kissimmeeButton = (ImageView) findViewById(R.id.kissimmee);
        kissimmeeButton.setOnClickListener(this);
        //-----
        //change icons color

    }

    @Override
    protected void onResume() {
        super.onResume();

        boolean everglades = preferences.getBoolean("change_everglades",false);
        boolean aquifers = preferences.getBoolean("change_aquifers",false);
        boolean hydrologic_cycle = preferences.getBoolean("change_hydrologic_cycle",false);
        boolean kissimmee = preferences.getBoolean("change_kissimmee",false);
        boolean okeechobee = preferences.getBoolean("change_okeechobee",false);


        Log.d(TAG, "everglades:"+everglades);
        Log.d(TAG, "aquifers:"+aquifers);
        Log.d(TAG, "hydrologic_cycle:"+hydrologic_cycle);
        Log.d(TAG, "kissimmee:"+kissimmee);
        Log.d(TAG, "okeechobee:"+okeechobee);

        if(everglades){
            evergladesButton.setImageResource(R.drawable.green_button);
        }
        if(aquifers){
            aquifersButton.setImageResource(R.drawable.green_button);
        }
        if(hydrologic_cycle){
            hydrologicCycleButton.setImageResource(R.drawable.green_button);
        }
        if(kissimmee){
            kissimmeeButton.setImageResource(R.drawable.green_button);
        }
        if(okeechobee){
            okeechobeeButton.setImageResource(R.drawable.green_button);
        }



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //-------
            case R.id.everglades:
                Intent i = new Intent(this, Everglades.class);
                startActivity(i);
                Log.d(TAG, "clicked on everglades button");
                edit = preferences.edit();
                edit.putBoolean("change_everglades", true);
                edit.apply();
                break;
            //--------
            case R.id.aquifers:
                i = new Intent(this, Aquifers.class);
                startActivity(i);
                Log.d(TAG, "clicked on aquifers button");
                edit = preferences.edit();
                edit.putBoolean("change_aquifers", true);
                edit.apply();
                break;
            //--------
            case R.id.okeechobee:
                i = new Intent(this, Okeechobee.class);
                startActivity(i);
                Log.d(TAG, "clicked on okeechobee button");
                edit = preferences.edit();
                edit.putBoolean("change_okeechobee", true);
                edit.apply();
                break;
            //--------
            case R.id.hydrologic_cycle:
                i = new Intent(this, HydrologicCycle.class);
                //save pref
                startActivity(i);
                Log.d(TAG, "clicked on hydrologic_cycle button");
                edit = preferences.edit();
                edit.putBoolean("change_hydrologic_cycle", true);
                edit.apply();
                break;
            //--------
            case R.id.kissimmee:
                i = new Intent(this, Kissimmee.class);
                startActivity(i);
                Log.d(TAG, "clicked on kissimmee button");
                edit = preferences.edit();
                edit.putBoolean("change_kissimmee", true);
                edit.apply();
                break;
            //--------

        }
    }
}
