package com.example.calcimc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        Intent it = new Intent  (this, MainActivity2.class);
        Bundle params = new Bundle();
        params.putString("msg", "Olá");
        it.putExtras(params);
        startActivity(it);
    }
}

