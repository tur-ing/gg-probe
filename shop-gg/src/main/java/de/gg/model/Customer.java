package de.gg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VBKAD")
public class Customer {

	@Id
	@Column(name = "kunde")
	private String kundennummer;
	@Column(name = "Namv")
	private String name;
	@Column(name = "Namn")
	private String nachname;
	@Column(name = "Str40")
	private String strasse;
	@Column(name = "Hsnr")
	private String hausnummer;
	@Column(name = "plz")
	private String plz;
	@Column(name = "ort40")
	private String ort;
	@Column(name = "ortt40")
	private String ortsteil;
	@Column(name = "lkz")
	private String land;

	public Customer() {
		
	}

	public String getKundennummer() {
		return kundennummer;
	}

	public void setKundennummer(String kundennummer) {
		this.kundennummer = kundennummer;
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

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getHausnummer() {
		return hausnummer;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public String getOrtsteil() {
		return ortsteil;
	}

	public void setOrtsteil(String ortsteil) {
		this.ortsteil = ortsteil;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}
	
}
