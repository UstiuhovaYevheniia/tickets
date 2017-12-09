package edu.karazin.tickets.web;

public class TrainsSearchForm {

    private String searchText;

    public TrainsSearchForm(String searchText) {
        this.searchText = searchText;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }
}
