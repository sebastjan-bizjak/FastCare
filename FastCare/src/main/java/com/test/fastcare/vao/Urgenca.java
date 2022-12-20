package com.test.fastcare.vao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Urgenca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id_urgenca;
    private String nazivUrgence;
    private String naslovUrgence;
    private String sobe;
    private String oddelki;
    private String delavci;

    public Urgenca(){

        this("", "");

    }
    public Urgenca(String nazivUrgence, String naslovUrgence){

    }

    public long getId_urgenca() {
        return id_urgenca;
    }


    public void setId_urgenca(long id_urgenca) {
        this.id_urgenca = id_urgenca;
    }

    public String getNazivUrgence() {
        return nazivUrgence;
    }

    public void setNazivUrgence(String nazivUrgence) {
        this.nazivUrgence = nazivUrgence;
    }

    public String getNaslovUrgence() {
        return naslovUrgence;
    }

    public void setNaslovUrgence(String naslovUrgence) {
        this.naslovUrgence = naslovUrgence;
    }

    public String getSobe() {
        return sobe;
    }

    public void setSobe(String sobe) {
        this.sobe = sobe;
    }

    public String getOddelki() {
        return oddelki;
    }

    public void setOddelki(String oddelki) {
        this.oddelki = oddelki;
    }

    public String getDelavci() {
        return delavci;
    }

    public void setDelavci(String delavci) {
        this.delavci = delavci;
    }

    @Override
    public String toString() {
        return "Urgenca{" +
                "id_urgenca=" + id_urgenca +
                ", nazivUrgence='" + nazivUrgence + '\'' +
                ", naslovUrgence='" + naslovUrgence + '\'' +
                ", sobe='" + sobe + '\'' +
                ", oddelki='" + oddelki + '\'' +
                ", delavci='" + delavci + '\'' +
                '}';
    }
}
