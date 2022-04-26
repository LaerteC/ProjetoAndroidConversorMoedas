package com.example.meuconversodemoedas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

import APIConverter.MyTask;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    String [] moedas ={"BRL","USD","Euro","EUR","BTC"};

    EditText edtValorDolar, edtQuantDolar;
    TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        edtValorDolar = findViewById(R.id.edtValorDolar);
        edtQuantDolar = findViewById(R.id.edtQuantDolar);

        txtResultado = findViewById(R.id.txtResultado);

    }

//    public void calcular(View view) {
//
//       // double quantDolar = Double.parseDouble(edtQuantDolar.getText().toString().replace(',','.'));
//       // double valorDolar = Double.parseDouble(edtValorDolar.getText().toString().replace(',','.'));
//
//       // double totalReais = valorDolar * quantDolar;
//
//        DecimalFormat decimal = new DecimalFormat("0.00");
//        String valorFormatado = decimal.format(totalReais);
//
//        txtResultado.setText("R$: "+ valorFormatado);
//
//    }


    public void getData(View view){

        String moeda = edtQuantDolar.toString();
        String moeda2 = edtValorDolar.toString();
        String valor = moeda +"-"+ moeda2;


        String value = "500";

        String urlMoeda = "https://economia.awesomeapi.com.br/json/last/:" +valor;
        MyTask task = new MyTask(txtResultado);

        task.execute(urlMoeda);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}