package de.gg.solr;

import de.gg.model.Customer;

public interface CustomerIndexService {

    public void addToIndex(Customer customerEntry);

    public void deleteFromIndex(String kundennummer);

}
