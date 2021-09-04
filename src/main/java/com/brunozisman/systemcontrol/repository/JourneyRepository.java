package com.brunozisman.systemcontrol.repository;

import com.brunozisman.systemcontrol.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneyRepository extends JpaRepository<JornadaTrabalho, Long> {
}
