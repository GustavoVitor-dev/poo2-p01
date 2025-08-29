package org.model;

public class Veiculo {
    private long id;
    private StatusVeiculo statusVeiculo;
    private int km;
    private String placa;
    private  String chassi;
    private String renavam;
    private String cor;
    private Modelo modelo;

//*************************************************************************************************
//Construtores


    public Veiculo() {
        this.id = 0;
        this.statusVeiculo = StatusVeiculo.NAO_HOMOLOGADO;
        this.km = 100;
        this.placa = "";
        this.chassi = "";
        this.renavam = "";
        this.cor = "";
        this.modelo = modelo ;
    }

    public Veiculo(long id, StatusVeiculo status, int km, String placa, String chassi, String renavam, String cor, Modelo modelo) {
        this.id = id;
        this.statusVeiculo = status;
        this.km = km;
        this.placa = placa;
        this.chassi = chassi;
        this.renavam = renavam;
        this.cor = cor;
        this.modelo = modelo;
    }
//**************************************************************************************************

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public StatusVeiculo getStatus() {
        return statusVeiculo;
    }

    public void setStatus(StatusVeiculo status) {
        this.statusVeiculo = status;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
}



