package de.gg.solr;

import java.util.List;

import org.springframework.data.solr.repository.SolrCrudRepository;

import de.gg.solr.document.CustomerDocument;


public interface CustomerSolrRepository extends SolrCrudRepository<CustomerDocument, String> {

	List<CustomerDocument> findByNameStartingWith(String name);

}
