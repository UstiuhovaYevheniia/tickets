package edu.karazin.tickets.web;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("search")
public class SearchController {

	private static final Logger log = LoggerFactory.getLogger(SearchController.class);

	@RequestMapping(method = RequestMethod.GET)
	public String listProducts(Model model) {
		log.info("Render from");
		model.addAttribute("results", Collections.emptyList());
		model.addAttribute("searchForm", new SearchForm());
		return "search-results";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String searchProducts(Model model,
			@ModelAttribute("searchForm") SearchForm form) {
		log.info("Search trains with {}", form.getSearchText());
		model.addAttribute("results", Collections.emptyList());
		return "search-results";
	}
}
