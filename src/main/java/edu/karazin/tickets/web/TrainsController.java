package edu.karazin.tickets.web;


import edu.karazin.tickets.service.TrainService;
import edu.karazin.tickets.service.TrainServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("trains")
public class TrainsController {

    private final TrainService trainService;

    public TrainsController(@Autowired TrainService trainService) {
        this.trainService = trainService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String listTrains() {
        return "trains";
    }
}
