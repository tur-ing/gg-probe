package de.gg.solr.repository;

import org.springframework.data.solr.repository.SolrCrudRepository;
import de.gg.solr.document.*;

public interface CustomerDocumentRepository extends CustomerIndexRepository, SolrCrudRepository<CustomerDocument, String> {

}
