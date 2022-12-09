package com.fastcare.FastCare.vao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Oddelek {

    @Override
    public String toString(){
        return "Oddelek=[ id= "+ id +", ime=" + imeOdd +", namen= " + namen + " ]"
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String imeOdd;
    private String namen;




    public Oddelek(String ImeOdd, String namen){
        this.imeOdd = imeOdd;
        this.namen = namen;
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
}
