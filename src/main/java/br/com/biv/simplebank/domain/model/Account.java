package br.com.biv.simplebank.domain.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;


@Data
@Builder
@Entity
@Table(name = "TB_ACCOUNT")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Account implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ACCOUNT_ID", nullable = false, unique = true)
    private UUID accountId;

    @Column(name = "DOCUMENT_NUMBER", nullable = false, unique = true)
    private String documentNumber;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToMany(mappedBy = "account")
    private Set<Transaction> transactions;
}
