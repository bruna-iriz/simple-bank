package br.com.biv.simplebank.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_ACCOUNT")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ACCOUNT_ID", nullable = false, unique = true)
    private UUID accountId;

    @Column(name = "DOCUMENT_NUMBER", nullable = false, unique = true)
    private String documentNumber;
}
