package graph;

public class Maze {

    public int[][] myMaze = {
            {0,1,1,1,0,1,1,1},
            {0,0,0,1,0,0,0,0},
            {1,1,0,0,0,1,0,1},
            {1,1,0,1,1,1,0,1},
            {1,0,0,1,0,0,0,0},
            {0,0,1,1,0,1,1,1},
            {1,0,1,1,0,0,0,0},
            {1,1,1,0,0,1,1,0}
    };

    public int[][] getMyMaze() {
        return myMaze;
    }
}
