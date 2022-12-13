package com.test.fastcare.service;

import com.test.fastcare.repository.ZdravstveniDelavecRepository;
import com.test.fastcare.vao.ZdravstveniDelavec;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ZdravstveniDelavecService {
    private final ZdravstveniDelavecRepository zdravstveniDelavecRepository;

    @Autowired
    public ZdravstveniDelavecService(ZdravstveniDelavecRepository zdravstveniDelavecRepository) {
        this.zdravstveniDelavecRepository = zdravstveniDelavecRepository;
    }

    public List<ZdravstveniDelavec> getAll() {
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

    /*@Transactional
    public void updateZdravstveniDelavec(long id_zd, String ime, String urgenca) {
        ZdravstveniDelavec zdravstveniDelavec = zdravstveniDelavecRepository.findById(id_zd).orElseThrow(() -> new IllegalStateException("Zdravstvenega delavca s id-jem: " + id_zd + " ni!"));

        if (ime != null && ime.length() > 0 && !Objects.equals(zdravstveniDelavec.getIme(), ime)){
            zdravstveniDelavec.setIme(ime);
        }

        if(urgenca != null && urgenca.length() > 0 && !Objects.equals(zdravstveniDelavec.getUrgenca(), urgenca)){
            Optional<ZdravstveniDelavec> zdravstveniDelavecOptional = zdravstveniDelavecRepository.findZdravstveniDelavecByUrgenca(urgenca);
            if(zdravstveniDelavecOptional.isPresent()){
                throw new IllegalStateException("Ta urgenca je ze dodeljena!");
            }
            zdravstveniDelavec.setUrgenca(urgenca);
        }else{
            throw new IllegalStateException("Neveljaven vnos idk");
        }
    }*/

    public void deleteZdravstveniDelavec(long id_zd) {
        zdravstveniDelavecRepository.deleteById(id_zd);
    }
}
