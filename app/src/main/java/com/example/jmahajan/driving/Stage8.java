package com.example.jmahajan.driving;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Stage8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage8);

        Player p = (Player)getIntent().getSerializableExtra("Player");
        TextView money = findViewById(R.id.money_view);
        money.setText("Money Left: $" + p.getMoney());

        final TypeWriter tw = findViewById(R.id.tw);
        tw.setText("");
        tw.setCharacterDelay(60);
        tw.animateText("You refuse the alcohol but decide to stay in the party for another 3 hours socializing with friends. " +
                "You decide to...");

    }

    public void onStage6Aclick(View view)
    {
        Player p = (Player)getIntent().getSerializableExtra("Player");
        Intent i = new Intent(this, Stage6A.class);
        i.putExtra("Player", p);
        startActivity(i);
    }
}
