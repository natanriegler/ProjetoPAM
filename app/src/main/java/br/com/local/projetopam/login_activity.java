 package br.com.local.projetopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login_activity extends AppCompatActivity {

    EditText edtUsuario, edtSenha;
    TextView txtSeCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //vai executar o Layout - Login.Layout
        setContentView(R.layout.login_layout);

        //Apresentar os componentes xml aos objetos no java
        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);
        txtSeCadastrar = findViewById(R.id.txtSeCadastrar);

        //Criando a ação de clique na  TextView Cadastrar
        txtSeCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Cadastrar_Activity.class));
                finish();
            }
        });

    }

    public void entrarJanelaPrincipal(View view) {
        //Mostra uma mensagem para o usuário
        //Toast.makeText(login_activity.this,) OU
        //Toast.makeText(this,) OU
        /*Toast.makeText(getApplicationContext(),
                "Cliquei em entrar!", Toast.LENGTH_SHORT).show(); */

        //Abrir Janela Principal

        /*Object nome;
        nome = "etecia";
        nome = true; ... */

        String usuario, senha;
        usuario = edtUsuario.getText().toString();
        senha = edtSenha.getText().toString();

        if (usuario.equals("etecia")&&senha.equals("etecia")) {

            Intent abrirJanela = new Intent(getApplicationContext(), principal_activity.class);
            startActivity(abrirJanela);
            //Fechando a janela de Login
            finish();
        }else{
            Toast.makeText(getApplicationContext(),
                    "Usuário ou senha inválidos!", Toast.LENGTH_LONG).show();
        }



    }

    public void sairJanelaLogin(View view) {
        finish();
    }
}