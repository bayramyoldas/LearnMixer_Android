package com.bayram.yoldas.learnmixer_android;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.media.session.MediaController;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.Random;


public class CourseContentActivity extends ActionBarActivity {
    private ImageView appImageView;
    private Drawable drawable;
/*    private Random random;
    TextView textView;
    TextView welcome;
    private VideoView view;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_content);

        appImageView = (ImageView) findViewById(R.id.imageView);
        drawable =  getResources().getDrawable(R.drawable.math);
        appImageView.setImageDrawable(drawable);

        String button_id = "N/A";
        String course_content = "";
        Bundle extras = getIntent().getExtras();
        if(extras!=null)
        {
            button_id = extras.getString("button_id");
        }

        Intent intent = getIntent();
        TextView textView1 = new TextView(this);
        textView1.setTextSize(18);

        textView1.setTextColor(Color.parseColor("#951313"));
        if (button_id == "btn_art")
        {
            course_content = "Welcome to Art course, my dear students. Please look at the content below. You will find a good image about historical Egypt hieroglyph ";
        }
        else if (button_id == "btn_eng")
        {
            course_content = "Welcome to Art course, my dear students. Today, we will learn few new words";
        }
        else if (button_id == "btn_math")
        {
            course_content = "Welcome to Art course, students. 2 + 2 = 4, memorize this.";
        }

        textView1.setText(course_content);
        setContentView(textView1);

/*        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        textView = new TextView(this);
        welcome = new TextView(this);

        textView.setTextSize(22);
        textView.setText(message);
        setContentView(textView);*/



/*         final VideoView videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoPath("https://www.youtube.com/watch?v=MMC0iaz6bac");
       // MediaController mediaController = new MediaController(getActivity().getApplicationContext());
        MediaController mediaController = new MediaController(this);
         mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.setOnPreparedListener(new
                                                MediaPlayer.OnPreparedListener() {
                                                    @Override
                                                    public void onPrepared(MediaPlayer mp) {
                                                        Log.i(TAG, "Duration = " +
                                                                videoView.getDuration());
                                                    }
                                                });
        videoView.start(); */

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_course_content, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
