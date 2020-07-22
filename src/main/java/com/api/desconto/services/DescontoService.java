package com.api.desconto.services;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.desconto.dto.DescontoDTO;

@Service
public class DescontoService {

    public DescontoDTO calcularValor(Pageable pageable) {

        return pessoa.map(pessoas -> new DescontoDTO(pessoas));
    }


}
