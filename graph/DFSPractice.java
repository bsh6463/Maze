package graph;

import java.util.Arrays;

public class DFSPractice {

    public static void main(String[] args) {


        int number = 8;

        DepthFirstSearch DFS = new DepthFirstSearch(number);
        UndirectedGraph graph = new UndirectedGraph(number);
        BFS bfs  = new BFS(number);


        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 1);
        graph.addEdge(1 ,3, 1);
        graph.addEdge(1 ,4, 1);
        graph.addEdge(2 ,5, 1);
        graph.addEdge(2 ,6, 1);
        graph.addEdge(4 ,5, 1);
        graph.addEdge(3 ,7, 1);

        //System.out.println(Arrays.deepToString(graph.getMatrix()));
        DFS.matrix = graph.getMatrix();
        bfs.matrix = graph.getMatrix();
       // DFS.dfsTraversal(4);
        bfs.breadthFirstSearch(0);



    }
}
