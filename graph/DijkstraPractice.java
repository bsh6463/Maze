package graph;

public class DijkstraPractice {

    public static void main(String[] args) {

        int number = 6;
        UndirectedGraph graph = new UndirectedGraph(number);
        Dijkstra dijkstra = new Dijkstra(number);


        graph.addEdge(0,1,1);
        graph.addEdge(0,2,4);
        graph.addEdge(1,2,2);
        graph.addEdge(2,3,1);
        graph.addEdge(3,4,8);
        graph.addEdge(3,5,3);
        graph.addEdge(4,5,4);


        dijkstra.matrix = graph.getMatrix();
        dijkstra.shortCutSearch(0);



    }
}
