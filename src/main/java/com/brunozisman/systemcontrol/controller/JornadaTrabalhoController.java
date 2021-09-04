package com.brunozisman.systemcontrol.controller;

import com.brunozisman.systemcontrol.model.JornadaTrabalho;
import com.brunozisman.systemcontrol.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/journey")
public class JornadaTrabalhoController {

    @Autowired
    JourneyService journeyService;

    @PostMapping
    public JornadaTrabalho createJourney(@RequestBody JornadaTrabalho jornadaTrabalho){

        return journeyService.SaveJourney(jornadaTrabalho);
    }

    @PutMapping
    public JornadaTrabalho updateJourney(@RequestBody JornadaTrabalho jornadaTrabalho)
    {
        return journeyService.UpdateJourney(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJourneyList()
    {
        return journeyService.FindAll();
    }

    @GetMapping("/{journeyId}")
    public ResponseEntity<JornadaTrabalho> getJourneyById(@PathVariable("journeyId") Long journeyId) throws Exception {
        return ResponseEntity.ok(journeyService.GetById(journeyId).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @DeleteMapping("/{journeyId}")
    public ResponseEntity deleteByID(@PathVariable("journeyId") Long journeyId) throws Exception {
        try {
            journeyService.DeleteJourney(journeyId);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();

    }

}
