package com.test.fastcare.vao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bolnik {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id_bolnik;
    private String imeBolnika;

    private String priimekBolnika;
    private String spol;
    private int starost;
    private String zdravniskaIzkaznica;
    private String telSt;

    public Bolnik() {

    }

    public Bolnik(String imeBolnika, String priimekBolnika, String spol, int starost, String zdravniskaIzkaznica, String telSt) {
        this.imeBolnika = imeBolnika;
        this.priimekBolnika = priimekBolnika;
        this.spol = spol;
        this.starost = starost;
        this.zdravniskaIzkaznica = zdravniskaIzkaznica;
        this.telSt = telSt;
    }

    @Override
    public String toString() {
        return "Bolnik{" +
                "id_bolnik=" + id_bolnik +
                ", imeBolnika='" + imeBolnika + '\'' +
                ", priimekBolnika='" + priimekBolnika + '\'' +
                ", spol='" + spol + '\'' +
                ", starost=" + starost +
                ", zdravniskaIzkaznica=" + zdravniskaIzkaznica +
                ", telSt='" + telSt + '\'' +
                '}';
    }

    public int getId_bolnik() {
        return id_bolnik;
    }

    public void setId_bolnik(int id_bolnik) {
        this.id_bolnik = id_bolnik;
    }

    public String getImeBolnika() {
        return imeBolnika;
    }

    public void setImeBolnika(String imeBolnika) {
        this.imeBolnika = imeBolnika;
    }

    public String getPriimekBolnika() {
        return priimekBolnika;
    }

    public void setPriimekBolnika(String priimekBolnika) {
        this.priimekBolnika = priimekBolnika;
    }

    public String getSpol() {
        return spol;
    }

    public void setSpol(String spol) {
        this.spol = spol;
    }

    public int getStarost() {
        return starost;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public String getZdravniskaIzkaznica() {
        return zdravniskaIzkaznica;
    }

    public void setZdravniskaIzkaznica(String zdravniskaIzkaznica) {
        this.zdravniskaIzkaznica = zdravniskaIzkaznica;
    }

    public String getTelSt() {
        return telSt;
    }

    public void setTelSt(String telSt) {
        this.telSt = telSt;
    }
}
