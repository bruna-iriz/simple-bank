package br.com.biv.simplebank.domain.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OperationsType {
    COMPRA_A_VISTA("1"),
    COMPRA_PARCELADA("2"),
    SAQUE("3"),
    PAGAMENTO("4");

    private String id;

}
