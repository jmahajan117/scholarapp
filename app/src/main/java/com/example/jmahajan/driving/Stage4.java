package com.example.jmahajan.driving;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Stage4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage4);

        Player p = (Player)getIntent().getSerializableExtra("Player");
        TextView money = findViewById(R.id.money_view);
        money.setText("Money Left: $" + p.getMoney());

        final TypeWriter tw = findViewById(R.id.tw);
        tw.setText("");
        tw.setCharacterDelay(60);
        tw.animateText("You continue to party and eventually alcohol is served at the party. " +
                "You decide to…");
    }

    public void onStage7click(View view)
    {
        Player p = (Player)getIntent().getSerializableExtra("Player");
        Intent i = new Intent(this, Stage7.class);
        i.putExtra("Player", p);
        startActivity(i);
    }

    public void onStage8click(View view)
    {
        Player p = (Player)getIntent().getSerializableExtra("Player");
        Intent i = new Intent(this, Stage8.class);
        i.putExtra("Player", p);
        startActivity(i);
    }
}
