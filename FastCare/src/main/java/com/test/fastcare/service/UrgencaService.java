package com.test.fastcare.service;

import com.test.fastcare.repository.UrgencaRepository;
import com.test.fastcare.vao.Urgenca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UrgencaService {
    private final UrgencaRepository urgencaRepository;

    @Autowired
    public UrgencaService(UrgencaRepository opremaRepository) {
        this.urgencaRepository = opremaRepository;
    }

    public List<Urgenca> getAll() {
        return urgencaRepository.findAll();
    }

    public void addNewOprema(Urgenca urgenca) {
        urgencaRepository.save(urgenca);
    }
}
