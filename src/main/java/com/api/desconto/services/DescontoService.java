package com.api.desconto.services;

import org.springframework.stereotype.Service;

import com.api.desconto.dto.DescontoDTO;

@Service
public class DescontoService {

    public DescontoDTO calcularValor(DescontoDTO descontoDTO) {

        return descontoDTO;
    }

    public int calcularDesc (int desconto) {

        return desconto;
    }

}
