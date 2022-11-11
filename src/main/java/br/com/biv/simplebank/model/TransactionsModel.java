package br.com.biv.simplebank.model;

import br.com.biv.simplebank.model.enums.OperationsType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_TRANSACTIONS")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TRANSACTION_ID", nullable = false, unique = true)
    private UUID transactionId;

    @Column(name = "ACCOUNT_ID", nullable = false)
    private String accountId;
    @Column(name = "OPERATION_TYPE", nullable = false)
//    @Enumerated(EnumType.STRING)
    private OperationsType operationType;
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "EVENT_DATE", nullable = false)
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime eventDate;

}
