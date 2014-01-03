package trees.execute;

import org.graphstream.algorithm.Dijkstra;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.SingleGraph;

public class TestGraph {
    public static void main(String args[]) {
        Graph graph = new SingleGraph("First Grpah");
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");

        graph.addEdge("AB", "A", "B").addAttribute("ui.label", 3);
        graph.addEdge("BC", "B", "C").addAttribute("ui.label", 5);
        graph.addEdge("CD", "C", "D").addAttribute("ui.label", 7);
        graph.addEdge("CE", "C", "E").addAttribute("ui.label", 4);
        graph.addEdge("DE", "D", "E").addAttribute("ui.label", 4);
        for (Node node : graph) {
            node.addAttribute("ui.label", node.getId());
        }

        Dijkstra dijkstra = new Dijkstra();

        dijkstra.init(graph);
        dijkstra.setSource(graph.getNode("A"));
        dijkstra.compute();
        Path p = dijkstra.getPath(graph.getNode("E"));
        System.out.println(p.toString());

        graph.display();
    }

}
