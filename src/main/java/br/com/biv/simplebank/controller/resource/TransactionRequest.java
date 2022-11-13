package br.com.biv.simplebank.controller.resource;

import br.com.biv.simplebank.domain.model.enums.OperationsType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TransactionRequest {
    @JsonProperty("account_id")
    private Long accountId;
    @JsonProperty("operation_type")
    private OperationsType operationType;
    private BigDecimal amount;
}
