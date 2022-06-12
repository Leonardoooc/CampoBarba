package com.example.campobarba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class telaCadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
    }
    public void cadastrar(View v) {
        Intent intencao = new Intent(this, telaPrincipalActivity.class);
        startActivity(intencao);
    }

    public void confirmar(View v) {
        Intent intencao = new Intent(this, telaPrincipalActivity.class);
        startActivity(intencao);
    }
    public void cancelar(View v) {
        Intent intencao = new Intent(this, telaPrincipalActivity.class);
        startActivity(intencao);
    }
}