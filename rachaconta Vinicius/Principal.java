package com.example.rachaconta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Principal extends AppCompatActivity {

    EditText edtComanda;
    EditText edtPessoas;
    TextView txtResultado;
    TextView txtResultado2;
    RadioGroup rgTaxa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        edtComanda = (EditText) findViewById(R.id.edtComanda);
        edtPessoas = (EditText)  findViewById(R.id.edtPessoas);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        txtResultado2 = (TextView)  findViewById(R.id.txtResultado2);
        rgTaxa = (RadioGroup) findViewById(R.id.rgTaxa);

    }

    public void onCalcularClick(View v){
        double taxa;
        String comandaString = edtComanda.getText().toString();
        String pessoasString = edtPessoas.getText().toString();

        //Verifica se alguma variavel é vazia
        if (comandaString.isEmpty()) {
            Toast.makeText(this, "Digite o valor do pedido",
                    Toast.LENGTH_LONG).show();
            return;
        }
        double pedido = Double.parseDouble(comandaString);
        int pessoas  = Integer.parseInt(pessoasString);
        double resultado=0, resultadoTaxa=0;
        DecimalFormat df = new DecimalFormat("0.00");

        switch (rgTaxa.getCheckedRadioButtonId()){
            case R.id.rbTrue: taxa=1.1;
                resultadoTaxa = pedido*taxa;
                resultado = resultadoTaxa/pessoas;

            break;
            case R.id.rbFalse: resultado = pedido/pessoas;
                resultadoTaxa = resultado;
        }
        txtResultado.setText(String.valueOf(df.format(resultadoTaxa)));
        txtResultado2.setText(String.valueOf(df.format(resultado)));


    }
}