package com.example.campobarba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class telaAgendadosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_agendados);

        TextView textBarbeiroAg = (TextView) findViewById(R.id.textBarbeiroAgendado);
        if (telaPrincipalActivity.barber0) {
            textBarbeiroAg.setText("Leonardo");
        } else if (telaPrincipalActivity.barber1) {
            textBarbeiroAg.setText("Pedro");
        } else if (telaPrincipalActivity.barber2) {
            textBarbeiroAg.setText("Mathias");
        }

        TextView textTipoAg = (TextView) findViewById(R.id.textTipoAgendado);
        if (telaPrincipalActivity.cabeloIsChecked) {
            textTipoAg.setText("Cabelo");
        } else if (telaPrincipalActivity.barbaIsChecked) {
            textTipoAg.setText("Barba");
        } else if (telaPrincipalActivity.barbaecabeloIsChecked) {
            textTipoAg.setText("Cabelo e Barba");
        }

        TextView textDataAg = (TextView) findViewById(R.id.textDataAgendado);
        textDataAg.setText(telaAgendamentoActivity.date);

        TextView textHoraAg = (TextView) findViewById(R.id.textHoraAgendado);
        textHoraAg.setText(telaAgendamentoActivity.hora);
    }

    public void backToAdmin2(View v) {
        Intent intencao = new Intent(this, telaAdminActivity.class);
        startActivity(intencao);
    }
}