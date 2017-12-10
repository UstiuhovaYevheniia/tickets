package edu.karazin.tickets.model;

import java.util.Collection;
import java.util.HashSet;

public class Node {
    private final String name;
    private final Collection<Edge> connections = new HashSet<>();

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Collection<Edge> getConnections() {
        return connections;
    }

    public void addConnection(Edge connection) {
        connections.add(connection);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;

        Node node = (Node) o;

        return getName().equals(node.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
