package de.gg.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.Repository;
import de.gg.model.Customer;

public interface CustomerRepository extends Repository<Customer, String> {

	Page<Customer> findAll(Pageable pageable);
}
