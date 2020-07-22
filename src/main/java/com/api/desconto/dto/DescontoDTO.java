package com.api.desconto.dto;

public class DescontoDTO {

    private int parcela;

    private Double valor;

    public int getParcela() {
        return parcela;
    }

    public Double getValor() {
        return valor;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
