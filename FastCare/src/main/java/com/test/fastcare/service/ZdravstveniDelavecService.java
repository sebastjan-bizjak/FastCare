package com.test.fastcare.service;

import com.test.fastcare.repository.ZdravstveniDelavecRepository;
import com.test.fastcare.vao.ZdravstveniDelavec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ZdravstveniDelavecService {
    private final ZdravstveniDelavecRepository zdravstveniDelavecRepository;

    @Autowired
    public ZdravstveniDelavecService(ZdravstveniDelavecRepository zdravstveniDelavecRepository) {
        this.zdravstveniDelavecRepository = zdravstveniDelavecRepository;
    }

    public Iterable<ZdravstveniDelavec> getAll() {
        return zdravstveniDelavecRepository.findAll();
    }

    public Optional<ZdravstveniDelavec> getid_zd(long id_zd) {
        return zdravstveniDelavecRepository.findById(id_zd);
    }

    public void addNewZdravstveniDelavec(ZdravstveniDelavec zdravstveniDelavec) {
        zdravstveniDelavecRepository.save(zdravstveniDelavec);
    }

    public ZdravstveniDelavec posodobiZdravstvenegaDelavca(long id_zd, ZdravstveniDelavec zdravstveniDelavec) {
        zdravstveniDelavec.setId_zd(id_zd);
        return zdravstveniDelavecRepository.save(zdravstveniDelavec);
    }

    public void deleteZdravstveniDelavec(long id_zd) {
        zdravstveniDelavecRepository.deleteById(id_zd);
    }
}
