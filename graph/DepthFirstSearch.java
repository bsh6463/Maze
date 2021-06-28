package graph;

import java.util.Arrays;
import java.util.Stack;

public class DepthFirstSearch {

    Stack<Integer> stack;
    boolean[] visited;
    //노드 수
    private int number;
    Stack<Integer> visitOrder;
    //matrix
    int[][] matrix;

    int count = 0;

    public DepthFirstSearch(int number){
        this.number = number;
        visited = new boolean[number];
        stack = new Stack<>();
        visitOrder = new Stack<>();

    }

    public void dfsTraversal(int startNode){

        stack.push(startNode);
        System.out.println("stack : " + stack.toString());

        while(true){

           // System.out.println("stack 크기 : " + stack.size());
            int currentNode = stack.pop(); //노드 방문
            visitOrder.push(currentNode);
            System.out.println("이번 방문 노드 : " + currentNode);
            System.out.println("stack : " + stack.toString());
            count++;
            visited[currentNode] = true;

            //System.out.println("count : " + count);

            for(int j=0;j < number; j++){
                //from current node to 어디? 찾기
                if((matrix[currentNode][j] >0) && (stack.search(j) == -1) && visited[j] == false){

                    stack.push(j);

                }

            }
            System.out.println(currentNode+" 인접노드 push");
            System.out.println("stack : " + stack.toString());
            System.out.println("-------------------------");
            if(count == number) {
                System.out.println("serach 종료");
            break;
            }
        }


        System.out.println("방문 순서 : " + visitOrder.toString());

    }

}
