package com.studio.gasolinaoualcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = findViewById(R.id.precoAlcoolId);
        precoGasolina = findViewById(R.id.precoGasolinaId);
        botaoVerificar = findViewById(R.id.botaoVerificarId);
        textoResultado = findViewById(R.id.textoResultadoId);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Recuperar os Valores digitaso
                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();


                //Converter os textos de String para números
                Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                //Calculo do Alcool - Gasolina
                //Dividir preço do Alcool com o da Gasolina
                double resultado = valorAlcool / valorGasolina;

                //Se for maior que 0,7 compensa utilizar a gasolina, menor é o alcool

                if (resultado >= 0.7) {

                    //Gasolina
                    textoResultado.setText("É Melhor Utilizar a Gasolina");
                }
                else {
                    // Alcool
                    textoResultado.setText("É Melhor Utilizar o Alcool");

                }
            }

        });

    }
}
