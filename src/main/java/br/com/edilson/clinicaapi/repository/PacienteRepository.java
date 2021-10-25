package br.com.edilson.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edilson.clinicaapi.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
