package de.gg.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;
import de.gg.model.Customer;

public interface CustomerRepository extends Repository<Customer, String> {

	Page<Customer> findAll(Pageable pageable);

}
