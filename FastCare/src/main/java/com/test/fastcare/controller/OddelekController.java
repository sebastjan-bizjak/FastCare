package com.test.fastcare.controller;

import com.test.fastcare.repository.OddelekRepository;
import com.test.fastcare.service.OddelekService;
import com.test.fastcare.vao.Oddelek;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping(path = "/oddelek")
public class OddelekController {

    @Autowired
    private final OddelekService oddelekService;
    private OddelekRepository oddelekRepository;

    public OddelekController(OddelekService oddelekService, OddelekRepository oddelekRepository) {
        this.oddelekService = oddelekService;
        this.oddelekRepository = oddelekRepository;
    }

    @GetMapping(path = "/get")
    public List<Oddelek> getAll() {
        return oddelekService.getAll();
    }

    @PostMapping(path = "/dodajOddelek")
    public void dodajOddelek(@RequestBody Oddelek oddelek) {
        oddelekService.addNewoddelek(oddelek);
    }

    @GetMapping("/oddelek-2parm/{ImeOdd},{namen}")
    public Iterable<Oddelek> vrniOddelekpoNamenuImenu(@PathVariable String ImeOdd, @PathVariable String namen) {
        return oddelekRepository.vrniOddelekpoNamenuImenu(ImeOdd, namen);
    }
}