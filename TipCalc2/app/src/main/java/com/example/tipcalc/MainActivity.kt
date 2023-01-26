package com.example.tipcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

public class MainActivity extends AppbarActivity {

        private double currentBillTotal;
        private int currentCustomPercent;
        private EditText top10EditText;
        private EditText top15EditText;
        private EditText top20EditText;
        private EditText total10EditText;
        private EditText total15EditText;
        private EditText total20EditText;
        private TextView customTipTextView;
        private EditText billEditText;
        private EditText tipCustomEditText;
        private EditText totalCustomEditText;
    }

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main)
    }

}


