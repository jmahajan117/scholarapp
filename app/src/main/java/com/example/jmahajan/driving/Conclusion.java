package com.example.jmahajan.driving;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Conclusion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conclusion);

        final TypeWriter tw = findViewById(R.id.tw);
        tw.setText("");
        tw.setCharacterDelay(60);
        tw.animateText("Regardless what path you took or money you spent, all these choices are " +
                "in your control. Only you can refuse to drink, text while you drive, and take certain" +
                " rides home. YOU have the power to decide");
    }

    public void onClick(View view)
    {
        finish();
    }
}
