package edu.karazin.tickets.model;

import java.util.Collection;
import java.util.HashSet;

public class Graph {

    private final Collection<Node> nodes = new HashSet<>();

    public Collection<Node> getNodes() {
        return nodes;
    }
}
