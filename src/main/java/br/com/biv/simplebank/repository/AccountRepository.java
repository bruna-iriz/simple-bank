package br.com.biv.simplebank.repository;

import br.com.biv.simplebank.model.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AccountRepository extends JpaRepository<AccountModel, UUID> {
}
