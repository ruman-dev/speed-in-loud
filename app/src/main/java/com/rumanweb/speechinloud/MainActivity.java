package com.rumanweb.speechinloud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button hearNow;
    EditText edText;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hearNow = findViewById(R.id.hearNow);
        edText = findViewById(R.id.edText);

        textToSpeech = new TextToSpeech(MainActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });
        String hearingText = edText.getText().toString();
        hearNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    textToSpeech.speak(hearingText,TextToSpeech.QUEUE_FLUSH,null,null);
            }
        });

    }
}