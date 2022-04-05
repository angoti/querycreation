package com.professorangoti.querycreation.service;

import java.util.List;

import com.professorangoti.querycreation.model.Venda;
import com.professorangoti.querycreation.repository.VendaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {

    @Autowired
    VendaRepository repository;

    public List<Venda> a() {
        return repository.findByDesconto(0);
    }

}
