package edu.karazin.tickets.web;


import edu.karazin.tickets.service.TrainService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("trains")
public class TrainsController {

    private static final Logger log = LoggerFactory.getLogger(TrainsController.class);

    private final TrainService trainService;

    public TrainsController(@Autowired TrainService trainService) {
        this.trainService = trainService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String listTrains(Model model,
                             @RequestParam(name = "searchText", required = false) String searchText) {
        log.info("get all trains list");
        model.addAttribute("trains", trainService.searchTrains(null));
        model.addAttribute("searchForm", new TrainsSearchForm(searchText));
        return "trains";
    }
}
