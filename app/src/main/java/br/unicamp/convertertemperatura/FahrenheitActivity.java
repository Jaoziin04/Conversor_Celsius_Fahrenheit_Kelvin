package br.unicamp.convertertemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FahrenheitActivity extends AppCompatActivity {

    TextView tvFahrenheit;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit);

        Intent intent = getIntent();
        Bundle parametros = intent.getExtras();

        String fahrenheit = parametros.getString("chaveFahrenheit");

        tvFahrenheit = findViewById(R.id.tvFahrenheit);



        tvFahrenheit.setText("A temperatura em F é: " + fahrenheit);
    }
}