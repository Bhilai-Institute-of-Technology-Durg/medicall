package com.example.medicall;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;

import java.util.Calendar;

public class book_Activity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private Button date;
    private Button time;
    private Button continu;
    private TextView num2;
    private LinearLayout layout;
    private Button continu2;
    private LinearLayout layout_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_);

        date = findViewById(R.id.seclectDate);
        time = findViewById(R.id.seclectTime);
        continu = findViewById(R.id.contiu);
        layout = findViewById(R.id.linerlayout1);
        num2 = findViewById(R.id.num2);
        continu2 = findViewById(R.id.contiu2);
        layout_two = findViewById(R.id.linerlayout2);


        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog();
            }
        });
        continu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setVisibility(View.INVISIBLE);
                continu.setVisibility(View.INVISIBLE);
                layout_two.setVisibility(View.VISIBLE);
                continu2.setVisibility(View.VISIBLE);

            }
        });
        continu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_two.setVisibility(View.INVISIBLE);
                continu2.setVisibility(View.INVISIBLE);
            }
        });

    }


    public void showDatePickerDialog(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        String dat = i + "/" + i1 + "/" + i2;
        date.setText(dat);
    }
}