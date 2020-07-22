package com.api.desconto.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.api.desconto.dto.DescontoDTO;
import com.api.desconto.services.DescontoService;

@RestController
@RequestMapping(path = "/api")
public final class DescontoResource {

    @Autowired
    private DescontoService descontoService;
    private DescontoDTO descontoDTO;

    @ResponseBody
    @GetMapping(path = "/parcela/valor")
    public ResponseEntity<?> compraDesconto(DescontoDTO dto) {
        DescontoDTO descontoDTO = descontoService.calcularValor(dto);

        if (dto == null) {
            return ResponseEntity.noContent()
                    .build();
        }
        return ResponseEntity.ok(dto);

    }
}
