package com.example.rafaj.fragmentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView text;
    ImageView imgPlaneta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text = findViewById(R.id.textId);
        imgPlaneta = findViewById(R.id.imagenPlanet);

        Intent callingIntent = getIntent();
        String intentAction = callingIntent.getAction();
        String intentType = callingIntent.getType();

        if (Intent.ACTION_SEND.equals(intentAction) && intentType != null){
            if (intentType.equals("text/plain")){
                handleReceivedText(callingIntent);
            }
        }

    }

    private void handleReceivedText(Intent intent) {
        String intentText = intent.getStringExtra(Intent.EXTRA_TEXT);

        if (text != null) {
            text.setText(intentText);

            switch (text.getText().toString()) {
                case "Sun":
                    imgPlaneta.setImageResource(R.drawable.sol);
                    break;
                case "Mercury":
                    imgPlaneta.setImageResource(R.drawable.mercurio);
                    break;
                case "Venus":
                    imgPlaneta.setImageResource(R.drawable.venus);
                    break;
                case "Earth":
                    imgPlaneta.setImageResource(R.drawable.tierra);
                    break;
                case "Mars":
                    imgPlaneta.setImageResource(R.drawable.marte);
                    break;
                case "Jupiter":
                    imgPlaneta.setImageResource(R.drawable.jupiter);
                    break;
                case "Saturn":
                    imgPlaneta.setImageResource(R.drawable.saturn);
                    break;
                case "Uranus":
                    imgPlaneta.setImageResource(R.drawable.urano);
                    break;
                case "Neptune":
                    imgPlaneta.setImageResource(R.drawable.neptuno);
                    break;
            }
        }

    }
}