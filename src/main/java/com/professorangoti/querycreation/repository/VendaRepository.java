package com.professorangoti.querycreation.repository;

import java.util.List;

import com.professorangoti.querycreation.model.Venda;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends CrudRepository<Venda, Integer> {

    // a- Retorna todos os itens que foram vendidos sem desconto.
    public List<Venda> findByDesconto(Integer desconto);
    // b- Retorna todos os itens que foram vendidos com desconto.
    // c- Retorna todos os itens e ordene o resultado do maior valor para o menor.
    // d- Retorna o produto que mais vendeu.
    // e- Consulte as NF que foram vendidas mais de 10 unidades de pelo menos um produto.
    // f- Pesquise o valor total das NF, onde esse valor seja maior que 500, e ordene o resultado do maior valor para o menor.

}
