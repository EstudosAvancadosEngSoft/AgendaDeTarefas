package br.cefet.agenda.agendadetarefas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.cefet.agenda.br.cefet.agenda.banco.Banco;
import br.cefet.agenda.dao.Tarefa;

public class ListActivity extends android.app.ListActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        //Tarefa t = new Tarefa("Tarefa1", "1/1/1", "1/1/1");
        //List<Tarefa> lista = new ArrayList<Tarefa>();
        //lista.add(t);
        if(Banco.banco.size() >= 1) {
            List<Tarefa> lista = Banco.banco;
            setListAdapter(new TarefasAdapter(this, lista));
        }

    }
}
