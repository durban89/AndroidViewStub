package com.gowhich.androidviewstub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    private Button button1, button2;
    private ViewStub viewStub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) this.findViewById(R.id.button1);
        button2 = (Button) this.findViewById(R.id.button2);
        viewStub = (ViewStub) this.findViewById(R.id.viewStub);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View view1 = viewStub.inflate();
                LinearLayout layout = (LinearLayout) view1;
                RatingBar bar = (RatingBar) layout.findViewById(R.id.ratingBar);
                bar.setNumStars(3);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewStub.setVisibility(View.GONE);
            }
        });

    }
}
