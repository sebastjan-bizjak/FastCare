package com.test.fastcare.vao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Kartoteka {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id_kartoteka;
    /*private Bolnik Bolnik;

    public Bolnik getBolnik() {
        return Bolnik;
    }

    public void setBolnik(Bolnik bolnik) {
        Bolnik = bolnik;
    }
    */
}
