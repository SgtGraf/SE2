package com.example.einzelbeispiel;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setText("Los!");
        EditText edit = (EditText)findViewById(R.id.editText);
        TextView textTop = (TextView)findViewById(R.id.textView);
        textTop.setText("Matrikelnummer");
        TextView textBottom = (TextView)findViewById(R.id.textView2);
        textBottom.setText("...");
    }
}
