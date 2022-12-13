package com.test.fastcare.controller;

import com.test.fastcare.service.OddelekService;
import com.test.fastcare.vao.Oddelek;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/oddelek")
public class OddelekController {
    private final OddelekService oddelekService;

    @Autowired
    public OddelekController(OddelekService oddelekService) {
        this.oddelekService = oddelekService;
    }

    @GetMapping(path = "/get")
    public List<Oddelek> getAll() {
        return oddelekService.getAll();
    }

    @PostMapping(path = "/dodajoddelek")
    public void dodajOddelek(@RequestBody Oddelek oddelek) {
        oddelekService.addNewoddelek(oddelek);
    }
}