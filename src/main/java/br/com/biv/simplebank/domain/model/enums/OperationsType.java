package br.com.biv.simplebank.domain.model.enums;

import lombok.Getter;

import java.util.stream.Stream;

@Getter
public enum OperationsType {
    COMPRA_A_VISTA(0),
    COMPRA_PARCELADA(1),
    SAQUE(2),
    PAGAMENTO(3);

    private final Integer value;

    private OperationsType(Integer value) {
        this.value = value;
    }

    public static boolean getValue(Integer id) {
        return Stream.of(OperationsType.values())
                .anyMatch(operationsType -> operationsType.value.equals(id));
    }
}
