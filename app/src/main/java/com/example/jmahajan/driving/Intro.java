package com.example.jmahajan.driving;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Intro extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        setTitle("Introduction");

        Player p = (Player)getIntent().getSerializableExtra("Player");
        TextView money = findViewById(R.id.money_view);
        money.setText("Money Left: $" + p.getMoney());

        final TypeWriter tw = findViewById(R.id.tw);
        tw.setText("");
        tw.setCharacterDelay(60);
        tw.animateText("Congratulations! " +
                "Your school recently won the state championship in several sports. " +
                "Everyone at the school plans to celebrate by partying or dining out. " +
                "You eventually get invited to a VIP party to celebrate. " +
                "With your spare cash of $20, you decide to...");



    }

    public void onStage1click(View view)
    {
        Player p = (Player)getIntent().getSerializableExtra("Player");
        p.money -= 10;
        Intent i = new Intent(this, Stage1.class);
        i.putExtra("Player", p);
        startActivity(i);
    }

    public void onStage2click(View view)
    {
        Player p = (Player)getIntent().getSerializableExtra("Player");
        Intent i = new Intent(this, Stage2.class);
        i.putExtra("Player", p);
        startActivity(i);
    }

}
