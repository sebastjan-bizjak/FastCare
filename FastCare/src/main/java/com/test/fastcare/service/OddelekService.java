package com.test.fastcare.service;
import com.test.fastcare.repository.OddelekRepository;
import com.test.fastcare.vao.Oddelek;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OddelekService {
    private final OddelekRepository OddelekRepository;

    @Autowired
    public OddelekService(OddelekRepository oddelekRepository) {
        this.OddelekRepository = oddelekRepository;
    }

    public List<Oddelek> getAll() {
        return OddelekRepository.findAll();
    }

    public void addNewoddelek(Oddelek oddelek) {
        OddelekRepository.save(oddelek);
    }
}