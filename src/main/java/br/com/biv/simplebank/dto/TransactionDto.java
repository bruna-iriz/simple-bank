package br.com.biv.simplebank.dto;

import br.com.biv.simplebank.model.enums.OperationsType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionDto {
    private String accountId;
    private OperationsType operationType;
    private BigDecimal amount;
    private LocalDateTime eventDate;
}
