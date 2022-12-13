package com.test.fastcare.controller;

import com.test.fastcare.service.ZdravstveniDelavecService;
import com.test.fastcare.vao.ZdravstveniDelavec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/zdravstvenidelavci")
public class ZdravstveniDelavecController {
    private final ZdravstveniDelavecService zdravstveniDelavecService;

    @Autowired
    public ZdravstveniDelavecController(ZdravstveniDelavecService zdravstveniDelavecService) {
        this.zdravstveniDelavecService = zdravstveniDelavecService;
    }

    @GetMapping(path = "/get")
    public List<ZdravstveniDelavec> getAll() {
        return zdravstveniDelavecService.getAll();
    }

    @GetMapping(path ="/get/{id_zd}")
    public Optional<ZdravstveniDelavec> getid_zd(@PathVariable("id_zd") long id_zd) {
        return zdravstveniDelavecService.getid_zd(id_zd);
    }

    @PostMapping(path = "/dodajzdravstvenegadelavca")
    public void dodajZdravstvenegaDelavca(@RequestBody ZdravstveniDelavec zdravstveniDelavec) {
        zdravstveniDelavecService.addNewZdravstveniDelavec(zdravstveniDelavec);
    }

    @PutMapping(path = "/get/{id_zd}")
    public ZdravstveniDelavec posodobiZdravstvenegaDelavca(@PathVariable("id_zd") long id_zd, @RequestBody ZdravstveniDelavec zdravstveniDelavec) {
        return zdravstveniDelavecService.posodobiZdravstvenegaDelavca(id_zd, zdravstveniDelavec);
    }
    /*public void posodobiZdravstvenegaDelavca(@PathVariable("id_zd") long id_zd, @RequestParam(required = false) String ime, @RequestParam(required = false) String urgenca) {
        zdravstveniDelavecService.updateZdravstveniDelavec(id_zd, ime, urgenca);
    }*/

    @DeleteMapping(path = "/get/{id_zd}")
    public void brisiZdravstvenegaDelavca(@PathVariable("id_zd") long id_zd) {
        zdravstveniDelavecService.deleteZdravstveniDelavec(id_zd);
    }
}
