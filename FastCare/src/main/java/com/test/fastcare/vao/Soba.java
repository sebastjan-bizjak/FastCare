package com.test.fastcare.vao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Soba {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id_soba;
    private int stSobe;
    private String bolnik;
    private String oprema;

    public Soba() {

    }

    public Soba(int stSobe, String bolnik, String oprema) {
        this.stSobe = stSobe;
        this.bolnik = bolnik;
        this.oprema = oprema;
    }

    public int getId_soba() {
        return id_soba;
    }

    public void setId_soba(int id_soba) {
        this.id_soba = id_soba;
    }

    public int getStSobe() {
        return stSobe;
    }

    public void setStSobe(int stSobe) {
        this.stSobe = stSobe;
    }

    public String getBolnik() {
        return bolnik;
    }

    public void setBolnik(String bolnik) {
        this.bolnik = bolnik;
    }

    public String getOprema() {
        return oprema;
    }

    public void setOprema(String oprema) {
        this.oprema = oprema;
    }

    @Override
    public String toString() {
        return "Soba{" +
                "id_soba=" + id_soba +
                ", stSobe=" + stSobe +
                ", bolnik='" + bolnik + '\'' +
                ", oprema='" + oprema + '\'' +
                '}';
    }
}
