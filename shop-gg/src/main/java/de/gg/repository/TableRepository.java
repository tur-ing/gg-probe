package de.gg.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import de.gg.model.Customer;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface TableRepository extends PagingAndSortingRepository<Customer, Long> {

	Page<Customer> findAll(Pageable pageable);

}
