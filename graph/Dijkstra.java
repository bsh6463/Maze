package graph;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Stack;

public class Dijkstra {

    int start;
    int[][] matrix;
    int[] weight;
    int number;
    boolean[] visited;
    Stack<Integer> visitArray;
    int inf = 99999;
    public Dijkstra(int number){
        this.number = number;
        matrix = new int[number][number];
        weight = new int[number];
        visited = new boolean[number];
        visitArray = new Stack<>();

        for(int i=0;i<number;i++){
            weight[i] = inf;
        }
    }


    public void shortCutSearch(int start) {
        int current = start;
        weight[current] = 0;
        visitArray.push(current);
        visited[current] = true;
        System.out.println();
        System.out.println(start + "노드로 시작");

        baseWeightArray(current);


        while(visitArray.size() != number){
            //다음 current 정하기
            current = findMinIndex(current);
            visitArray.push(current);
            visited[current] = true;
            System.out.println("visited : " + Arrays.toString(visited));
            //j 로 바로가는거랑, current거쳐서 가는거랑 비교
            for(int j = 0; j<number;j++){

                int temp = weight[current] + matrix[current][j];
                if((matrix[current][j] != 0)
                        && (visited[j]==false)
                        && (  temp < weight[j])){

                    weight[j] = temp;
                }
            }
            System.out.println("weight : " + Arrays.toString(weight));

            System.out.println("---------------------------------------------");

            if(visitArray.size() == number) {
                printResult();
                break;
            }

        }

    }

    private void baseWeightArray(int current){
        //현재 노드 기준으로 다른 노드 weight입력하기
        for (int j = 0; j < number; j++) {

            if ((matrix[current][j] > 0) && (visited[j] == false)) {

                weight[j] = matrix[current][j];

            }

        }

        System.out.println(start + "노드 기준 weight : " + Arrays.toString(weight));
        System.out.println("---------------------------------------------");
        }

    public int findMinIndex(int current){

    int minIndex=0;
    int minValue = inf;


        for(int i = 0;i< number;i++){

            if((visited[i]==false) &&(weight[i] < minValue)){
                minValue = weight[i];
                minIndex = i;
            }
        }
        System.out.println("다음 노드 : " + minIndex  );
        return minIndex;
    }

    public void printResult(){
        System.out.println("visited : " + visitArray.toString());
        System.out.println(start +" 노드를 기준으로 각 노드까지 최단 거리 : " + Arrays.toString(weight));
    }


}
