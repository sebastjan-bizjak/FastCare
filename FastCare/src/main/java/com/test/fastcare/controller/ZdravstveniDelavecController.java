package com.test.fastcare.controller;

import com.test.fastcare.repository.ZdravstveniDelavecRepository;
import com.test.fastcare.service.ZdravstveniDelavecService;
import com.test.fastcare.vao.ZdravstveniDelavec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/zdravstvenidelavci")
public class ZdravstveniDelavecController {
    private final ZdravstveniDelavecService zdravstveniDelavecService;

    @Autowired
    public ZdravstveniDelavecController(ZdravstveniDelavecService zdravstveniDelavecService) {
        this.zdravstveniDelavecService = zdravstveniDelavecService;
    }

    @Autowired
    private ZdravstveniDelavecRepository zdravstveniDelavecDao;

    @GetMapping(path = "/get")
    public Iterable<ZdravstveniDelavec> getAll() {
        return zdravstveniDelavecService.getAll();
    }

    @GetMapping(path ="/get/{id_zd}")
    public Optional<ZdravstveniDelavec> getid_zd(@PathVariable("id_zd") long id_zd) {
        return zdravstveniDelavecService.getid_zd(id_zd);
    }

    @GetMapping("/{oddelek}/{urgenca}")
    public Iterable<ZdravstveniDelavec> oddelekInUrgenca(@PathVariable("oddelek") String oddelek, @PathVariable("urgenca") String urgenca) {
        return zdravstveniDelavecDao.oddelekInUrgenca(oddelek, urgenca);
    }

    @PostMapping(path = "/dodajzdravstvenegadelavca")
    public void dodajZdravstvenegaDelavca(@RequestBody ZdravstveniDelavec zdravstveniDelavec) {
        zdravstveniDelavecService.addNewZdravstveniDelavec(zdravstveniDelavec);
    }

    @PutMapping(path = "/get/{id_zd}")
    public ZdravstveniDelavec posodobiZdravstvenegaDelavca(@PathVariable("id_zd") long id_zd, @RequestBody ZdravstveniDelavec zdravstveniDelavec) {
        return zdravstveniDelavecService.posodobiZdravstvenegaDelavca(id_zd, zdravstveniDelavec);
    }

    @DeleteMapping(path = "/get/{id_zd}")
    public void brisiZdravstvenegaDelavca(@PathVariable("id_zd") long id_zd) {
        zdravstveniDelavecService.deleteZdravstveniDelavec(id_zd);
    }
}
