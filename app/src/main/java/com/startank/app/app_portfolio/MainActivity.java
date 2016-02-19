package com.startank.app.app_portfolio;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
// Followed the tutorials on udacity for Android Development.
// Used Reference provided at http://developer.android.com/reference/android/view/View.html

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Declared global variables.
        Button mSpotifyStreamer = (Button) findViewById(R.id.streamer_app);
        Button mFootball = (Button) findViewById(R.id.football_app);
        Button mLibrary = (Button) findViewById(R.id.score_app);
        Button mBuildIt = (Button) findViewById(R.id.build_app);
        Button mReader = (Button) findViewById(R.id.reader_app);
        Button mCapstoneProject = (Button) findViewById(R.id.capstone_app);

        // Setup OnClick for the buttons in layout.
        mSpotifyStreamer.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast streamer = Toast.makeText(MainActivity.this, "Clicking this button launches the STREAMER App", Toast.LENGTH_SHORT);
                streamer.show();
            }

        });

        mFootball.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast football = Toast.makeText(MainActivity.this, "Clicking this button launches the Football Score App", Toast.LENGTH_SHORT);
                football.show();
            }
        });
        mLibrary.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast library = Toast.makeText(MainActivity.this, "Clicking this button launches the Library App", Toast.LENGTH_SHORT);
                library.show();
            }
        });
        mBuildIt.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast build = Toast.makeText(MainActivity.this, "Clicking this button launches the Build It Bigger App", Toast.LENGTH_SHORT);
                build.show();
            }
        });
        mReader.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast reader = Toast.makeText(MainActivity.this, "Clicking this button launches the XYZ Reader App", Toast.LENGTH_SHORT);
                reader.show();
            }
        });
        mCapstoneProject.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast capstone = Toast.makeText(MainActivity.this, "Clicking this button launches the Score App", Toast.LENGTH_SHORT);
                capstone.show();
            }
        });


    }



}

