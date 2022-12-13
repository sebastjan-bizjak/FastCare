package com.test.fastcare.vao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ZdravniskaIzkaznica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id_izkaznica;
    private String veljavnaDo;
    private String imeLastinka;
    private String priimekLastnika;

    public ZdravniskaIzkaznica() {

    }

    public ZdravniskaIzkaznica(String veljavnaDo, String imeLastinka, String priimekLastnika) {
        this.veljavnaDo = veljavnaDo;
        this.imeLastinka = imeLastinka;
        this.priimekLastnika = priimekLastnika;
    }

    public int getId_izkaznica() {
        return id_izkaznica;
    }

    public void setId_izkaznica(int id_izkaznica) {
        this.id_izkaznica = id_izkaznica;
    }

    public String getVeljavnaDo() {
        return veljavnaDo;
    }

    public void setVeljavnaDo(String veljavnaDo) {
        this.veljavnaDo = veljavnaDo;
    }

    public String getImeLastinka() {
        return imeLastinka;
    }

    public void setImeLastinka(String imeLastinka) {
        this.imeLastinka = imeLastinka;
    }

    public String getPriimekLastnika() {
        return priimekLastnika;
    }

    public void setPriimekLastnika(String priimekLastnika) {
        this.priimekLastnika = priimekLastnika;
    }

    @Override
    public String toString() {
        return "ZdravniskaIzkaznica{" +
                "id_izkaznica=" + id_izkaznica +
                ", veljavnaDo='" + veljavnaDo + '\'' +
                ", imeLastinka='" + imeLastinka + '\'' +
                ", priimekLastnika='" + priimekLastnika + '\'' +
                '}';
    }
}
