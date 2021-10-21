package br.com.edilson.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edilson.clinicaapi.model.Cliente;

public interface DadosRepository extends JpaRepository<Cliente, Long>{

}

