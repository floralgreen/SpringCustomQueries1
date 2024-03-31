package esercizio.SpringCustomQueries1.repositories;

import esercizio.SpringCustomQueries1.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
