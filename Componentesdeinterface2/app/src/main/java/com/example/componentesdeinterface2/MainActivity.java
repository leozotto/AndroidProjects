package com.example.componentesdeinterface2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton toogleEstado;
    private CheckBox checkEstado;
    private Switch switchEstado;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toogleEstado = findViewById(R.id.toggleEstado);
        checkEstado = findViewById(R.id.checkEstado);
        switchEstado = findViewById(R.id.switchEstado);
        textResultado = findViewById(R.id.textResultado);
    }
    public void enviar(View view) {
        if(toogleEstado.isChecked()){
            textResultado.setText("Toogle LIGADO");

        }else{
            textResultado.setText("Toogle DESLIGADO");
        }

        /*if(checkEstado.isChecked()){
            textResultado.setText("Checkbox LIGADO");

        }else{
            textResultado.setText("Checkbox DESLIGADO");
        }

        if(switchEstado.isChecked()){
            textResultado.setText("Switch LIGADO");

        }else{
            textResultado.setText("Switch DESLIGADO");
        }*/
    }
}
