package com.fastcare.FastCare.vao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ZdravstveniDelavec {
	
	@Override
	public String toString() {
		return "Zdravstveni delavec=[ " + "id= " + id + ", ime= " + ime + ", urgenca= " + urgenca + ", oddelek= " + oddelek + "]";
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	private String ime;
	private String urgenca;
	private String oddelek;
	
	public ZdravstveniDelavec() {
		this("","","");
	}
	
	public ZdravstveniDelavec(String ime, String urgenca, String oddelek) {
		this.ime = ime;
		this.urgenca = urgenca;
		this.oddelek = oddelek;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getUrgenca() {
		return urgenca;
	}

	public void setUrgenca(String urgenca) {
		this.urgenca = urgenca;
	}

	public String getOddelek() {
		return oddelek;
	}

	public void setOddelek(String oddelek) {
		this.oddelek = oddelek;
	}
}
