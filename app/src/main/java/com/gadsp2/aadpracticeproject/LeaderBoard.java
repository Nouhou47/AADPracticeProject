package com.gadsp2.aadpracticeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LeaderBoard extends AppCompatActivity {

    public void submitProject(View view) {
        Log.i("Info", "Submit button clicked!");
        Toast.makeText(this, "Nex submit button clicked!!!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(LeaderBoard.this, ProjectSubmit.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader_board);

        Log.i("Info", "LeaderBoard created!!!!");

    }
}
