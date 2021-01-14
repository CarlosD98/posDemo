package com.example.posdemo.requests;

import java.math.BigDecimal;

import com.example.posdemo.models.Pago.Tipo;

import lombok.Data;

@Data
public class PagoCreationReq {
    private Tipo tipo;
    private BigDecimal pagado;


}
