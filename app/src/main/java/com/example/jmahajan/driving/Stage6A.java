package com.example.jmahajan.driving;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Stage6A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage6);

        Player p = (Player)getIntent().getSerializableExtra("Player");
        TextView money = findViewById(R.id.money_view);
        money.setText("Money Left: $" + p.getMoney());

        final TypeWriter tw = findViewById(R.id.tw);
        tw.setText("");
        tw.setCharacterDelay(60);
        tw.animateText("You decide to go home. " +
                "Since you carpooled with one of your friends, you have to find a way to go home. " +
                "A taxi stops by and the driver, chugging a bottle in the process, saying " +
                "with a slurred speech that he can take you home. You decide to…");

    }
    public void onStage9click(View view)
    {
        Player p = (Player)getIntent().getSerializableExtra("Player");
        p.money -= 2;
        Intent i = new Intent(this, Stage9.class);
        i.putExtra("Player", p);
        startActivity(i);
    }

    public void onStage6click(View view)
    {
        Player p = (Player)getIntent().getSerializableExtra("Player");
        Intent i;
        Random r = new Random();
        int rand = r.nextInt(3);
        if (rand == 0)
        {
            i = new Intent(this, Stage6B.class);
        }
        else if (rand == 1)
        {
            i = new Intent(this, Stage6C.class);
        }
        else if (rand == 2)
        {
            i = new Intent(this, Stage6D.class);
        }
        else
        {
            i = new Intent(this, Stage6D.class);
        }
        i.putExtra("Player", p);
        startActivity(i);
    }
}
