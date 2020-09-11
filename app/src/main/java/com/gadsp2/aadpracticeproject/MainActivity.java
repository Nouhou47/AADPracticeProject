package com.gadsp2.aadpracticeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    // Helper method to launch leaderBoard activity
    public void openLeaderBordActivity(View view) {
        System.out.println("Starting method that opens leader board activity");
        Intent intent = new Intent(this, LeaderBoard.class);
        startActivity(intent);
        System.out.println("Method that opens leader board activity finished!!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
