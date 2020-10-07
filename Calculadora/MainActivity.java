package com.example.aula_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtValor1, edtValor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor1 = (EditText) findViewById(R.id.edtValor1);
        edtValor2 = (EditText) findViewById(R.id.edtValor2);
    }

    public void onSomaClick(View v){
        String valor1String = edtValor1.getText().toString();
        String valor2String = edtValor2.getText().toString();
        //Verifica se alguma variavel é vazia
        if (valor1String.isEmpty() || valor2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números",
                    Toast.LENGTH_LONG).show();
            return;
        }
        double valor1 = Double.parseDouble(valor1String);
        double valor2 = Double.parseDouble(valor2String);
        double resultado = valor1+valor2;

        AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);

        msg.setTitle("O Resultado é:");
        msg.setMessage(String.valueOf(resultado));
        msg.setNeutralButton("OK", null);
        msg.show();
    }
    public void onSubtracaoClick(View v){
        String valor1String = edtValor1.getText().toString();
        String valor2String = edtValor2.getText().toString();
        //Verifica se alguma variavel é vazia
        if (valor1String.isEmpty() || valor2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números",
                    Toast.LENGTH_LONG).show();
            return;
        }
        double valor1 = Double.parseDouble(valor1String);
        double valor2 = Double.parseDouble(valor2String);
        double resultado = valor1-valor2;

        AlertDialog.Builder msg = new AlertDialog.Builder(this);

        msg.setMessage(String.valueOf(resultado));
        msg.setNeutralButton("OK", null);
        msg.show();

    }
    public void onDivisaoClick(View v){
        String valor1String = edtValor1.getText().toString();
        String valor2String = edtValor2.getText().toString();
        //Verifica se alguma variavel é vazia
        if (valor1String.isEmpty() || valor2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números",
                    Toast.LENGTH_LONG).show();
            return;
        }
        double valor1 = Double.parseDouble(valor1String);
        double valor2 = Double.parseDouble(valor2String);

        if(valor2 == 0){
            Toast.makeText(this, "O segundo valor não pode ser 0 para essa operação",
                    Toast.LENGTH_LONG).show();
            return;
        }
        double resultado = valor1/valor2;

        AlertDialog.Builder msg = new AlertDialog.Builder(this);

        msg.setMessage(String.valueOf(resultado));
        msg.setNeutralButton("OK", null);
        msg.show();

    }
    public void onMultiplicacaoClick(View v){
        String valor1String = edtValor1.getText().toString();
        String valor2String = edtValor2.getText().toString();
        //Verifica se alguma variavel é vazia
        if (valor1String.isEmpty() || valor2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números",
                    Toast.LENGTH_LONG).show();
            return;
        }
        double valor1 = Double.parseDouble(valor1String);
        double valor2 = Double.parseDouble(valor2String);
        double resultado = valor1*valor2;

        AlertDialog.Builder msg = new AlertDialog.Builder(this);

        msg.setMessage(String.valueOf(resultado));
        msg.setNeutralButton("OK", null);
        msg.show();

    }
}