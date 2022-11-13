package br.com.biv.simplebank.controller.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AccountRequest {
    @NotBlank
    @JsonProperty("document_number")
    private String documentNumber;
}
