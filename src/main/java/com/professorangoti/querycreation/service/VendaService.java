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
        return repository.findByDescontoNull();
    }
    public List<Venda> b() {
        return repository.findByDescontoNotNull();
    }
    public List<Venda> c() {
        return repository.findByOrderByValorUnitario();
    }
    public Venda d() {
        return repository.findTopByOrderByQuantidadeDesc();
    }
    public List<Venda> e() {
        return repository.findByQuantidadeGreaterThanEqual(10);
    }
    public List<Integer> f() {
        return repository.findByNotaFiscalAcimaDe500();
    }

}
