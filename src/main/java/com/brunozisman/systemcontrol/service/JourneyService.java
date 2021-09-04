package com.brunozisman.systemcontrol.service;

import com.brunozisman.systemcontrol.model.JornadaTrabalho;
import com.brunozisman.systemcontrol.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JourneyService {

    JourneyRepository journeyRepository;

    @Autowired
    public JourneyService(JourneyRepository journeyRepository) {
        this.journeyRepository = journeyRepository;
    }

    public JornadaTrabalho SaveJourney(JornadaTrabalho jornadaTrabalho) {
        return journeyRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> FindAll() {
        return journeyRepository.findAll();
    }

    public Optional<JornadaTrabalho> GetById(Long idJornada) {
        return journeyRepository.findById(idJornada);
    }

    public JornadaTrabalho UpdateJourney(JornadaTrabalho jornadaTrabalho){
        return journeyRepository.save(jornadaTrabalho);

    }

    public void DeleteJourney(Long idJornada) {
        journeyRepository.deleteById(idJornada);
    }
}
