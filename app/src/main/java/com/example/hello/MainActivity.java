package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int tmp = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView ta = findViewById(R.id.t_a);
        final TextView tc = findViewById(R.id.t_b);
        final Button bta = findViewById(R.id.bt_a);
        final ImageView imagea = findViewById(R.id.image_a);
        final RadioButton raa = findViewById(R.id.ra_a);
        final RadioButton rab = findViewById(R.id.ra_b);
        final RadioButton rac = findViewById(R.id.ra_c);
        final RadioButton rad = findViewById(R.id.ra_c);
        raa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               imagea.setImageDrawable(getResources().getDrawable(R.drawable.b));

            }
        });

        rad.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View view) {

                                       imagea.setImageDrawable(getResources().getDrawable(R.drawable.b));
                                       imagea.setImageDrawable(getResources().getDrawable(R.drawable.c));
                                       imagea.setImageDrawable(getResources().getDrawable(R.drawable.b));
                                   }
                               }
        );

        rab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imagea.setImageDrawable(getResources().getDrawable(R.drawable.c));
            }
        });

        rac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imagea.setImageDrawable(getResources().getDrawable(R.drawable.a));
            }
        });


bta.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        if(tmp == 0){

            imagea.setImageDrawable(getResources().getDrawable(R.drawable.a));

            tmp = 1;
            String tag;
            String msg;
           // Log.e(tag:"cheers", msg:"b");
        }
        else if(tmp == 1){
            imagea.setImageDrawable(getResources().getDrawable(R.drawable.b));
            tmp = 2;
            //Log.e(tag:"cheers", msg:"c");
        }else if(tmp == 2){
            imagea.setImageDrawable(getResources().getDrawable(R.drawable.c));
            tmp = 0;
           // Log.e(tag:"cheers", msg:"a");
        }
    }
});

    }
}
