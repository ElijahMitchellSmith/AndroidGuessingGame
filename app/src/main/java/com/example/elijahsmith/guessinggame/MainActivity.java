package com.example.elijahsmith.guessinggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button startButton;
    private TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.start_button);
        description = findViewById(R.id.description_textview);

        startListener();


    }


    private void startGame() {
        Intent playGame = new Intent(this, GameActivity.class);
     //   playGame.putExtra("SETWHICHVIEW",3);
        startActivity(playGame);
        finish();
    }@Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Help Me!", Toast.LENGTH_SHORT).show();
    }@Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Please Don't Leave!", Toast.LENGTH_SHORT).show();
    }
    private void startListener() {
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGame();
            }
})

    ;}
}