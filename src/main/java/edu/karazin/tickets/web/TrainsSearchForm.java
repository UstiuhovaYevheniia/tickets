package edu.karazin.tickets.web;

public class TrainsSearchForm {

    private String fromCity;
    private String destination;

    public TrainsSearchForm() {
    }

    public TrainsSearchForm(String fromCity, String destination) {
        this.fromCity = fromCity;
        this.destination = destination;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
