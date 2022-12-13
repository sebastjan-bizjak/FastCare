package com.test.fastcare.controller;

import com.test.fastcare.service.SobaService;
import com.test.fastcare.vao.Soba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/soba")
public class SobaController {
    private final SobaService SobaService;

    @Autowired
    public SobaController(SobaService sobaService) {
        this.SobaService = sobaService;
    }

    @GetMapping(path = "/get")
    public List<Soba> getAll() {
        return SobaService.getAll();
    }

    @PostMapping(path = "/dodajSoba")
    public void dodajSoba(@RequestBody Soba Soba) {
        SobaService.addNewSoba(Soba);
    }
}