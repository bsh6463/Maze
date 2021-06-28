package graph;

import java.util.LinkedList;
import java.util.Stack;

public class PathFinder {

    Stack<Point> stack;
    boolean[][] visited;
    String[] visitString;
    public int[][] maze;
    int rowNumber;
    int colNumber;
    int count = 0;

    public PathFinder(int rowNumber, int colNumber){

        visited = new boolean[rowNumber][colNumber];
        stack = new Stack<>();
        visitString = new String[50];
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;

    }

    public void findPath(int rowStart, int colStart) throws Exception {

        if(maze[rowStart][colStart] == 1){
            System.out.println("띠용 시작이 불가능 합니다.");
            throw new Exception();
        }
        Point start = new Point(rowStart, colStart);
        stack.push(start);
        Point temp = new Point();

        //방문노드 확인 배열 초기화
        for(int i = 0; i < rowNumber; i++){
            for(int j = 0; j< colNumber; j++){
                visited[i][j] = false;
            }
        }


        //인접 노드 찾기
        Point current = new Point(stack.pop());
        while (true){

            visited[current.getRow()][current.getCol()] = true;
            visitString[count++] = "[" + current.getRow()+"," + current.getCol() + "]";
            System.out.println("현재노드 : [" + current.getRow()+"," + current.getCol() + "]");


            for(int i =1 ; i<5;i++){

                temp.setRow(current.getRow());
                temp.setCol(current.getCol());

                temp.move(i);

                System.out.println("탐색 노드 : [" + temp.getRow()+"," + temp.getCol() + "]");

                if(temp.getRow() >= 0 && temp.getCol() >= 0
                        && temp.getRow() < rowNumber && temp.getCol() < colNumber
                        && visited[temp.getRow()][temp.getCol()] == false
                        && maze[temp.getRow()][temp.getCol()] == 0){
                    System.out.println("해당 노드 이동 가능.");
                    stack.push(temp);
                    //temp의 역할을 여기서 끝! temp 역할이 끝나면 초기화 해주자!
                    temp = new Point();
                }
                else{
                    System.out.println("이동 불가");
                }

                System.out.println("////////////////////////////////////////");

            }

            System.out.println("--------------------------------");

            if(current.getRow() == 7 && current.getCol() == 7) {

                showPath();
                break;
            }

        temp = stack.pop();
        current.setRow(temp.getRow());
        current.setCol(temp.getCol());


        }
    }


   public void showPath(){

        Point temp = new Point();
        for(int i=0; i<count; i++){

            System.out.print(visitString[i] + " - ");

        }
       System.out.println("탈출!");

   }

}
