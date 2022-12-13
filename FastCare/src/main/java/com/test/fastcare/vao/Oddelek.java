package com.test.fastcare.vao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Oddelek {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id_oddelek;
    private String imeOdd;
    private String namen;

    public Oddelek() {

    }

    public Oddelek(String imeOdd, String namen) {
        this.imeOdd = imeOdd;
        this.namen = namen;
    }

    public int getId_oddelek() {
        return id_oddelek;
    }

    public void setId_oddelek(int id_oddelek) {
        this.id_oddelek = id_oddelek;
    }

    public String getImeOdd() {
        return imeOdd;
    }

    public void setImeOdd(String imeOdd) {
        this.imeOdd = imeOdd;
    }

    public String getNamen() {
        return namen;
    }

    public void setNamen(String namen) {
        this.namen = namen;
    }

    @Override
    public String toString() {
        return "Oddelek{" +
                "id_oddelek=" + id_oddelek +
                ", imeOdd='" + imeOdd + '\'' +
                ", namen='" + namen + '\'' +
                '}';
    }
}
