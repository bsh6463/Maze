package graph;

public class UndirectedGraph {

    //현재 노드가 몇개?
    int nubmer;
    int from;
    int to;
    //matrix
    private int[][] nodeMatrix;
    //가중치
    private int weight;

    public UndirectedGraph(int nubmer){
        this.nubmer = nubmer;
        nodeMatrix = new int[nubmer][nubmer];
    }

    public void addEdge(int from, int to, int weight){
        nodeMatrix[from][to] = weight;
        //undirectedMatrix니 양항향 동일
        nodeMatrix[to][from] = weight;
    }

    public int[][] getMatrix(){
        return nodeMatrix;
    }
}
