package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirAlerta(View view) {
        //criação objeto
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //titulo e mensagem
        dialog.setTitle("Titulo");
        dialog.setMessage("Mensagem");

        //configurar cancelamento
        dialog.setCancelable(false);

        //configura icone
        dialog.setIcon(R.drawable.ic_launcher_foreground);
        
        //botao positivo
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Sim foi pressionado", Toast.LENGTH_SHORT).show();
            }
        });

        //botao negativo
        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Não foi pressionado", Toast.LENGTH_SHORT).show();

            }
        });

        //criar e exibir alertdialog
        dialog.create();
        dialog.show();
    }
}
