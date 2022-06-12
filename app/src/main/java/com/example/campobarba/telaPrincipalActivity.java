package com.example.campobarba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class telaPrincipalActivity extends AppCompatActivity {

    public static boolean barber0;
    public static boolean barber1;
    public static boolean barber2;
    public static boolean cabeloIsChecked;
    public static boolean barbaIsChecked;
    public static boolean barbaecabeloIsChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        ListView lista = (ListView) findViewById(R.id.listBarbeiros);
        List<Barbeiros> barbeiros = Arrays.asList(Barbeiros.barbeiros);
        ArrayAdapter<Barbeiros> adapter = new ArrayAdapter<Barbeiros>(this, android.R.layout.simple_list_item_1, barbeiros);
        lista.setAdapter(adapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> listView,
                                    View v,
                                    int posicao,
                                    long id){
                if (posicao == 0){
                    barber0 = true;
                }
                if (posicao == 1) {
                    barber1 = true;
                }
                if (posicao == 2) {
                    barber2 = true;
                }
            }
        };
        lista.setOnItemClickListener(itemClickListener);
    }
    public void agendamento(View v) {
        cabeloIsChecked = ((CheckBox) findViewById(R.id.checkCabelo)).isChecked();
        barbaIsChecked = ((CheckBox) findViewById(R.id.checkBarba)).isChecked();
        barbaecabeloIsChecked = ((CheckBox) findViewById(R.id.checkBarbaeCabelo)).isChecked();
        Intent intencao = new Intent(this, telaAgendamentoActivity.class);
        startActivity(intencao);
    }

    public void backToLogin(View v) {
        Intent intencao = new Intent(this, MainActivity.class);
        startActivity(intencao);
    }
}