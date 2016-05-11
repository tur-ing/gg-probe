package de.gg.solr.repository;

import javax.annotation.Resource;

import org.springframework.data.solr.core.SolrTemplate;


public class CustomerIndexRepositoryImpl implements CustomerIndexRepository {

    @Resource
    private SolrTemplate solrTemplate;

    //to be done @Marcel - 10.05.2016
    /*@Transactional
    @Override
    public void addAllToIndex(Page<Customer> customerEntries) {
		customerEntries.forEach((temp) -> {
			System.out.println(temp);
		});
    }*/

}
