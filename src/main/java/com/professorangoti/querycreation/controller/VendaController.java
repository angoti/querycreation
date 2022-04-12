package com.professorangoti.querycreation.controller;

import java.util.List;

import com.professorangoti.querycreation.model.Venda;
import com.professorangoti.querycreation.service.VendaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("venda")
public class VendaController {

    @Autowired
    VendaService service;

    @GetMapping("a")
    ResponseEntity<List<Venda>> exa() {
        return ResponseEntity.status(HttpStatus.OK).body(service.a());
    }

    @GetMapping("b")
    ResponseEntity<List<Venda>> exb() {
        return ResponseEntity.status(HttpStatus.OK).body(service.b());
    }

    @GetMapping("c")
    ResponseEntity<List<Venda>> exc() {
        return ResponseEntity.status(HttpStatus.OK).body(service.c());
    }

    @GetMapping("d")
    ResponseEntity<Venda> exd() {
        return ResponseEntity.status(HttpStatus.OK).body(service.d());
    }

    @GetMapping("e")
    ResponseEntity<List<Venda>> exe() {
        return ResponseEntity.status(HttpStatus.OK).body(service.e());
    }

    @GetMapping("f")
    ResponseEntity<List<Integer>> exf() {
        return ResponseEntity.status(HttpStatus.OK).body(service.f());
    }

}
