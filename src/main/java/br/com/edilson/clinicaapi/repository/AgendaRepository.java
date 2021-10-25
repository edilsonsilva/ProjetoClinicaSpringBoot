package br.com.edilson.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edilson.clinicaapi.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long>{

}
