package de.gg;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;
import org.springframework.data.solr.server.support.HttpSolrServerFactoryBean;

@SpringBootApplication
@EnableJpaRepositories("de.gg.repository")
@EnableSolrRepositories("de.gg.solr")
public class ShopGgApplication {

	private static final String PROPERTY_NAME_SOLR_SERVER_URL = "solr.server.url";

    @Resource
    private Environment environment;

    @Bean
    public HttpSolrServerFactoryBean solrServerFactoryBean() {
        HttpSolrServerFactoryBean factory = new HttpSolrServerFactoryBean();
        factory.setUrl(environment.getRequiredProperty(PROPERTY_NAME_SOLR_SERVER_URL));
        return factory;
    }

    @Bean
    public SolrTemplate solrTemplate() throws Exception {
        return new SolrTemplate(solrServerFactoryBean().getObject());
    }

	public static void main(String[] args) {
		SpringApplication.run(ShopGgApplication.class, args);
	}

}
