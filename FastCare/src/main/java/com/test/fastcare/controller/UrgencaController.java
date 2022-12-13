package com.test.fastcare.controller;

import com.test.fastcare.service.UrgencaService;
import com.test.fastcare.vao.Urgenca;
import com.test.fastcare.vao.ZdravstveniDelavec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/urgenca")

public class UrgencaController {

        private final UrgencaService urgencaService;

        @Autowired
        public UrgencaController(UrgencaService urgencaService) {
            this.urgencaService = urgencaService;
        }

        @GetMapping(path = "/get")
        public List<Urgenca> getAll() {
            return urgencaService.getAll();
        }

        @GetMapping(path ="/get/{id_urgenca}")
        public Optional<Urgenca> getid_urgenca(@PathVariable("id_urgenca") long id_urgenca) {
            return UrgencaService.getid_urgenca(id_urgenca);
        }

        @PostMapping(path = "/dodajUrgenca")
        public void dodajUrgenca(@RequestBody Urgenca urgenca) {
            urgencaService.addNewUrgenca(urgenca);
        }

        @DeleteMapping(path = "/delete/{id_urgenca}")
        public void brisiUrgenco(@PathVariable("id_urgenca") long id_urgenca) {
            UrgencaService.deleteUrgenca(id_urgenca);
        }

        @PutMapping(path = "/put/{id_urgenca}")
        public Urgenca posodobiUrgenco(@PathVariable("id_zd") long id_urgenca, @RequestBody Urgenca urgenca) {
            return UrgencaService.posodobiUrgenco(id_urgenca, urgenca);
        }

}
