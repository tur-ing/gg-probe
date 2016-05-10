package de.gg.solr.service;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.gg.model.Customer;
import de.gg.solr.CustomerIndexService;
import de.gg.solr.CustomerSolrRepository;
import de.gg.solr.document.CustomerDocument;

@Service
public class CustomerSolrService implements CustomerIndexService {
 
    @Resource
    private CustomerSolrRepository repository;
    
    @Transactional
    @Override
    public void addToIndex(Customer customerEntry) {
        System.out.println("Saving a customer");
        CustomerDocument customer = CustomerDocument.getBuilder(customerEntry.getKundennummer(), customerEntry.getName()).build();
        repository.save(customer);
    }

    @Transactional
    @Override
    public void deleteFromIndex(String kundennummer) {
        repository.delete(kundennummer);
    }

}
