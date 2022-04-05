package com.professorangoti.querycreation.controller;

import java.util.List;

import com.professorangoti.querycreation.model.Venda;
import com.professorangoti.querycreation.service.VendaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("venda")
public class VendaController {

    @Autowired
    VendaService service;

    @GetMapping("a")
    List<Venda> exa() {
        return service.a();
    }
}
