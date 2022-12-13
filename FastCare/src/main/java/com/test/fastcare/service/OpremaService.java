package com.test.fastcare.service;

import com.test.fastcare.repository.OpremaRepository;
import com.test.fastcare.vao.Oprema;
import com.test.fastcare.vao.ZdravstveniDelavec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public void addNewOprema(Oprema oprema) {
        opremaRepository.save(oprema);
    }
}
