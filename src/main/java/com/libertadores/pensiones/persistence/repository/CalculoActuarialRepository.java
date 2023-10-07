package com.libertadores.pensiones.persistence.repository;

import com.libertadores.pensiones.persistence.entity.CalculoActuarialEntity;
import com.libertadores.pensiones.persistence.entity.EmpleadorEntity;
import com.libertadores.pensiones.persistence.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CalculoActuarialRepository extends JpaRepository<CalculoActuarialEntity, Integer> {
    CalculoActuarialEntity findAllByIdCalculo(Integer idCalculo);

}
