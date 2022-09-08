package br.unicamp.convertertemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class KelvinActivity extends AppCompatActivity
{

    TextView tvKelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin);


        Intent intent = getIntent();
        Bundle parametros = intent.getExtras();

        String kelvin = parametros.getString("chaveKelvin");

        tvKelvin= findViewById(R.id.tvKelvin);




        tvKelvin.setText("A temperatura em K é: " + kelvin);
    }
}