package br.com.edilson.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edilson.clinicaapi.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long>{

}
