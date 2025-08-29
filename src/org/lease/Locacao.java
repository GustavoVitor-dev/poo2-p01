package org.lease;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Locacao {
    private long id;
    private Date dataRetirada;
    private Date dataDevolucao;
    private float valorLocacao;
    private List<String> listaOcorrencias;


    //*****************************************************************************
    //Construtores


    public Locacao() {
        this.id = 0;
        this.dataRetirada = new Date();
        this.dataDevolucao = new Date();
        this.valorLocacao = 0;
        this.listaOcorrencias = new ArrayList<>();
    }

    public Locacao(long id, Date dataRetirada, Date dataDevolucao, float valorLocacao, List<String> listaOcorrencias) {
        this.id = id;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.valorLocacao = valorLocacao;
        this.listaOcorrencias = listaOcorrencias;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public List<String> getListaOcorrencias() {
        return listaOcorrencias;
    }

    public void setListaOcorrencias(List<String> listaOcorrencias) {
        this.listaOcorrencias = listaOcorrencias;
    }
}
