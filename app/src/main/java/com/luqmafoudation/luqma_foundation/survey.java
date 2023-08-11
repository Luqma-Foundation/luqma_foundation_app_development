package com.luqmafoudation.luqma_foundation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class survey extends AppCompatActivity {

    EditText country, state, city, locality;
    Button nextbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        country = findViewById(R.id.editTextText);
        state = findViewById(R.id.editTextText5);
        city = findViewById(R.id.editTextText4);
        locality = findViewById(R.id.editText_Text6);

        nextbtn = findViewById(R.id.button_3);

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(country.getText().toString())){
                    country.setError("address is required");
                    return;
                }
                if (TextUtils.isEmpty(state.getText().toString())) {
                    state.setError("address is required");
                    return;
                }
                if (TextUtils.isEmpty(city.getText().toString())) {
                    city.setError("address is required");
                    return;
                }
                if (TextUtils.isEmpty(locality.getText().toString())) {
                    locality.setError("address is required");
                    return;
                }

                Toast.makeText(survey.this,"Data is saved", Toast.LENGTH_SHORT).show();


            }
        });
    }
}