package com.example.elijahsmith.guessinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private Button playButtonButton;
    private TextView correctNumber;
    private TextView resultsTextView;
    private ImageView resultImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        playButtonButton = findViewById(R.id.restart_button);
        correctNumber = findViewById(R.id.number_textview);
        resultsTextView = findViewById(R.id.results_textView);
        resultImageView = findViewById(R.id.winner_imageView);

        setListener();
    }

    private void setListener() {
        playButtonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
