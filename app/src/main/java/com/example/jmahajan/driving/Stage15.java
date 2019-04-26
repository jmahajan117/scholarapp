package com.example.jmahajan.driving;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Stage15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage15);

        Player p = (Player)getIntent().getSerializableExtra("Player");
        TextView money = findViewById(R.id.money_view);
        money.setText("Money Left: $" + p.getMoney());

        final TypeWriter tw = findViewById(R.id.tw);
        tw.setText("");
        tw.setCharacterDelay(60);
        tw.animateText(" Your friends begins to drive. " +
                "Since both you cannot detect what is going on, your friend under the influence hits a pedestrian " +
                "and crashes into a building. " +
                "You and your friend are sent to the hospital and under arrest for underage drinking. " +
                "Your parents ground you and your license is suspended.");
    }

    public void onConclusion(View view)
    {
        Intent i = new Intent(this, Conclusion.class);
        startActivity(i);
    }
}
