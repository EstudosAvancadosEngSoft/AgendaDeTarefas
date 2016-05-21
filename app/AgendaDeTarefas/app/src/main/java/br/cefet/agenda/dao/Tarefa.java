package br.cefet.agenda.dao;

import java.util.Date;

/**
 * Created by guilherme on 21/05/16.
 */
public class Tarefa {
    private String descricao;
    private String conclusao;
    private String dataConclusao;

    public Tarefa(String descricao, String conclusao, String dataConclusao) {
        this.descricao = descricao;
        this.conclusao = conclusao;
        this.dataConclusao = dataConclusao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getConclusao() {
        return conclusao;
    }

    public void setConclusao(String conclusao) {
        this.conclusao = conclusao;
    }

    public String getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }
}
