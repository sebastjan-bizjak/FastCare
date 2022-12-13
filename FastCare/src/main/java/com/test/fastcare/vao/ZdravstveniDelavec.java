package com.test.fastcare.vao;

import jakarta.persistence.*;

@Entity
//@Table
public class ZdravstveniDelavec {

    @Override
    public String toString() {
        return "Zdravstveni delavec=[ " + "id_zd= " + id_zd + ", ime= " + ime + ", urgenca= " + urgenca + ", oddelek= " + oddelek + "]";
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id_zd;
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

    public long getId_zd() {
        return id_zd;
    }

    public void setId_zd(long id_zd) {
        this.id_zd = id_zd;
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