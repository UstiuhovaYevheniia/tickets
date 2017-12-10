package edu.karazin.tickets.web;


import edu.karazin.tickets.service.TrainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;

@Controller
@RequestMapping("trains")
public class TrainsController {

    private static final Logger log = LoggerFactory.getLogger(TrainsController.class);

    private final TrainService trainService;

    public TrainsController(@Autowired TrainService trainService) {
        this.trainService = trainService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String listTrains(Model model, @RequestParam(name = "fromCity", required = false) String fromCity,
                             @RequestParam(name = "destination", required = false) String destination) {
        log.info("get all trains list");
        model.addAttribute("trainsSearchForm", new TrainsSearchForm(fromCity, destination));
        model.addAttribute("trains", trainService.searchTrains(null, null));
        return "trains";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String searchTrains(Model model,
                               @ModelAttribute("trainsSearchForm") TrainsSearchForm form) {
        log.info("get trains list");
        model.addAttribute("trainsSearchForm", new TrainsSearchForm(form.getFromCity(), form.getDestination()));
        model.addAttribute("trains", Collections.emptyList());
        return "trains";
    }
}
