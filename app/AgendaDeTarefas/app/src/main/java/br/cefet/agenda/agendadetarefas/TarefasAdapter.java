package br.cefet.agenda.agendadetarefas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.cefet.agenda.dao.Tarefa;

/**
 * Created by guilherme on 21/05/16.
 */
public class TarefasAdapter extends BaseAdapter {
    public Context context;
    public List<Tarefa> tarefas;
    public List<Tarefa> todasTarefas;

    public TarefasAdapter(Context context, List<Tarefa> tarefas) {
        this.context = context;
        this.tarefas = tarefas;
        this.todasTarefas = new ArrayList<Tarefa>();
        this.todasTarefas.addAll(tarefas);
    }

    public int getCount() {
        return tarefas.size();
    }

    public Object getItem(int position) {
        Tarefa t = tarefas.get(position);
        return t;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        Tarefa t = tarefas.get(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.activity_list, null);

        TextView textDescricao = (TextView) v.findViewById(R.id.txtDescricao);
        TextView textConclusao = (TextView) v.findViewById(R.id.txtConclusao);
        TextView textDataConclusao = (TextView) v.findViewById(R.id.txtDataConclusao);

        textDescricao.setText(t.getDescricao());
        textConclusao.setText(t.getConclusao());
        textDataConclusao.setText(t.getDataConclusao());

        return v;
    }

    public void filter(String text)
    {
        text = text.toLowerCase(Locale.getDefault());
        tarefas.clear();
        if (text.length() == 0)
        {
            tarefas.addAll(todasTarefas);
        }
        else
        {
            for (Tarefa t : todasTarefas)
            {
                if (t.getDescricao().toLowerCase(Locale.getDefault()).contains(text))
                {
                    tarefas.add(t);
                }
            }
        }
    }
}
