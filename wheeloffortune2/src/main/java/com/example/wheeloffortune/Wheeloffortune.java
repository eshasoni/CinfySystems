package com.example.wheeloffortune;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Wheeloffortune extends AppCompatActivity {
    Button spin;
    ImageView wheel;
    TextView text;
    Random r;
    int degree = 0, degree_old = 0;
    private static final float Factor = 4.86f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_wheeloffortune );
        spin = (Button) findViewById( R.id.spin );
        wheel = (ImageView) findViewById( R.id.wheel );
        text=(TextView)findViewById( R.id.text );
        r = new Random();
        spin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                degree_old = degree % 360;
                degree = r.nextInt( 3600 ) + 720;
                RotateAnimation rotate = new RotateAnimation( degree_old, degree ,RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration( 3000 );
                rotate.setFillAfter( true );
                rotate.setInterpolator( new DecelerateInterpolator() );
                rotate.setAnimationListener( new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                 text.setText("");

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        text.setText(currentNumber( 360-(degree%360) ));



                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                } );
                wheel.startAnimation( rotate );


            }
        } );

    }

    private String currentNumber(int degree) {
        String text = "";

        if(degree>= (Factor * 1) && degree < (Factor*3)){
            text="3 red";
        }

        if(degree>= (Factor * 3) && degree < (Factor*5)){
            text="5 black";
        }

        if(degree>= (Factor * 5) && degree < (Factor*7)){
            text="9 red";
        }

        if(degree>= (Factor * 7) && degree < (Factor*9)){
            text="4 black";
        }

        if(degree>= (Factor * 9) && degree < (Factor*11)){
            text="6 red";
        }

        if(degree>= (Factor * 11) && degree < (Factor*13)){
            text="10 black";
        }

        if(degree>= (Factor * 13) && degree < (Factor*15)){
            text="5 red";
        }

        if(degree>= (Factor * 15) && degree < (Factor*17)){
            text="7 black";
        }

        if(degree>= (Factor * 17) && degree < (Factor*19)){
            text="4 red";
        }

        if(degree>= (Factor * 19) && degree < (Factor*21)){
            text="6 black";
        }

        if(degree>= (Factor * 21) && degree < (Factor*23)){
            text="7 red";
        }

        if(degree>= (Factor * 23) && degree < (Factor*25)){
            text="13 black";
        }


        if(degree>= (Factor * 25) && degree < (Factor*27)){
            text="6 red";
        }


        if(degree>= (Factor * 27) && degree < (Factor*29)){
            text="11 black";
        }


        if(degree>= (Factor * 29) && degree < (Factor*31)){
            text="3 red";
        }


        if(degree>= (Factor * 31) && degree < (Factor*33)){
            text="8 black";
        }

        if(degree>= (Factor * 33) && degree < (Factor*35)){
            text="3 red";
        }

        if(degree>= (Factor * 35) && degree < (Factor*37)){
            text="10 black";
        }


        if(degree>= (Factor * 37) && degree < (Factor*39)){
            text="5 red";
        }

        if(degree>= (Factor * 39) && degree < (Factor*41)){
            text="4 black";
        }


        if(degree>= (Factor * 41) && degree < (Factor*43)){
            text="6 red";
        }


        if(degree>= (Factor * 43) && degree < (Factor*45)){
            text="3 black";
        }


        if(degree>= (Factor * 45) && degree < (Factor*47)){
            text="11 red";
        }


        if(degree>= (Factor * 47) && degree < (Factor*49)){
            text="10 black";
        }


        if(degree>= (Factor * 49) && degree < (Factor*51)){
            text="4 red";
        }

        if(degree>= (Factor * 51) && degree < (Factor*53)){
            text="3 black";
        }


        if(degree>= (Factor * 53) && degree < (Factor*55)){
            text="9 red";
        }


        if(degree>= (Factor * 55) && degree < (Factor*57)){
            text="13 black";
        }


        if(degree>= (Factor * 57) && degree < (Factor*59)){
            text="8 red";
        }


        if(degree>= (Factor * 59) && degree < (Factor*61)){
            text="9 black";
        }


        if(degree>= (Factor * 61) && degree < (Factor*63)){
            text="7 red";
        }


        if(degree>= (Factor * 63) && degree < (Factor*65)){
            text="8 black";
        }


        if(degree>= (Factor * 65) && degree < (Factor*67)){
            text="12 red";
        }


        if(degree>= (Factor * 67) && degree < (Factor*69)){
            text="5 black";
        }


        if(degree>= (Factor * 69) && degree < (Factor*71)){
            text="3 red";
        }


        if(degree>= (Factor * 71) && degree < (Factor*73)){
            text="6 black";
        }

        if(degree>= (Factor * 73) && degree < 360 || (degree >= 0 && degree <(Factor * 1))){
            text="8";
        }

            return text;

    }}

