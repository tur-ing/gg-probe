package de.gg.solr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import de.gg.model.Customer;
import de.gg.repository.CustomerRepository;
import de.gg.solr.repository.CustomerDocumentRepository;

@Configuration
@RestController
public class SolrController {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	CustomerDocumentRepository customerDocumentRepository;
	
	@RequestMapping(value = "/initSolr", method = RequestMethod.GET)
	public Page<Customer> initSolr() {
		int documents = 100;
		Pageable limit = new PageRequest(0,documents);
		Page<Customer> customers = customerRepository.findAll(limit);
		//to be done
		//customerDocumentRepository.addAllToIndex(customers);
		return customers;
	}

}
