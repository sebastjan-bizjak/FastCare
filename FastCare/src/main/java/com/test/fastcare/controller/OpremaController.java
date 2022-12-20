package com.test.fastcare.controller;

import com.test.fastcare.service.OpremaService;
import com.test.fastcare.vao.Oprema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping(path ="/get/{id_oprema}")
    public Optional<Oprema> getid_oprema(@PathVariable("id_oprema") long id_oprema) {
        return opremaService.getid_oprema(id_oprema);
    }

    @PostMapping(path = "/dodajopremo")
    public void dodajOpremo(@RequestBody Oprema oprema) {
        opremaService.addNewOprema(oprema);
    }

    @PutMapping(path = "/get/{id_oprema}")
    public Oprema posodobiOpremo(@PathVariable("id_oprema") long id_oprema, @RequestBody Oprema oprema) {
        return opremaService.posodobiOpremo(id_oprema, oprema);
    }

    @DeleteMapping(path = "/get/{id_oprema}")
    public void brisiOpremo(@PathVariable("id_oprema") long id_oprema) {
        opremaService.deleteOprema(id_oprema);
    }
}
