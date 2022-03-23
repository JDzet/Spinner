package com.example.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    TextView textView;
    Button bm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinnerFrom = findViewById(R.id.spinner);
        Spinner spinnerTo = findViewById(R.id.spinner2);
        rg =(RadioGroup) findViewById(R.id.rgg);
        bm = findViewById(R.id.button);

        ArrayAdapter<?> adapterlength = ArrayAdapter.createFromResource(this,R.array.length, android.R.layout.simple_spinner_item);
        ArrayAdapter<?> adaptermass = ArrayAdapter.createFromResource(this,R.array.mass, android.R.layout.simple_spinner_item);

        rg.setOnCheckedChangeListener((group, checkedId) -> {

            switch (checkedId){
                case R.id.radioButton:
                    adapterlength.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerFrom.setAdapter(adapterlength);
                    spinnerTo.setAdapter(adapterlength);

                    bm.setOnClickListener(v -> {
                        EditText editValue = ((EditText)findViewById(R.id.valueFrom));
                        EditText outputValue  = ((EditText)findViewById(R.id.valueTo));

                        if(!editValue.getText().toString().trim().isEmpty()) {

                            double value = Double.parseDouble(editValue.getText().toString());

                            int spinnerToPos = spinnerTo.getSelectedItemPosition();
                            int spinnerFromPos = spinnerFrom.getSelectedItemPosition();

                            switch (spinnerFromPos) {
                                case 0:
                                    switch (spinnerToPos){
                                        case 0:
                                            outputValue.setText(String.valueOf(value));
                                            break;
                                        case 1:
                                            value /= 10;
                                            outputValue.setText(String.valueOf(value));
                                            break;
                                        case 2:
                                            value /= 25.5;
                                            outputValue.setText(String.valueOf(value));
                                            break;
                                        case 3:
                                            value /= 1000;
                                            outputValue.setText(String.valueOf(value));
                                            break;
                                        case 4:
                                            value /= 1000000;
                                            outputValue.setText(String.valueOf(value));
                                            break;
                                    }

                            }

                            switch (spinnerFromPos){
                                case 1:
                                    switch (spinnerToPos){
                                                case 0:
                                                    value *= 10;
                                                    outputValue.setText(String.valueOf(value));
                                                    break;
                                                case 1:
                                                    outputValue.setText(String.valueOf(value));
                                                    break;
                                                case 2:
                                                    value *= 0.39;
                                                    outputValue.setText(String.valueOf(value));
                                                    break;
                                                case 3:
                                                    value /= 100;
                                                    outputValue.setText(String.valueOf(value));
                                                    break;
                                                case 4:
                                                    value /= 100000;
                                                    outputValue.setText(String.valueOf(value));
                                                    break;
                                    }
                            }

                            switch (spinnerFromPos){
                                case 2:
                                    switch (spinnerToPos){
                                                case 0:
                                                    value *= 25.4;
                                                    outputValue.setText(String.valueOf(value));
                                                    break;
                                                case 1:
                                                    value *= 2.54;
                                                    outputValue.setText(String.valueOf(value));
                                                    break;
                                                case 2:
                                                    outputValue.setText(String.valueOf(value));
                                                    break;
                                                case 3:
                                                    value *= 0.025;
                                                    outputValue.setText(String.valueOf(value));
                                                    break;
                                                case 4:
                                                    value *= 0.000025;
                                                    outputValue.setText(String.valueOf(value));
                                                    break;

                                    }
                            }

                            switch (spinnerFromPos) {
                                case 3:
                                    switch (spinnerToPos) {
                                        case 0:
                                            value *= 1000;
                                            outputValue.setText(String.valueOf(value));
                                            break;
                                        case 1:
                                            value *= 100;
                                            outputValue.setText(String.valueOf(value));
                                            break;
                                        case 2:
                                            value *= 39.7;
                                            outputValue.setText(String.valueOf(value));
                                            break;
                                        case 3:
                                            outputValue.setText(String.valueOf(value));
                                            break;
                                        case 4:
                                            value /= 1000;
                                            outputValue.setText(String.valueOf(value));
                                            break;
                                    }
                            }


                            switch (spinnerFromPos) {
                                case 4:
                                    switch (spinnerToPos) {
                                        case 0:
                                            value *= 1000000;
                                            outputValue.setText(String.valueOf(value));
                                            break;
                                        case 1:
                                            value *= 100000;
                                            outputValue.setText(String.valueOf(value));
                                            break;
                                        case 2:
                                            value *= 39370.08 ;
                                            outputValue.setText(String.valueOf(value));
                                            break;
                                        case 3:
                                            value *= 1000;
                                            outputValue.setText(String.valueOf(value));
                                            break;
                                        case 4:
                                            outputValue.setText(String.valueOf(value));
                                            break;
                                    }
                            }


                        }
                        else {
                            textView.setText("данные введены неверно");
                        }
                    });
                    break;


                case R.id.radioButton3:
                    adaptermass.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerFrom.setAdapter(adaptermass);
                    spinnerTo.setAdapter(adaptermass);

                    bm.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            EditText editValue = ((EditText)findViewById(R.id.valueFrom));
                            EditText outputValue  = ((EditText)findViewById(R.id.valueTo));

                            if(!editValue.getText().toString().trim().isEmpty()) {

                                double value = Double.parseDouble(editValue.getText().toString());

                                int spinnerToPos = spinnerTo.getSelectedItemPosition();
                                int spinnerFromPos = spinnerFrom.getSelectedItemPosition();

                                switch (spinnerFromPos) {
                                    case 0:
                                        switch (spinnerToPos){
                                            case 0:
                                                outputValue.setText(String.valueOf(value));
                                                break;
                                            case 1:
                                                value /= 1000;
                                                outputValue.setText(String.valueOf(value));
                                                break;
                                            case 2:
                                                value /= 1000000;
                                                outputValue.setText(String.valueOf(value));
                                                break;
                                        }

                                }

                                switch (spinnerFromPos) {
                                    case 1:
                                        switch (spinnerToPos){
                                            case 0:
                                                value *=1000;
                                                outputValue.setText(String.valueOf(value));
                                                break;
                                            case 1:
                                                outputValue.setText(String.valueOf(value));
                                                break;
                                            case 2:
                                                value /= 1000;
                                                outputValue.setText(String.valueOf(value));
                                                break;
                                        }

                                }

                                switch (spinnerFromPos) {
                                    case 2:
                                        switch (spinnerToPos){
                                            case 0:
                                                value *= 1000000;
                                                outputValue.setText(String.valueOf(value));
                                                break;
                                            case 1:
                                                value *= 1000;
                                                outputValue.setText(String.valueOf(value));
                                                break;
                                            case 2:
                                                outputValue.setText(String.valueOf(value));
                                                break;
                                        }

                                }

                            }
                            else {
                                textView.setText("данные введены неверно");
                            }
                        }
                    });
                    break;

            }
        });




    }
}