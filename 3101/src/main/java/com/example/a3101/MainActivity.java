package com.example.a3101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView myText;
    private CheckBox myCheckBox;
    private Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        myText = findViewById(R.id.tvMyText);
        myCheckBox = findViewById(R.id.checkBox);
        myButton = findViewById(R.id.button15);

        myText.setText("New text in TextView");
        myCheckBox.setChecked(true);
        myButton.setEnabled(false);
    }
}