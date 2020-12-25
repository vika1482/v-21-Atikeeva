package com.example.atikeeva_v_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button butCreate;
    private EditText edit;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butCreate = (Button) findViewById(R.id.butCreate);

        butCreate = (Button) findViewById(R.id.butCreate);
    }

    @Override
    public void onClick (View view) {
        switch (view.getId()) {
            case R.id.butCreate:
                edit = findViewById(R.id.editTextTextPersonName2);
                edit.setVisibility(View.VISIBLE);
                break;
        }
    }
}