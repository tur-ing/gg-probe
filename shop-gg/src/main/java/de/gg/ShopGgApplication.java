package de.gg;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

import de.gg.solr.CustomerSolrRepository;

@SpringBootApplication
@EnableSolrRepositories("de.gg.solr")
public class ShopGgApplication {

	@Bean
	public SolrServer solrServer() {
	    return new HttpSolrServer("http://localhost:8983/solr");
	}
	 
	@Bean
	public SolrTemplate solrTemplate(SolrServer server) throws Exception {
	    return new SolrTemplate(server);
	}
	
	@Autowired
	private CustomerSolrRepository repository;
	  
	public static void main(String[] args) {
		SpringApplication.run(ShopGgApplication.class, args);
	}

}
