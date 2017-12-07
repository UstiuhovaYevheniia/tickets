package edu.karazin.tickets.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("trains")
public class TrainsController {

    @RequestMapping(method = RequestMethod.GET)
    public String listTrains(Model model,
                             @RequestParam(name = "searchText", required = false) String searchText) {
        return "trains";
    }
}
