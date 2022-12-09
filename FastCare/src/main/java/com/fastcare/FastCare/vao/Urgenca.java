package com.fastcare.FastCare.vao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Urgenca {

    @Override
    public String toString(){
        return "Urgenca=[ id= "+ id +", ime=" + nazivUrgence +", naslov= " + naslovUrgence + " ]"
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private int id
    private String nazivUrgence;
    private String naslovUrgence;
    private soba[] sobe;
    private oddelek[] oddelki;
    private zdravstveniDelavec[] Delavci;

    public Urgenca(String nazivUrgence, String naslovUrgence){
        this.nazivUrgence = nazivUrgence;
        this.naslovUrgence = naslovUrgence;

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

    public soba[] getSobe() {
        return sobe;
    }

    public void setSobe(soba[] sobe) {
        this.sobe = sobe;
    }

    public oddelek[] getOddelki() {
        return oddelki;
    }

    public void setOddelki(oddelek[] oddelki) {
        this.oddelki = oddelki;
    }

    public zdravstveniDelavec[] getDelavci() {
        return Delavci;
    }

    public void setDelavci(zdravstveniDelavec[] delavci) {
        Delavci = delavci;
    }
}
