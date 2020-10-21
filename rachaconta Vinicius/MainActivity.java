package com.example.rachaconta;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText  edtUsuario;
    EditText  edtSenha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtSenha = (EditText)  findViewById(R.id.edtSenha);
    }
    public void onLoginClick(View v) {
        String usuario = edtUsuario.getText().toString();
        String senha = edtSenha.getText().toString();

        if (usuario.equals("admin") && senha.equals("@dmin")) {
            Intent principal = new Intent(MainActivity.this, Principal.class);
            startActivity(principal);
        } else {
            showMessage("Erro", "Usuário ou senha invalidos");
        }
    }

    private void showMessage(String tittle, String msg){
        AlertDialog.Builder diag = new AlertDialog.Builder(this);
        diag.setTitle(tittle);
        diag.setMessage(msg);
        diag.setNeutralButton("Ok", null);
        diag.show();

    }
}