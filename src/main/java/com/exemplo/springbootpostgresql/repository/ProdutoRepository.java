package com.exemplo.springdatapostgres.repository;

import com.exemplo.springdatapostgres.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // O JpaRepository já fornece métodos CRUD básicos
}
