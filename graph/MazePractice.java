package graph;

public class MazePractice {

    public static void main(String[] args) throws Exception {

        Maze maze = new Maze();

        PathFinder pathFinder = new PathFinder(8,8);

        pathFinder.maze = maze.getMyMaze();

        pathFinder.findPath(0,0);


    }
}
