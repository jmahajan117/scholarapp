package com.example.jmahajan.driving;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Player player = new Player(20);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("What if?");
    }

    public void onBeginClick(View view)
    {
        AlertDialog.Builder a = new AlertDialog.Builder(MainActivity.this);
        a.setCancelable(false);
        a.setTitle("Warning");
        a.setMessage("These events and scenarios you are about to read are pure fiction. " +
                "Any related events are not connected to this app or its developer");
        a.setNeutralButton("Continue", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                Intent intent = new Intent(MainActivity.this, Intro.class);
                intent.putExtra("Player", player);
                startActivity(intent);

            }
        });
        a.show();
    }
}
