package org.gattolfo.maze.common;

public class Cell {
    private final int alt;
    private final int x;

    private boolean visited;

    private boolean wallLeft;
    private boolean wallRight;
    private boolean wallUp;
    private boolean wallDown;


    public Cell(int alt, int x,boolean wallStatus){
        this.alt = alt;
        this.x = x;
        visited = false;
        wallDown = wallStatus;
        wallLeft = wallStatus;
        wallRight = wallStatus;
        wallUp = wallStatus;
    }


    public boolean isVisited() {
        return visited;
    }


    public void setVisited(boolean visited) {
        this.visited = visited;
    }


    public boolean getWallLeft() {
        return wallLeft;
    }


    public void setWallLeft(boolean wallLeft) {
        this.wallLeft = wallLeft;
    }


    public boolean getWallRight() {
        return wallRight;
    }


    public void setWallRight(boolean wallRight) {
        this.wallRight = wallRight;
    }


    public boolean getWallUp() {
        return wallUp;
    }


    public void setWallUp(boolean wallUp) {
        this.wallUp = wallUp;
    }


    public boolean getWallDown() {
        return wallDown;
    }


    public void setWallDown(boolean wallDown) {
        this.wallDown = wallDown;
    }


    public int getAlt() {
        return alt;
    }


    public int getX() {
        return x;
    }

}
