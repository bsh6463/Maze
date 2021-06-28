package graph;

public class Point {

    private int row;
    private int col;

    public Point(int row, int col){
        this.row = row;
        this.col = col;
    }

    public Point(Point point){
        this.row = point.getRow();
        this.col = point.getCol();
    }

    public Point(){
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }


    public void move(int n){
        if(n == 1){
            this.col--;
            System.out.println("좌 탐색");
        }
        else if(n == 2){
            this.col++;
            System.out.println("우 탐색");
        }
        else if(n==3){
            this.row--;
            System.out.println("상 탐색");
        }
        else if(n==4){
            this.row++;
            System.out.println("하 탐색");
        }
    }

}
