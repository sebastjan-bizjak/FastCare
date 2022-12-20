package com.test.fastcare.vao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Oprema {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id_oprema;
    private String nazivOpreme;
    private String tipOpreme;
    private String namenOpreme;
    private int tipZD;

    public Oprema() {

    }

    public Oprema(String nazivOpreme, String tipOpreme, String namenOpreme, int tipZD) {
        this.nazivOpreme = nazivOpreme;
        this.tipOpreme = tipOpreme;
        this.namenOpreme = namenOpreme;
        this.tipZD = tipZD;
    }

    public long getId_oprema() {
        return id_oprema;
    }

    public void setId_oprema(long id_oprema) {
        this.id_oprema = id_oprema;
    }

    public String getNazivOpreme() {
        return nazivOpreme;
    }

    public void setNazivOpreme(String nazivOpreme) {
        this.nazivOpreme = nazivOpreme;
    }

    public String getTipOpreme() {
        return tipOpreme;
    }

    public void setTipOpreme(String tipOpreme) {
        this.tipOpreme = tipOpreme;
    }

    public String getNamenOpreme() {
        return namenOpreme;
    }

    public void setNamenOpreme(String namenOpreme) {
        this.namenOpreme = namenOpreme;
    }

    public int getTipZD() {
        return tipZD;
    }

    public void setTipZD(int tipZD) {
        this.tipZD = tipZD;
    }

    @Override
    public String toString() {
        return "Oprema{" +
                "id_oprema=" + id_oprema +
                ", nazivOpreme='" + nazivOpreme + '\'' +
                ", tipOpreme='" + tipOpreme + '\'' +
                ", namenOpreme='" + namenOpreme + '\'' +
                ", tipZD=" + tipZD +
                '}';
    }
}
