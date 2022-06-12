package com.example.campobarba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class telaFuncionariosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_funcionarios);

        ListView lista = (ListView) findViewById(R.id.listFuncionarios);
        List<Barbeiros> barbeiros = Arrays.asList(Barbeiros.barbeiros);
        ArrayAdapter<Barbeiros> adapter = new ArrayAdapter<Barbeiros>(this, android.R.layout.simple_list_item_1, barbeiros);
        lista.setAdapter(adapter);
    }

    public void backToAdmin(View v) {
        Intent intencao = new Intent(this, telaAdminActivity.class);
        startActivity(intencao);
    }

}