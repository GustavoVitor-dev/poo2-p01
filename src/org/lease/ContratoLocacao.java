package org.lease;

import org.user.Cliente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContratoLocacao {
    private long id;
    private Date dataContrato;
    private float valorCaucao;
    private StatusLocacao statusLocacao;
    private List<String> listaLocacao;
    private float valorTotal;
    private Funcionario funcionario;
    private Cliente cliente;

    //********************************************************************************************
    //CONSTRUTORES


    public ContratoLocacao() {
        this.id = 0;
        this.dataContrato = new Date();
        this.valorCaucao = 0;
        this.statusLocacao = StatusLocacao.NAO_HOMOLOGADO;
        this.listaLocacao = new ArrayList<>();
        this.valorTotal = 0;
        this.funcionario = Funcionario.NAO_DEFINIDO;
        this.cliente = new Cliente();
    }

    public ContratoLocacao(long id, Date dataContrato, float valorCaucao, StatusLocacao statusLocacao, List<String> listaLocacao, float valorTotal, Funcionario funcionario, Cliente cliente) {
        this.id = id;
        this.dataContrato = dataContrato;
        this.valorCaucao = valorCaucao;
        this.statusLocacao = statusLocacao;
        this.listaLocacao = listaLocacao;
        this.valorTotal = valorTotal;
        this.funcionario = funcionario;
        this.cliente = cliente;
    }

    //*************************************************************************************************
    //GETTERS AND SETTERS


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public float getValorCaucao() {
        return valorCaucao;
    }

    public void setValorCaucao(float valorCaucao) {
        this.valorCaucao = valorCaucao;
    }

    public StatusLocacao getStatusLocacao() {
        return statusLocacao;
    }

    public void setStatusLocacao(StatusLocacao statusLocacao) {
        this.statusLocacao = statusLocacao;
    }

    public List<String> getListaLocacao() {
        return listaLocacao;
    }

    public void setListaLocacao(List<String> listaLocacao) {
        this.listaLocacao = listaLocacao;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
