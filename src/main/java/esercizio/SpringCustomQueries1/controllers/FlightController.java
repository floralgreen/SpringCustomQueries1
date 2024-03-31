package esercizio.SpringCustomQueries1.controllers;

import esercizio.SpringCustomQueries1.entities.Flight;
import esercizio.SpringCustomQueries1.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @PostMapping("/prov")
    public ResponseEntity<List<Flight>> provisionFlights(){
        List<Flight> flightsCreated = flightService.provisionFlights();
        return ResponseEntity.ok(flightsCreated);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Flight>> allFlights(){
        List<Flight> flightsCreated = flightService.getAllFlights();
        if (flightsCreated.isEmpty()){
            ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(flightsCreated);
    }



}
