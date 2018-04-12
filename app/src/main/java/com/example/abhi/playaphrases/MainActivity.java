package com.example.abhi.playaphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    MediaPlayer mplayer;

    public void speakPhrases(View view) {

        /* First Way Start :- buttonId name and audioFile name must be same */

        int id = view.getId();
        String ourId = "";

        ourId = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourId, "raw", "com.example.abhi.playaphrases");


        mplayer = MediaPlayer.create(this, resourceId);
        mplayer.start();

        /* First Way End */



        /* Second Way Start :- No need for same name */

//        switch (view.getId()) {
//            case R.id.button1:
//                mplayer = MediaPlayer.create(this,R.raw.hello);
//                break;
//            case R.id.button2:
//                mplayer = MediaPlayer.create(this,R.raw.doyouspeakenglish);
//                break;
//            case R.id.button3:
//                mplayer = MediaPlayer.create(this,R.raw.goodevening);
//                break;
//            case R.id.button4:
//                mplayer = MediaPlayer.create(this,R.raw.howareyou);
//                break;
//            case R.id.button5:
//                mplayer = MediaPlayer.create(this,R.raw.ilivein);
//                break;
//            case R.id.button6:
//                mplayer = MediaPlayer.create(this,R.raw.mynameis);
//                break;
//            case R.id.button7:
//                mplayer = MediaPlayer.create(this,R.raw.please);
//                break;
//            case R.id.button8:
//                mplayer = MediaPlayer.create(this,R.raw.welcome);
//        }
//
//        mplayer.start();

        /* Second Way End*/

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
