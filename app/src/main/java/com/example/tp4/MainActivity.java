package com.example.tp4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener, CompoundButton.OnCheckedChangeListener {
    ImageButton blue , rouge;
    Button button;
    TextView textView;
    RadioGroup radioGroup , radioGroup2;
    ToggleButton rougeToggle , jauneToggle , blueToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blue = findViewById(R.id.blue);
        rouge = findViewById(R.id.rouge);
        button = findViewById(R.id.button);
        radioGroup2 = findViewById(R.id.radio2);
        textView = findViewById(R.id.textView);
        radioGroup = findViewById(R.id.radio);
        rougeToggle = findViewById(R.id.rougeToggle);
        jauneToggle = findViewById(R.id.jauneToggle);
        blueToggle = findViewById(R.id.blueToggle);
        radioGroup.setOnCheckedChangeListener(this);
        blue.setOnClickListener(this);
        rouge.setOnClickListener(this);
        button.setOnClickListener(this);
        rougeToggle.setOnCheckedChangeListener(this);
        jauneToggle.setOnCheckedChangeListener(this);
        blueToggle.setOnCheckedChangeListener(this);
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == blue.getId()){
            textView.setBackgroundColor(Color.BLUE);
        }
        else if(view.getId() == rouge.getId()){
            textView.setBackgroundColor(Color.RED);
        }
        else if(view.getId() == button.getId()){
            if (radioGroup2.getCheckedRadioButtonId() == -1){
                Toast.makeText(this,"Selectionez un Color Svp",Toast.LENGTH_LONG).show();
            }
            else if(radioGroup2.getCheckedRadioButtonId() == R.id.red_radio_button){
                textView.setBackgroundColor(Color.RED);
            }
            else if(radioGroup2.getCheckedRadioButtonId() == R.id.yellow_radio_button){
                textView.setBackgroundColor(Color.YELLOW);
            }
            else if(radioGroup2.getCheckedRadioButtonId() == R.id.blue_radio_button){
                textView.setBackgroundColor(Color.BLUE);
            }
        }
    }
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (i == R.id.colorRouge){
            textView.setBackgroundColor(Color.RED);
        }
        else if(i == R.id.colorJaune){
            textView.setBackgroundColor(Color.YELLOW);
        }
        else if(i == R.id.colorBlue){
            textView.setBackgroundColor(Color.BLUE);
        }
    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (compoundButton.getId() == rougeToggle.getId()){
            if (b){
             textView.setBackgroundColor(Color.RED);
            }
            else {
                textView.setBackgroundColor(Color.BLACK);
            }
        }
        else if(compoundButton.getId() == jauneToggle.getId()){
            if (b){
                textView.setBackgroundColor(Color.YELLOW);
            }
            else {
                textView.setBackgroundColor(Color.BLACK);
            }
        }
        else {
            if (b){
                textView.setBackgroundColor(Color.BLUE);
            }
            else {
                textView.setBackgroundColor(Color.BLACK);
            }
        }
    }
}