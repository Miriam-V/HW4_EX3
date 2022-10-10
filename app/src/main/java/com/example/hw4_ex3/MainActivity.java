package com.example.hw4_ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onRestart() {
        super.onRestart();
        updateView();
    }

    public void updateView() {
        Button btnGreen = findViewById(R.id.btn_green);
        int btnNumber = Integer.parseInt(btnGreen.getText().toString());
        int addOne = btnNumber + 1;
        String addOneText = Integer.toString(addOne);
        btnGreen.setText(addOneText);
    }



    public void modifyData(View view) {
        Intent myIntent = new Intent(this, BackActivity.class);
        this.startActivity(myIntent);
    }

}