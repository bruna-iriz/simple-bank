package br.com.biv.simplebank.domain.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OperationsType {
    COMPRA_A_VISTA(1L),
    COMPRA_PARCELADA(2L),
    SAQUE(3L),
    PAGAMENTO(4L);

    private final Long id;

}
