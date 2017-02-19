package com.clover.unityplugforblog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.unity3d.player.UnityPlayerActivity;

public class MainActivity extends UnityPlayerActivity{//AppCompatActivity implements View.OnClickListener{

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Button button_jump = (Button) findViewById(R.id.button_jump);
//        button_jump.setOnClickListener(MainActivity.this);
//    }
//
//    @Override
//    public void onClick(View v){
//        jump_view();
//    }

    public void jump_view()
    {
        Intent inent = new Intent(MainActivity.this, NextActivity.class);
        startActivity(inent);
    }

}
