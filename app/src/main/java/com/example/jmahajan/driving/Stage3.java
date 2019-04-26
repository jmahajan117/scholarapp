package com.example.jmahajan.driving;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Stage3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage3);

        Player p = (Player)getIntent().getSerializableExtra("Player");
        TextView money = findViewById(R.id.money_view);
        money.setText("Money Left: $" + p.money);

        final TypeWriter tw = findViewById(R.id.tw);
        tw.setText("");
        tw.setCharacterDelay(60);
        tw.animateText("You leave the party and thank your friend for the invitation. " +
                "You still have some time left in the day. " +
                "You decide to…");
    }

    public void onStage5click(View view)
    {
        Player p = (Player)getIntent().getSerializableExtra("Player");
        p.money -= 8;
        Intent i = new Intent(this, Stage5.class);
        i.putExtra("Player", p);
        startActivity(i);
    }

    public void onStage6Aclick(View view)
    {
        Player p = (Player)getIntent().getSerializableExtra("Player");
        Intent i = new Intent(this, Stage6A.class);
        i.putExtra("Player", p);
        startActivity(i);
    }
}
