package br.com.biv.simplebank.controller.resource;

import br.com.biv.simplebank.domain.model.enums.OperationsType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionResponse {
    private Long transactionId;
    private OperationsType operationType;
    private BigDecimal amount;
    private LocalDateTime eventDate;
}
