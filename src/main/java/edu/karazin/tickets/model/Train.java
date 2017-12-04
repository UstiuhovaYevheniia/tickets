package edu.karazin.tickets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Train {

    @Id
    @GeneratedValue
    private int id;

    private String fromCity;

    private String destination;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return fromCity;
    }

    public void setFrom(String from) {
        this.fromCity = from;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return id == train.id &&
                Objects.equals(fromCity, train.fromCity) &&
                Objects.equals(destination, train.destination);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, fromCity, destination);
    }
}
