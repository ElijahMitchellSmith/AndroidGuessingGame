package com.example.elijahsmith.guessinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    private TextView guessHint;
    private Button guessButton;
    private EditText guess;
    private int generatedNumber;
    private int numberOfGuesses = 0;
    private final int MAX_GUESS_COUNT = 4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        guessButton = findViewById(R.id.submit_guess_button);
        guessHint = findViewById(R.id.clue_textview);
        guess = findViewById(R.id.guess_edittext);

        setListener();
    }

    @Override
    protected void onStart() {
        super.onStart();
        generatedNumber = (int)Math.ceil(Math.random()*100);
    }

    @Override
    public void onBackPressed() {

    }
    private void setListener() {
        guessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int userGuess = Integer.parseInt(guess.getText().toString());
                if(userGuess > 100) {
                    guessHint.setText("Enter a number between 1-100");
                    guessHint.setVisibility(View.VISIBLE);
                    guess.setText("");
                } else {
                    checkGuess(userGuess);
                }

            }
        });
    }
    private void checkGuess(int userGuess) {

        if (userGuess > generatedNumber) {
            guessHint.setText("Lower");
            guessHint.setVisibility(View.VISIBLE);
            guess.setText("");
            numberOfGuesses++;
        } else if (userGuess < generatedNumber) {
            guessHint.setText("Higher");
            guessHint.setVisibility(View.VISIBLE);
            guess.setText("");
            numberOfGuesses++;
        } else if (numberOfGuesses == MAX_GUESS_COUNT) {
            //TODO- create intent to go to winning activity - handle out of chances
            guessHint.setText("You're out of guesses, the correct number was:" + generatedNumber);
        } else if (userGuess == generatedNumber) {
            //TODO - Create Intent to go to winning activity- handle winning
        }

    }

}
