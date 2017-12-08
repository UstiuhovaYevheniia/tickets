package edu.karazin.tickets.repository;

import edu.karazin.tickets.model.Train;
import org.springframework.data.repository.CrudRepository;

public interface TrainRepository extends CrudRepository<Train, Long> {

//    Iterable<Train> getAllByFromAndAndDestination(String fromCity, String destination);
}
