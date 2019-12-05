package com.maharjan.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddWordActivity extends AppCompatActivity implements View.OnClickListener {
    EditText word, meaning;
    Button btnAddWord;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_word);
         word = findViewById(R.id.etWord);
         meaning = findViewById(R.id.etMeaning);
         btnAddWord = findViewById(R.id.btnAddWord);
         btnAddWord.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

    }
}
