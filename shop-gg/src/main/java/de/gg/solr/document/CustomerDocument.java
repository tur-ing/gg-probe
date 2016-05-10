package de.gg.solr.document;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "collection1")
public class CustomerDocument {
	
    public static final String FIELD_ID = "id";
    public static final String FIELD_NAME = "Namv";
    public static final String FIELD_NACHNAME = "Namn";
	
	@Id
	@Field("kunde")
	private String kundennummer;
	@Field("Namv")
	private String name;
	@Field("Namn")
	private String nachname;
	@Field("Str40")
	private String strasse;
	@Field("Hsnr")
	private String hausnummer;
	@Field("plz")
	private String plz;
	@Field("ort40")
	private String ort;
	@Field("ortt40")
	private String ortsteil;
	@Field("lkz")
	private String land;
	
	public CustomerDocument() {
		
	}
	
	public CustomerDocument(Long kundennummer, String name) {
		super();
		this.kundennummer = kundennummer.toString();
		this.name = name;
	}
	
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public static class Builder {
        private CustomerDocument build;

        public Builder(String kundennummer, String name) {
            build = new CustomerDocument();
            build.kundennummer = kundennummer;
            build.name = name;
        }

        public CustomerDocument build() {
            return build;
        }
    }
    
    public static Builder getBuilder(String kundennummer, String name) {
        return new Builder(kundennummer, name);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getKundennummer() {
		return kundennummer;
	}

	public void setKundennummer(String kundennummer) {
		this.kundennummer = kundennummer;
	}

}
