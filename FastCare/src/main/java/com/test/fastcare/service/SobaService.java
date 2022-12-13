package com.test.fastcare.service;

import com.test.fastcare.repository.SobaRepository;
import com.test.fastcare.vao.Soba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SobaService {
    private final SobaRepository SobaRepository;

    @Autowired
    public SobaService(SobaRepository sobaRepository) {
        this.SobaRepository = sobaRepository;
    }

    public List<Soba> getAll() {
        return SobaRepository.findAll();
    }

    public void addNewSoba(Soba soba) {
        SobaRepository.save(soba);
    }
}
