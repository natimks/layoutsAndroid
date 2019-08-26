package br.edu.ifsc.imcappnatalia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCalcularIMC(View view) {
        EditText alturaEd = (EditText) findViewById(R.id.altura_ed);
        EditText pesoEd = (EditText) findViewById(R.id.peso_ed);

        double altura = Double.parseDouble(alturaEd.getText().toString());
        double peso = Double.parseDouble(pesoEd.getText().toString());

        TextView resultado = (TextView) findViewById(R.id.resultado_tv);

    }
}
