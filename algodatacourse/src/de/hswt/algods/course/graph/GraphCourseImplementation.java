package de.hswt.algods.course.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import de.hswt.algods.graph.core.Edge;
import de.hswt.algods.graph.core.GraphNode;
import de.hswt.algods.graph.core.GraphServiceProvider;
import de.hswt.atp.core.annotations.ServiceImplementation;

/**
 * 
 * @author Frank Lesske
 * @author Christopher Hartmann
 * 
 *         All code (©) 2012 University of applied sciences
 *         Weihenstephan-Triesdorf. All rights reserved.
 */
@ServiceImplementation(id = "de.hswt.algo.graph.GraphCourseImplementation", name = "Course implementation", position = 1)
public class GraphCourseImplementation extends GraphServiceProvider {

	private int maxDist = GraphNode.MAXVALUELEVEL;

	private List<GraphNode> nodes; 	// der Graph als Knoten dargestellt
	private List<Edge> edges; 		// der Graph als Kanten dargestellt

	public int zeit = 0; // wird fuer Depth-First benoetigt

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hswt.algo.graph.core.GraphServiceProvider#breadthFirst(de.hswt.algo
	 * .graph.core.GraphNode)
	 */
	@Override
	public void breadthFirst(GraphNode start) {
		// 1. Initialisierung der Knoten (ohne start) TODO
		Iterator<GraphNode> iterator = nodes.iterator();
		while (iterator.hasNext()) {
			GraphNode node = iterator.next();
			if (node != start) {
				node.setStatus(GraphNode.NOTVISITED);
				node.setDistance(maxDist);
				node.setPredecessor(null);
			}

		}

		// 2. Initialisierung von start TODO
		start.setStatus(GraphNode.ACTIVE);
		start.setDistance(0);

		// 3. Initialisierung einer Warteschlange: TODO

		waitForNextStep(); // Pause nach den Initialierungsschritten

		// 4. Durchlaufen aller Knoten: TODO

		waitForNextStep(); // Pause am Ende des Algorithmus

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hswt.algo.graph.core.GraphServiceProvider#depthFirst(de.hswt.algo.
	 * graph.core.GraphNode)
	 */
	@Override
	public void depthFirst(GraphNode start) {
		// 1. Initialisierung TODO

		Iterator<GraphNode> iterator = nodes.iterator();
		while (iterator.hasNext()) {
			GraphNode node = iterator.next();
			if (node != start) {
				node.setStatus(GraphNode.NOTVISITED);
				node.setPredecessor(null);
				node.setBegin(-1);
				node.setEnd(-1);

			}
		}
		zeit = 0;

		waitForNextStep(); // Pause nach der Initialisierung

		// 2. Durchlaufen aller erreichbaren Knoten TODO

		waitForNextStep(); // Pause am Ende des Algorithmus
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hswt.algo.graph.core.GraphServiceProvider#dfsVisit(de.hswt.algo.graph
	 * .core.GraphNode)
	 */
	@Override
	protected void dfsVisit(GraphNode u) {
		// 1. Setzen der momentanen Attributwerte TODO

		waitForNextStep(); // Pause vor Besuchen der Nachfolger

		// 2. rekursives Besuchen der Nachfolger TODO

		// 3. Setzen der nun aktuellen Attributwerte TODO

		waitForNextStep(); // Pause am Ende des Schrittes
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hswt.algo.graph.core.GraphServiceProvider#dijkstra(de.hswt.algo.graph
	 * .core.GraphNode)
	 */
	@Override
	public void dijkstra(GraphNode start) {
		// 1. Initialisierung
		// Initialisierung der Queue
		List<GraphNode> queue = new LinkedList<GraphNode>();

		// Initialisierung der Knoten

		waitForNextStep(); // Pause nach der Initialisierung

		// 2. Durchlaufen der Schleifen TODO

		waitForNextStep(); // Pause am Ende des Algorithmus
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hswt.algo.graph.core.GraphServiceProvider#bellmanFord(de.hswt.algo
	 * .graph.core.GraphNode)
	 */
	@Override
	public void bellmanFord(GraphNode start) {
		// 1. Initialisierung TODO

		waitForNextStep(); // Pause nach der Initialisierung

		// Durchlaufen der Schleifen TODO

		waitForNextStep(); // Pause am Ende des Algorithmus
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hswt.algo.graph.core.GraphServiceProvider#floydWarshall(de.hswt.algo
	 * .graph.core.GraphNode)
	 */
	@Override
	public void floydWarshall(GraphNode start) {

		// 1. Initialisierung TODO
		int[][] adjazenzM = null; // Erstellen Sie eine Adjazenz-Matirix des
									// Graphen

		waitForNextStep(); // Pause nach der Initialisierung

		// 2. Durchlaufen der Schleifen TODO

		waitForNextStep(); // Pause am Ende des Algorithmus
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hswt.algo.graph.core.GraphServiceProvider#setNodes(java.util.Vector)
	 */
	@Override
	public void setNodes(List<GraphNode> nodes) {
		this.nodes = nodes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hswt.algo.graph.core.GraphServiceProvider#setEdges(java.util.Vector)
	 */
	@Override
	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
}
