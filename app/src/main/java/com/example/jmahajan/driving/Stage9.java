package com.example.jmahajan.driving;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Stage9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage9);

        Player p = (Player)getIntent().getSerializableExtra("Player");
        TextView money = findViewById(R.id.money_view);
        money.setText("Money Left: $" + p.getMoney());

        final TypeWriter tw = findViewById(R.id.tw);
        tw.setText("");
        tw.setCharacterDelay(60);
        tw.animateText("The driver talks to you but you can barely understand him. " +
                "The driver begins to talk about his life and his unfortunate circumstances. " +
                "While talking about his life, he becomes frustrated, rage-like and drives into a nearby factory. " +
                "The driver is in critical condition and you are hurt but alive. " +
                "While your family is in shock over the actions you took, you are grounded for a month.");

    }
    public void onConclusion(View view)
    {
        Intent i = new Intent(this, Conclusion.class);
        startActivity(i);
    }
}
