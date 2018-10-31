package de.hsnu.bodymassapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)findViewById(R.id.btn_calculate);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });
    }

    public void calculateBMI() {

        try {
            EditText weight = (EditText)findViewById(R.id.txt_weight);
            double rec_weight = Double.parseDouble(weight.getText().toString());

            EditText size = (EditText)findViewById(R.id.txt_size);
            double rec_size = Double.parseDouble(size.getText().toString());

            double bmi = rec_weight/(rec_size*rec_size);

            EditText result = (EditText)findViewById(R.id.txt_result);
            result.setText(Double.toString(bmi));
        } catch (Exception e ) {
            EditText result = (EditText)findViewById(R.id.txt_result);
            result.setText("Falsche Eingabe");
        }
    }


}
