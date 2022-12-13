package com.test.fastcare.controller;

import com.test.fastcare.service.UrgencaService;
import com.test.fastcare.vao.Urgenca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

        @PostMapping(path = "/dodajopremo")
        public void dodajOpremo(@RequestBody Urgenca oprema) {
            urgencaService.addNewOprema(oprema);
        }

}
