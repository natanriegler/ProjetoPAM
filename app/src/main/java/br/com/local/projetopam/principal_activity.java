package br.com.local.projetopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class principal_activity extends AppCompatActivity {
    //Declarar os componentes que irei acessar pelo id do xml. Vão ser componentes Globais
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal_layout);
        //Realizar a ligação do componente que está no Java
        // com o componente que está no  xml
        btnVoltar = findViewById(R.id.btnVoltar);

        //Executando uma ação de clique

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    //Voltar pra JAnela de Login, abrindo essa janela
                    startActivity(new Intent(getApplicationContext(),login_activity.class));
                    //fechando a janela principal
                finish();
            }
        });

    }
}