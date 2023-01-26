package com.example.multiview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

@Override
public void onCreate (Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContendView(R.layout.activity_tela1);
    }

public void onClick(View view) {
    Intent it = new Intent(this, Tela2.class);
    startActivity(it);
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}