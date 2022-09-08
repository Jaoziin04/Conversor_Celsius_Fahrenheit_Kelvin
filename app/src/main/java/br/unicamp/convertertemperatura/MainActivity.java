package br.unicamp.convertertemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtKelvin, edtFahrenheit;
    Button   btnKelvin, btnFahrenheit;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        edtKelvin = findViewById(R.id.edtKelvin);
        edtFahrenheit = findViewById(R.id.edtFahrenheit);
        btnKelvin = findViewById(R.id.btnKelvin);
        btnFahrenheit = findViewById(R.id.btnFahrenheit);

        // click do kelvin
        btnKelvin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, KelvinActivity.class); // liga uma pagina na outra
                Bundle parametrosK = new Bundle(); // passa os parametros para outra pagina

                double celsius = Double.parseDouble(edtKelvin.getText().toString());

                String kelvin = String.valueOf(celsius + 273); // converte o resultado da conta para string

                parametrosK.putString("chaveKelvin", kelvin);

                intent.putExtras(parametrosK);
                startActivity(intent);
            }
        });


        // click do fahrenheit,
        btnFahrenheit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, FahrenheitActivity.class); // liga uma pagina na outra
                Bundle parametrosF = new Bundle(); // passa os parametros para outra pagina

                double celsius = Double.parseDouble(edtFahrenheit.getText().toString());

                String fahrenheit  = String.valueOf(celsius * 1.8 + 32); // converte o resultado da conta para string

                parametrosF.putString("chaveFahrenheit", fahrenheit);


                intent.putExtras(parametrosF);
                startActivity(intent);
            }
        });
    }
}