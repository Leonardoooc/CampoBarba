package com.example.campobarba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class telaAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_admin);
    }

    public void backToLogin3(View v) {
        Intent intencao = new Intent(this, MainActivity.class);
        startActivity(intencao);
    }

    public void funcionariosButton(View v) {
        Intent intencao = new Intent(this, telaFuncionariosActivity.class);
        startActivity(intencao);
    }
    public void agendamentosButton(View v) {
        Intent intencao = new Intent(this, telaAgendadosActivity.class);
        startActivity(intencao);
    }
}