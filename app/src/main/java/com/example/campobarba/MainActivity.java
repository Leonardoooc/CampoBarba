package com.example.campobarba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText inputTextEmail;
    EditText inputTextSenha;
    String emailString;
    String senhaString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTextEmail = (EditText) findViewById(R.id.email);
        inputTextSenha = (EditText) findViewById(R.id.senha);

    }

    public void logar(View v) {
        emailString = (String) inputTextEmail.getText().toString();
        senhaString = (String) inputTextSenha.getText().toString();
        if (emailString.equals("admin") && senhaString.equals("admin")) {
            Intent intencao = new Intent(this, telaAdminActivity.class);
            startActivity(intencao);
        } else {
            Intent intencao = new Intent(this, telaPrincipalActivity.class);
            startActivity(intencao);
        }
    }
    public void cadastro(View v) {
        Intent intencao = new Intent(this, telaCadastroActivity.class);
        startActivity(intencao);
    }
}