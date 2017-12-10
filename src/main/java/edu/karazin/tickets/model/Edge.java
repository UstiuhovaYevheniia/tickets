package edu.karazin.tickets.model;

public class Edge {

    private final Node start;
    private final Node end;
    private final int length;

    private Edge(Node start, Node end, int length) {
        this.start = start;
        this.end = end;
        this.length = length;
    }

    public static void connect(Node start, Node end, int length) {
        start.addConnection(new Edge(start, end, length));
        end.addConnection(new Edge(end, start, length));
    }

    public Node getStart() {
        return start;
    }

    public Node getEnd() {
        return end;
    }

    public int getLength() {
        return length;
    }
}
