package com.test.fastcare.controller;

import com.test.fastcare.service.OpremaService;
import com.test.fastcare.vao.Oprema;
import com.test.fastcare.vao.ZdravstveniDelavec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/oprema")
public class OpremaController {
    private final OpremaService opremaService;

    @Autowired
    public OpremaController(OpremaService opremaService) {
        this.opremaService = opremaService;
    }

    @GetMapping(path = "/get")
    public List<Oprema> getAll() {
        return opremaService.getAll();
    }

    @PostMapping(path = "/dodajopremo")
    public void dodajOpremo(@RequestBody Oprema oprema) {
        opremaService.addNewOprema(oprema);
    }
}
