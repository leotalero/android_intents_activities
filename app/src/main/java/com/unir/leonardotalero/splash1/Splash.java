package com.unir.leonardotalero.splash1;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import android.widget.ImageView;


/**
 * Created by leonardotalero on 11/29/15.
 */

public class Splash extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            setContentView(R.layout.splash);

        final ImageView iv=(ImageView) findViewById(R.id.imageView);
        final Animation an = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotacion);
        //final Animation an2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim);

        iv.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}
