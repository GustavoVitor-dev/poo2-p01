package org.lease;

public class Pagamento {
    private long id;
    private TipoPagamento tipoPagamento;
    private float valorTotal;

    //***************************************************************************
    //CONSTRUTORES


    public Pagamento() {
        this.id = 0;
        this.tipoPagamento = TipoPagamento.NAO_DEFINIDO;
        this.valorTotal = 0;
    }

    public Pagamento(long id, TipoPagamento tipoPagamento, float valorTotal) {
        this.id = id;
        this.tipoPagamento = tipoPagamento;
        this.valorTotal = valorTotal;
    }

    //***********************************************************************************************
    //GETTERS AND SETTERS


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
