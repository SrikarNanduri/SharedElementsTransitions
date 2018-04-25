package com.example.android.activitieswithmultipleimages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ImageView mkakashi = findViewById(R.id.image);
        ImageView mgoku = findViewById(R.id.image2);

        TextView kakashi = findViewById(R.id.textView);
        TextView goku = findViewById(R.id.textView2);
        kakashi.setText("\"The next generation will always surpass the previous one. It’s one of the never-ending cycles in life.\" — Kakashi Hatake, Naruto ");
        goku.setText("\"Power comes in response to a need, not a desire. You have to create that need.\" — Son Goku, Dragon Ball");

        mkakashi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(DetailsActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(DetailsActivity.this, imageView, ViewCompat.getTransitionName(imageView));
                startActivity(intent, options.toBundle());*/
                DetailsActivity.this.onBackPressed();

            }
        });

        mgoku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(DetailsActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation(DetailsActivity.this, imageView, ViewCompat.getTransitionName(imageView));
                startActivity(intent, options.toBundle());*/
                DetailsActivity.this.onBackPressed();

            }
        });


    }
}