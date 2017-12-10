package edu.karazin.tickets.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapOfUkraine {

	private static final Logger log = LoggerFactory.getLogger(MapOfUkraine.class);

	public static final Graph UA = new Graph();


	static {
		createMap();
	}

	private static void createMap() {
		try {
			FileReader fileReader = new FileReader(new File(MapOfUkraine.class.getClassLoader().getResource("map.txt").getFile()));
			BufferedReader reader = new BufferedReader(fileReader);
			Set<Node> nodeSet = new HashSet<>();
			Map<String, Node> nodes = new HashMap<>();
			reader.lines().forEach(str -> {
				String[] line = str.split(" ");
				Node from = new Node(line[0]);
				Node to = new Node(line[1]);
				if (nodeSet.contains(from)) {
					from = nodes.get(from.getName());
				} else {
					nodes.put(from.getName(), from);
				}
				if (nodeSet.contains(to)) {
					to = nodes.get(to.getName());
				} else {
					nodes.put(to.getName(), to);
				}
				Edge.connect(from, to, Integer.parseInt(line[2]));
				nodeSet.add(from);
				nodeSet.add(to);
			});
			nodeSet.stream().forEach(node -> UA.getNodes().add(node));
		} catch (FileNotFoundException e) {
			log.error("File with map didnt find");
		}
	}

	public static void main(String[] args) {
		System.out.println();
	}
}
