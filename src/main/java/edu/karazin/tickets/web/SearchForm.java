package edu.karazin.tickets.web;

public class SearchForm {

	private String searchText;

	public SearchForm() {
	}

	public SearchForm(String searchText) {
		this.searchText = searchText;
	}

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}
}
