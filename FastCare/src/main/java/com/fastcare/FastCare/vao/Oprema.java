package com.fastcare.FastCare.vao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Oprema {
    @Override
    public toString(){
        return "Oprema=[ id= "+ id +", Tip Opreme=" + tipOpreme +" ]"

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id

    private int tipOpreme;

    public Oprema ( int tipOpreme ){
        this.tipOpreme = tipOpreme;
    }

   /* public String getNazivOpreme() {
        return nazivOpreme;
    }

    public void setNazivOpreme(String nazivOpreme) {
        this.nazivOpreme = nazivOpreme;
    }*/

    public String getTipOpreme() {
        return tipOpreme;
    }

    public void setTipOpreme(String tipOpreme) {
        this.tipOpreme = tipOpreme;
    }

    /*public String getNamenOpreme() {
        return namenOpreme;
    }

    public void setNamenOpreme(String namenOpreme) {
        this.namenOpreme = namenOpreme;
    }*/
}
