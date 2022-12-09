package com.fastcare.FastCare.vao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Soba{
    @Override
    public String toString(){
        return "Soba=[ id= "+ id +"]"

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Oprema[] oprema;

    public Soba(int id){
        this.id = id

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Oprema[] getOprema() {
        return oprema;
    }

    public void setOprema(Oprema[] oprema) {
        this.oprema = oprema;
    }
}
