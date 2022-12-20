package com.test.fastcare.service;

import com.test.fastcare.repository.OpremaRepository;
import com.test.fastcare.vao.Oprema;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Objects;

@Service
public class OpremaService {
    private final OpremaRepository opremaRepository;

    @Autowired
    public OpremaService(OpremaRepository opremaRepository) {
        this.opremaRepository = opremaRepository;
    }

    public List<Oprema> getAll() {
        return opremaRepository.findAll();
    }

    public Optional<Oprema> getid_oprema(long id_oprema) {
        return opremaRepository.findById(id_oprema);
    }

    public void addNewOprema(Oprema oprema) {
        opremaRepository.save(oprema);
    }

    public Oprema posodobiOpremo(long id_oprema, Oprema oprema) {
        oprema.setId_oprema(id_oprema);
        return opremaRepository.save(oprema);
    }

    public void deleteOprema(long id_oprema) {
        opremaRepository.deleteById(id_oprema);
    }
}
