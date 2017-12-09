package edu.karazin.tickets.repository;

import edu.karazin.tickets.model.Train;
import org.springframework.data.repository.CrudRepository;

public interface TrainRepository extends CrudRepository<Train, Long> {

    Iterable<Train> getAllByFromCityAndDestination(String fromCity, String destination);
}
