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

	@SuppressWarnings("unchecked")
 	private static final List<Train> TRAINS = new ArrayList() {{
        			add(new Train("Kharkiv", "Vilnyus"));
        			add(new Train("Kyiv", "Kharkiv"));
        	}};


    @Override
    public List<Train> searchTrains(String searchText) {
        System.out.println("\nTrainServiceImpl.searchTrains\n");
        System.out.println(TRAINS);
        System.out.println("Repository: " + repository.count());
        List<Train> trains = new LinkedList<>();
        if (searchText == null || searchText.isEmpty()) {
            repository.findAll().forEach(trains::add);
        }
        System.out.println(trains);
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
