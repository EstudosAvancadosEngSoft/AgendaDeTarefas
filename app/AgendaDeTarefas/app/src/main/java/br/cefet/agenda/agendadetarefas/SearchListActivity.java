package br.cefet.agenda.agendadetarefas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.Locale;

import br.cefet.agenda.br.cefet.agenda.banco.Banco;

public class SearchListActivity extends AppCompatActivity {

    ListView lv;
    EditText inputSearch;
    TarefasAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_list);

        lv = (ListView)findViewById(R.id.list_view);
        inputSearch = (EditText)findViewById(R.id.inputSearch);
        adapter = new TarefasAdapter(this, Banco.banco);
        lv.setAdapter(adapter);
    }

    public void filterList(View v)
    {
        String text = inputSearch.getText().toString().toLowerCase(Locale.getDefault());
        adapter.filter(text);
    }
}
