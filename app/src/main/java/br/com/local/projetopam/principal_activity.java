package br.com.local.projetopam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
                startActivity(new Intent(getApplicationContext(), login_activity.class));
                //fechando a janela principal
                finish();
            }
        });

    }

    //Inserir o menu criado na barra de aplicativo - appBar


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Infkar o menu Layout atual
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //Criando as ações para os itens do menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mCadastrar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em cadastrar",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.mAlterar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Alterar",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.mExcluir:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Exclir",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.mPesquisar:
                Toast.makeText(getApplicationContext(),
                        "Cliquei em Pesquisar",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.mVoltar:
                startActivity(new Intent(getApplicationContext(), login_activity.class));
                finish();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}