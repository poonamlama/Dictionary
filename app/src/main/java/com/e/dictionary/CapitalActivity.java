package com.e.dictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class CapitalActivity extends AppCompatActivity {

    private TextView txtCapital;
    Bundle bundle;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);
        txtCapital = findViewById(R.id.tvfirst);
        bundle = getIntent().getExtras();
        if (bundle != null) {
            String capital = bundle.getString("capital");
            txtCapital.setText(capital);

        } else {
            Toast.makeText(this, "No capital", Toast.LENGTH_LONG).show();
        }

    }
}
