package com.example.android.activitieswithmultipleimages;


import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.util.Pair;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView kakashi = (ImageView) findViewById(R.id.imageView);
        final ImageView goku = (ImageView) findViewById(R.id.imageView2);
      //  final ImageView ichigo = (ImageView) findViewById(R.id.imageView3);
     //   final ImageView kaneki = (ImageView) findViewById(R.id.imageView4);

        final CardView cardView = (CardView) findViewById(R.id.cardview);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View, String>(kakashi, "kakashi" );
                pairs[1] = new Pair<View, String>(goku, "goku" );
               // pairs[2] = new Pair<View, String>(ichigo, "ichigo" );
              //  pairs[3] = new Pair<View, String>(kaneki, "kaneki" );
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);
                startActivity(intent, options.toBundle());
            }
        });



/*
        kakashi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivity.this, kakashi, ViewCompat.getTransitionName(kakashi));
                startActivity(intent, options.toBundle());
            }
        });

        goku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivity.this, goku, ViewCompat.getTransitionName(goku));
                startActivity(intent, options.toBundle());
            }
        });

        ichigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivity.this, ichigo, ViewCompat.getTransitionName(ichigo));
                startActivity(intent, options.toBundle());
            }
        });

        kaneki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivity.this, kaneki, ViewCompat.getTransitionName(kaneki));
                startActivity(intent, options.toBundle());
            }
        });
*/


  /*      kakashi.setOnClickListener(this);
        goku.setOnClickListener(this);
        ichigo.setOnClickListener(this);
        kaneki.setOnClickListener(this);*/


    }

   /* @Override
    public void onClick(View v) {
        Intent intent;
        ActivityOptionsCompat options;
        switch (v.getId()){
            case R.id.imageView:
                 intent = new Intent(MainActivity.this, DetailsActivity.class);
                 options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivity.this, kakashi, ViewCompat.getTransitionName(imageView));
                startActivity(intent, options.toBundle());
                break;

            case R.id.imageView2:
                 intent = new Intent(MainActivity.this, DetailsActivity.class);
                 options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivity.this, imageView, ViewCompat.getTransitionName(imageView));
                startActivity(intent, options.toBundle());
                break;

            case R.id.imageView3:
                 intent = new Intent(MainActivity.this, DetailsActivity.class);
                 options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivity.this, imageView, ViewCompat.getTransitionName(imageView));
                startActivity(intent, options.toBundle());
                break;

            case R.id.imageView4:
                 intent = new Intent(MainActivity.this, DetailsActivity.class);
                 options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(MainActivity.this, imageView, ViewCompat.getTransitionName(imageView));
                startActivity(intent, options.toBundle());
                break;
        }

    }*/
}
