package com.example.barry.mrpatatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;

        String name = checkbox.getText().toString();
        int imageNo = getResources().getIdentifier(name, "id", getPackageName());

        ImageView image = findViewById(imageNo);

        if (checkbox.isChecked()) {
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.INVISIBLE);
        }

    }
}

