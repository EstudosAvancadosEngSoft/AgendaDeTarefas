package br.cefet.agenda.agendadetarefas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import br.cefet.agenda.dao.Tarefa;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ver(View v)
    {
        Intent it = new Intent(this, ListActivity.class);
        startActivity(it);
    }

    public void adicionar(View v)
    {
        Intent it = new Intent(this, CadastroActivity.class);
        startActivity(it);
    }

    public void outraLista(View v)
    {
        Intent it = new Intent(this, SearchListActivity.class);
        startActivity(it);
    }
}
