package treegraph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Given a directed graph, design an algorithm to find out whether there is a
 * route between two nodes.
 */
class _04_01_RouteBetweenNodes {
    private Set<Integer> visited;

    private final Digraph digraph;

    _04_01_RouteBetweenNodes(Digraph digraph) {
        this.digraph = digraph;
        this.visited = new HashSet<Integer>();
    }

    boolean hasRoute(int source, int target) {
        if(source == target) return true;
        Queue<Integer> neighbors = new LinkedList<>();
        digraph.adjacent(source).forEach(n->neighbors.add(n));

        while(!neighbors.isEmpty()) {
            int vertex = neighbors.poll();
            if(!visited.contains(vertex)) {
                if(vertex == target) return true;
                visited.add(vertex);
                digraph.adjacent(vertex).forEach(n -> neighbors.add(n));
            }
        }

        return false;
    }

}
