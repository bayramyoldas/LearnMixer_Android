package com.bayram.yoldas.learnmixer_android;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    public static String art_id;
    public static String eng_id;
    public static String math_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_art = (Button) findViewById(R.id.btn_art);
        Button btn_eng = (Button) findViewById(R.id.btn_eng);
        Button btn_math = (Button) findViewById(R.id.btn_math);
        btn_art.setOnClickListener(this);
        btn_eng.setOnClickListener(this);
        btn_math.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


    @Override
    public void onClick(View v){

        Intent i= new Intent(this,CourseContentActivity.class);
        switch(v.getId()) //get the id which is an int
        {
            case R.id.btn_art : //if its button1 that is clicked
                i.putExtra("course_content", "Welcome to Art course, my dear students. Please look at the content below. You will find a good image about historical Egypt hieroglyp");
                break;
            case R.id.btn_eng :
                i.putExtra("course_content", "Welcome to English course, my dear students. Today, we will learn few new words");
                break;
            case R.id.btn_math :
                i.putExtra("course_content", "Welcome to Mathematics course, students. 2 + 2 = 4, memorize this.");
                break;
        }
        startActivity(i);
    }

    public void courseContent(View view)
    {
        Intent intent = new Intent(this,CourseContentActivity.class);
        startActivity(intent);

    }
}


