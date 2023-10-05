package com.example.numeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.InputMismatchException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sumar(View vista){
        int result;
        int numero1 = 0;
        int numero2 = 0;
        boolean error;

        do {
            try {
                EditText valor1 = (EditText) findViewById(R.id.valor1);
                numero1 = Integer.parseInt(valor1.getText().toString());
                EditText valor2 = (EditText) findViewById(R.id.valor2);
                numero2 = Integer.parseInt(valor2.getText().toString());
                error=false;
            } catch (InputMismatchException e) {
                error=true;
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                "Has introducido letras", Toast.LENGTH_SHORT);

                toast1.show();
            }
        }while(error);

        result = numero1+numero2;
        TextView myTextView = (TextView) findViewById(R.id.resultado);
        String cadena = String.valueOf(result);
        myTextView.setText(cadena);

    }
}