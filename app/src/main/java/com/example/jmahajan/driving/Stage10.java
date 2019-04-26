package com.example.jmahajan.driving;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Stage10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage10);

        Player p = (Player)getIntent().getSerializableExtra("Player");
        TextView money = findViewById(R.id.money_view);
        money.setText("Money Left: $" + p.getMoney());

        final TypeWriter tw = findViewById(R.id.tw);
        tw.setText("");
        tw.setCharacterDelay(60);
        tw.animateText("You take the bus home and it drops you off nearby your home. " +
                "You return home safely. " +
                "You later hear that the police raided the party you planned to attend " +
                "and that everyone involved with underage drinking was severely punished. " +
                "You are relieved that you left.");

    }

    public void onConclusion(View view)
    {
        Intent i = new Intent(this, Conclusion.class);
        startActivity(i);
    }
}
