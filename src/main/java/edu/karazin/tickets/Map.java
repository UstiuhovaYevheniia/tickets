package edu.karazin.tickets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Map {

	public static final Graph UA = new Graph();

	static {
		// Map points
		Node kiev = new Node("Kiev");
		Node chernihiv = new Node("Chernihiv");
		Node lubny = new Node("Lubny");
		Node uman = new Node("Uman");
		Node zhytomyr = new Node("Zhytomyr");
		// TODO: add other points

		// Edges between map points
		Edge.connect(kiev, chernihiv, 110);
		Edge.connect(kiev, lubny, 160);
		Edge.connect(kiev, uman, 200);
		Edge.connect(kiev, zhytomyr, 140);
		// TODO: add other connects

		// full graph
		UA.getNodes().add(kiev);
		UA.getNodes().add(chernihiv);
		UA.getNodes().add(lubny);
		UA.getNodes().add(uman);
		UA.getNodes().add(zhytomyr);
		// TODO: ...
	}

	public static class Graph {
		private final Collection<Node> nodes = new HashSet<>();

		public Collection<Node> getNodes() {
			return nodes;
		}
	}

	public static class Node {
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
		public int hashCode() {
			TODO
		}

		@Override
		public boolean equals(Object obj) {
			TODO
		}
	}

	public static class Edge {
		private final Node start;
		private final Node end;
		private final int length;

		private Edge(Node start, Node end, int length) {
			this.start = start;
			this.end = end;
			this.length = length;

			start.addConnection(this);
			end.addConnection(this);
		}

		public static Edge connect(Node start, Node end, int length) {
			Edge e = new Edge(start, end, length);
			start.addConnection(e);
			end.addConnection(e);
			return e;
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

		@Override
		public int hashCode() {
			TODO
		}

		@Override
		public boolean equals(Object obj) {
			TODO
		}
	}
}
