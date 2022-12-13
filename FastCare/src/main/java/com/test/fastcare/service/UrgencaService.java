package com.test.fastcare.service;

import com.test.fastcare.repository.UrgencaRepository;
import com.test.fastcare.vao.Urgenca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UrgencaService {
    private final UrgencaRepository urgencaRepository;

    @Autowired
    public UrgencaService(UrgencaRepository opremaRepository) {
        this.urgencaRepository = opremaRepository;
    }

    public Optional<Urgenca> getid_urgenca(long id_urgenca) {
        return urgencaRepository.findById(id_urgenca);
    }

    public List<Urgenca> getAll() {
        return urgencaRepository.findAll();
    }

    public void addNewUrgenca(Urgenca urgenca) {
        urgencaRepository.save(urgenca);
    }

    public void deleteUrgenca(long id_urgenca) {
        urgencaRepository.deleteById(id_urgenca);
    }

    public Urgenca posodobiUrgenco(long urgenca_id, Urgenca urgenca) {
        urgenca.setId_urgenca(urgenca_id);
        return urgencaRepository.save(urgenca);
    }
}
