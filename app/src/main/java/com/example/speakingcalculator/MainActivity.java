package com.example.speakingcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText e1,e2;
    TextToSpeech t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        e1 = findViewById(R.id.edit1);
        e2 = findViewById(R.id.edit2);
        t = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                t.setLanguage(Locale.ENGLISH);
                t.setSpeechRate(1.0f);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float a = f1+f2;
                String ans = Float.toString(a);
                t.speak(ans, TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(MainActivity.this, "ans", Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float a = f1-f2;
                String ans = Float.toString(a);
                t.speak(ans, TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(MainActivity.this, "ans", Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float a = f1*f2;
                String ans = Float.toString(a);
                t.speak(ans, TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(MainActivity.this, "ans", Toast.LENGTH_SHORT).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                Float f1 = Float.parseFloat(s1);
                Float f2 = Float.parseFloat(s2);
                Float a = f1/f2;
                String ans = Float.toString(a);
                t.speak(ans, TextToSpeech.QUEUE_FLUSH, null);
                Toast.makeText(MainActivity.this, "ans", Toast.LENGTH_SHORT).show();
            }
        });
    }
}