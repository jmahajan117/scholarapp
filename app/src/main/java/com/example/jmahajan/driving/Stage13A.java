package com.example.jmahajan.driving;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Stage13A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage13);

        Player p = (Player)getIntent().getSerializableExtra("Player");
        TextView money = findViewById(R.id.money_view);
        money.setText("Money Left: $" + p.getMoney());

        final TypeWriter tw = findViewById(R.id.tw);
        tw.setText("");
        tw.setCharacterDelay(60);
        tw.animateText("Since you carpooled home, you begin to walk outside and find a taxi cab who is unable to                down. " +
                "You decide to... ");


    }
    public void onStage14click(View view)
    {
        Player p = (Player)getIntent().getSerializableExtra("Player");
        p.money -= 2;
        Intent i = new Intent(this, Stage14.class);
        i.putExtra("Player", p);
        startActivity(i);
    }

    public void onStage13click(View view)
    {
        Player p = (Player)getIntent().getSerializableExtra("Player");
        Intent i;
        Random r = new Random();
        int rand = r.nextInt(2);
        if (rand == 0)
        {
            i = new Intent(this, Stage13B.class);
        }
        else
        {
            i = new Intent(this, Stage13C.class);
        }
        i.putExtra("Player", p);
        startActivity(i);
    }
}
