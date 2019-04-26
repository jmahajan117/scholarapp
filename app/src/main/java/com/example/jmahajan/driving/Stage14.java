package com.example.jmahajan.driving;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Stage14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage14);

        Player p = (Player)getIntent().getSerializableExtra("Player");
        TextView money = findViewById(R.id.money_view);
        money.setText("Money Left: $" + p.getMoney());

        final TypeWriter tw = findViewById(R.id.tw);
        tw.setText("");
        tw.setCharacterDelay(60);
        tw.animateText("The driver starts to drive you home but he is distracted by his wife’s arguments. " +
                "He continues to text while driving down the road at 65 miles per hour. " +
                "*CRASH* The car is involved in a head on collision. " +
                "You and driver are sent to the hospital. " +
                "Your family grounds you for not understanding that texting while driving is dangerous " +
                "and your license is suspended for underage drinking.");
    }

    public void onConclusion(View view)
    {
        Intent i = new Intent(this, Conclusion.class);
        startActivity(i);
    }
}
