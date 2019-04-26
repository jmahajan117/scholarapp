package com.example.jmahajan.driving;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Stage12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage12);

        Player p = (Player)getIntent().getSerializableExtra("Player");
        TextView money = findViewById(R.id.money_view);
        money.setText("Money Left: $" + p.getMoney());

        final TypeWriter tw = findViewById(R.id.tw);
        tw.setText("");
        tw.setCharacterDelay(60);
        tw.animateText("You decide to play beer-pong revealing what your                        are." +
                " Your friends record it as a joke and post it on           " +
                "A few minutes later, the police arrive and anyone involved in underage drinking is caught. " +
                "Your chances of college or working are severely damaged. " +
                "Your parents ground you for a month.");

    }

    public void onConclusion(View view)
    {
        Intent i = new Intent(this, Conclusion.class);
        startActivity(i);
    }
}
