package com.example.caliton.quizdons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgNuvem;
    private ImageView imgNuvem2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgNuvem = (ImageView) findViewById(R.id.nuvemid);
        imgNuvem2 = (ImageView) findViewById(R.id.nuvemid2);

        int ix, fx, y;

        ix = 700;
        fx = -300;
        y = -20;

        Animation desloca = new TranslateAnimation(ix, fx, y, y);
        desloca.setFillAfter(true);
        desloca.setDuration(13000);
        desloca.setRepeatCount(Animation.INFINITE);

        Animation desloca1 = new TranslateAnimation(ix, fx, 100, 100);
        desloca1.setFillAfter(true);
        desloca1.setDuration(18000);
        desloca1.setRepeatCount(Animation.INFINITE);

        imgNuvem.startAnimation(desloca);
        imgNuvem2.startAnimation(desloca1);
    }

    public void btnComecarOnclick(View v){
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }


}
