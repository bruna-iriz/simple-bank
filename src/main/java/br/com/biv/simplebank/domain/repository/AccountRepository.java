package br.com.biv.simplebank.domain.repository;

import br.com.biv.simplebank.domain.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
}
