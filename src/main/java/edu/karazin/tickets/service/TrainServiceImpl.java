package edu.karazin.tickets.service;

import edu.karazin.tickets.model.Train;
import edu.karazin.tickets.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    private TrainRepository repository;

    public TrainServiceImpl(@Autowired TrainRepository crudRepo) {
        this.repository = crudRepo;
    }

    @Override
    public Train getTrain(Long id) {
        return null;
    }


    @Override
    public List<Train> searchTrains(String fromCity, String destination) {
        List<Train> trains = new LinkedList<>();
        if ((fromCity == null || fromCity.isEmpty()) &&
                (destination == null || destination.isEmpty())) {
            repository.findAll().forEach(trains::add);
        }
//        repository.getAllByFromAndAndDestination(fromCity, destination);
        return trains;
    }

    @Override
    public Long addTrain(Train train) {
        return null;
    }

    @Override
    public void updateTrain(Train train) {

    }

    @Override
    public void deleteTrain(Long id) {

    }
}
