package edu.karazin.tickets.service;

import edu.karazin.tickets.model.Train;

import java.util.List;

public interface TrainService {

    Train getTrain(Long id);

    List<Train> searchTrains(String searchText);

    Long addTrain(Train train);

    void updateTrain(Train train);

    void deleteTrain(Long id);
}
