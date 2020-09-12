package com.gadsp2.aadpracticeproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ProjectSubmit extends AppCompatActivity {


    /*public void submitProject (View view) {
        new SweetAlertDialog
    }*/
    public void submitProject (View view) {
        new AlertDialog.Builder(this)
                .setTitle("Are you sure?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(ProjectSubmit.this, "The project will be submitted!", Toast.LENGTH_SHORT).show();

                        new AlertDialog.Builder(ProjectSubmit.this)
                                .setIcon(R.drawable.ic_check)
                                .setTitle("Submission Successfull")
                                .show();

                    }
                })
                .setNegativeButton("No!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(ProjectSubmit.this, "The project won't be submitted!", Toast.LENGTH_SHORT).show();

                        new AlertDialog.Builder(ProjectSubmit.this)
                                .setIcon(R.drawable.ic_report)
                                .setTitle("Submission not Successfull")
                                .show();

                    }
                })
                .show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_submit);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportParentActivityIntent().setClass(this, LeaderBoard.class);

    }
}
