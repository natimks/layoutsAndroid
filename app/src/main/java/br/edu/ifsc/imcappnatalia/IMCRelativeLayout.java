package br.edu.ifsc.imcappnatalia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IMCRelativeLayout extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcrelative_layout);

        button = findViewById(R.id.calcular_imc);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                EditText alturaEd = (EditText) findViewById(R.id.altura_ed);
                EditText pesoEd = (EditText) findViewById(R.id.peso_ed);

                double altura = Double.parseDouble(alturaEd.getText().toString());
                double peso = Double.parseDouble(pesoEd.getText().toString());

                TextView resultado = (TextView) findViewById(R.id.resulta_imc_tv);
                double imc = peso/ (Math.pow(altura,2));
                resultado.setText(String.format("Resultado: %.2f",(imc)));
            }
        });
    }
//    public void onClickCalcularIMC(View view) {
//        EditText alturaEd = (EditText) findViewById(R.id.altura_ed);
//        EditText pesoEd = (EditText) findViewById(R.id.peso_ed);
//
//        double altura = Double.parseDouble(alturaEd.getText().toString());
//        double peso = Double.parseDouble(pesoEd.getText().toString());
//
//        TextView resultado = (TextView) findViewById(R.id.resulta_imc_tv);
//        double imc = peso/ (Math.pow(altura,2));
//        resultado.setText(String.format("Resultado: %.2f",(imc)));
//    }

    public void onClickIniciarCreditosActivity(View view) {
        Intent intent = new Intent(IMCRelativeLayout.this, CreditoActivity.class);
        startActivity(intent);
    }
}
