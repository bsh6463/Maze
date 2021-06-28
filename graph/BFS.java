package graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS {

    private int number;
    public int[][] matrix;

    private Queue<Integer> queue;
    private Stack<Integer> visited;
    private boolean[] visitBoolean;

    public BFS(int number){
        this.number = number;
        queue = new LinkedList<>();
        matrix = new int[number][number];
        visited = new Stack<>();
        visitBoolean = new boolean[number];
    }

    public void breadthFirstSearch(int start) {

        queue.add(start);
        visitBoolean[start] = true;

        int current;

        while (queue.size() >0) {
            System.out.println("queue : " + queue.toString());
            System.out.println("visited : " + visited.toString());
            current = queue.remove();
            visited.push(current);
            System.out.println("current : " + current);


                for (int j = 0; j < number; j++) {

                    if((matrix[current][j] !=0) && (visitBoolean[j]==false) ){
                        queue.add(j);
                      visitBoolean[j]=true;

                    }

                }


            if(visited.size() == number) {
                break;
            }

            System.out.println("-------------------");
        }

        System.out.println("-------------------");
        System.out.println("DFS 종료");
        System.out.println("queue : " + queue.toString());
        System.out.println("visited : " + visited.toString());
        System.out.println("방문여부 : " + Arrays.toString(visitBoolean));


    }
}
