package com.example.recyclerview.activity.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.ClickListener;
import com.example.recyclerview.activity.adapter.Adapter;
import com.example.recyclerview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de filmes
        this.criarFilmes();

        //configurar adapter
        Adapter adapter = new Adapter(listaFilmes);


        //configurar recycler view
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        //evento de click
        recyclerView.addOnItemTouchListener(new ClickListener(
                getApplicationContext(),
                recyclerView,
                new ClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Filme filme = listaFilmes.get(position);
                        Toast.makeText(getApplicationContext(),"Item pressionado: "+filme.getTituloFilme() ,Toast.LENGTH_SHORT);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        Filme filme = listaFilmes.get(position);
                        Toast.makeText(getApplicationContext(),"Clique Longo: "+filme.getTituloFilme(),Toast.LENGTH_LONG);

                    }

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    }
                }
        ));

    }
    public void criarFilmes(){
        Filme filme = new Filme("Boku no hero academia", "Comedia", "2000");
        this.listaFilmes.add(filme);

        Filme filmeum = new Filme("Naruto", "Luta", "2001");
        this.listaFilmes.add(filmeum);

        Filme filmeumm = new Filme("Death Note", "Morte", "2002");
        this.listaFilmes.add(filmeumm);

        Filme filmeummm = new Filme("Sword art online", "joguinho online", "2003");
        this.listaFilmes.add(filmeummm);

        Filme filmeummmm = new Filme("Joker", "Psicopata", "2004");
        this.listaFilmes.add(filmeummmm);
    }
}
