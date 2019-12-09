package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gerarNovaFrase(View view){

        String[] frases = {
                "Assim como os pássaros, precisamos aprender a superar os desafios que nos são apresentados, para alçarmos voos mais altos.",
                "Façamos da interrupção um caminho novo. Da queda um passo de dança, do medo uma escada, do sonho uma ponte, da procura um encontro!",
                "O poder está dentro de você, na sua mente, pois se acreditar que consegue não haverá obstáculo capaz de impedir o seu sucesso.",
                "Nunca é tarde demais para ser aquilo que sempre desejou ser.",
                "O mundo está repleto de amadores! Não seja mais um.",
                "Aquilo que você está vivendo, o peso que você está carregando, não é nada comparado à alegria que está esperando por você!",
                "As pessoas dizem frequentemente que a motivação não dura. Bem, nem o banho - e é por isso que ele é recomendado diariamente.",
                "Você não verá qualquer tipo de dificuldade à sua frente se mantiver seu olhar focado nos objetivos que deseja realmente conquistar!",
                "A melhor maneira de melhorar o padrão de vida está em melhorar o padrão de pensamento.",
                "Serei sempre otimista, pois acreditar é o primeiro passo para fazer acontecer!"
        };

        int numero = new Random().nextInt(frases.length);

        TextView text = findViewById(R.id.text_resultado);
        text.setText(frases[numero]);

    }
}
