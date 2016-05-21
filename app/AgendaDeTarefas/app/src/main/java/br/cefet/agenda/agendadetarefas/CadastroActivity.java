package br.cefet.agenda.agendadetarefas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import br.cefet.agenda.br.cefet.agenda.banco.Banco;
import br.cefet.agenda.dao.Tarefa;

public class CadastroActivity extends AppCompatActivity {

    TextView textDescricao;
    TextView textConclusao;
    TextView textDataConclusao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        textDescricao = (TextView) this.findViewById(R.id.textDescricao);
        textConclusao = (TextView) this.findViewById(R.id.textConclusao);
        textDataConclusao = (TextView) this.findViewById(R.id.textDataConclusao);

    }

    public void salvar(View v)
    {
        Tarefa t = new Tarefa(
                textDescricao.getText().toString(),
                textConclusao.getText().toString(),
                textDataConclusao.getText().toString()
        );

        Banco.banco.add(t);

        Toast toast = Toast.makeText(this, "Salvo com sucesso!", Toast.LENGTH_LONG);
        toast.show();
        textDescricao.setText("");
        textConclusao.setText("");
        textDataConclusao.setText("");
    }

    public void cancelar(View v)
    {
        finish();
    }
}
