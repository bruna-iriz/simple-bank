package br.com.biv.simplebank.domain.model;

import br.com.biv.simplebank.domain.model.enums.OperationsType;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@Table(name = "TB_TRANSACTIONS")
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TRANSACTION_ID", nullable = false, unique = true)
    private Long transactionId;

    @Column(name = "ACCOUNT_ID", nullable = false)
    private Long accountId;
    @Column(name = "OPERATION_TYPE", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private OperationsType operationType;
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "EVENT_DATE", nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime eventDate = LocalDateTime.now();

    @ManyToOne(optional = false)
    private Account account;
}
