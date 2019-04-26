package com.example.jmahajan.driving;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Stage5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage5);

        Player p = (Player)getIntent().getSerializableExtra("Player");
        TextView money = findViewById(R.id.money_view);
        money.setText("Money Left: $" + p.getMoney());

        final TypeWriter tw = findViewById(R.id.tw);
        tw.setText("");
        tw.setCharacterDelay(60);
        tw.animateText("Bowling it is! You and your friends go to the nearest bowling area. " +
                "Your group bowls for a while and decide to…");
    }

    public void onStage6Aclick(View view)
    {
        Player p = (Player)getIntent().getSerializableExtra("Player");
        Intent i = new Intent(this, Stage6A.class);
        i.putExtra("Player", p);
        startActivity(i);
    }

    public void onStage1click(View view)
    {
        Player p = (Player)getIntent().getSerializableExtra("Player");
        p.money -= 10;
        Intent i = new Intent(this, Stage1.class);
        i.putExtra("Player", p);
        startActivity(i);
    }
}
