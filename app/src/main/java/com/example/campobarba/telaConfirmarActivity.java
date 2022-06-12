package com.example.campobarba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class telaConfirmarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_confirmar);
        TextView textBarbeiro = (TextView) findViewById(R.id.textBarbeiroConfirm);
        if (telaPrincipalActivity.barber0) {
            textBarbeiro.setText("Leonardo");
        } else if (telaPrincipalActivity.barber1) {
            textBarbeiro.setText("Pedro");
        } else if (telaPrincipalActivity.barber2) {
            textBarbeiro.setText("Mathias");
        }

        TextView textTipo = (TextView) findViewById(R.id.textTipoConfirm);
        if (telaPrincipalActivity.cabeloIsChecked) {
            textTipo.setText("Cabelo");
        } else if (telaPrincipalActivity.barbaIsChecked) {
            textTipo.setText("Barba");
        } else if (telaPrincipalActivity.barbaecabeloIsChecked) {
            textTipo.setText("Cabelo e Barba");
        }

        TextView textData = (TextView) findViewById(R.id.textDataConfirm);
        textData.setText(telaAgendamentoActivity.date);

        TextView textHora = (TextView) findViewById(R.id.textHoraConfirm);
        textHora.setText(telaAgendamentoActivity.hora);
    }

    public void confirmar(View v) {
        Intent intencao = new Intent(this, telaPrincipalActivity.class);
        startActivity(intencao);
    }

    public void cancelar(View v) {
        Intent intencao = new Intent(this, telaPrincipalActivity.class);
        startActivity(intencao);
    }
    public void backToAgendamento(View v) {
        Intent intencao = new Intent(this, telaAgendamentoActivity.class);
        startActivity(intencao);
    }
}