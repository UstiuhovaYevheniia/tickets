package edu.karazin.tickets.service;

import edu.karazin.tickets.model.Train;
import edu.karazin.tickets.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    private TrainRepository repository;

    public TrainServiceImpl(@Autowired TrainRepository dao) {
        this.repository = dao;
    }

    @Override
    public Train getTrain(Long id) {
        return null;
    }

    @Override
    public List<Train> searchTrains(String searchText) {
        return null;
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
