package org.model;

import java.util.List;

public class Categoria {
    private long id;
    private String nome;
    private float valorLocacao;
    private List<Modelo>modelos;

    //*********************************************************************************
    //CONSTRUTORES


    public Categoria() {
        this.id = 0;
        this.nome ="";
        this.valorLocacao = 0;
        this.modelos = modelos;
    }

    public Categoria(long id, String nome, float valorLocacao, List<Modelo> modelos) {
        this.id = id;
        this.nome = nome;
        this.valorLocacao = valorLocacao;
        this.modelos = modelos;
    }
    //***********************************************************************************
    //GETTERS AND SETTERS


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }
}
