package com.example.campobarba;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.sql.Time;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class telaAgendamentoActivity extends AppCompatActivity {

    DatePickerDialog.OnDateSetListener setListener;
    Button selectButton;
    Button timeButton;
    int t1hour,t1minute,t2hour,t2minute;
    public static String date;
    public static String hora;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_agendamento);

        selectButton = findViewById(R.id.dataSelect);
        timeButton = findViewById(R.id.horarioSelect);

        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(telaAgendamentoActivity.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth,setListener,year,month,day);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });

        setListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int day) {
                month = month+1;
                date = day+"/"+month+"/"+year;
                selectButton.setText(date);
            }
        };
    }

    public void popTimePicker(View v)
    {
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                t1hour = selectedHour;
                t1minute = selectedMinute;
                timeButton.setText(String.format(Locale.getDefault(), "%02d:%02d", t1hour, t1minute));
                hora = timeButton.getText().toString();
            }
        };
        int style = AlertDialog.THEME_HOLO_LIGHT;
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, style, onTimeSetListener, t1hour, t1minute, true);
        timePickerDialog.show();
    };

    public void confirmarAgendamento(View v) {
        Intent intencao = new Intent(this, telaConfirmarActivity.class);
        startActivity(intencao);
    }
    public void backToPrincipal(View v) {
        Intent intencao = new Intent(this, telaPrincipalActivity.class);
        startActivity(intencao);
    }
}