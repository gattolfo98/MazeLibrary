package org.gattolfo.maze.algorithms;

import org.gattolfo.maze.common.Cell;


public abstract class MazeGenerator{
    protected int height;
    protected int width;

    protected Cell[][] map;

    /**
     * Do not use except to implement constructors
     */
    public  MazeGenerator(){

    }
    public MazeGenerator(int height, int width){
        this.height = height;
        this.width = width;
        map = new Cell[height][width];
        for(int i=0;i<height;i++){
            for(int z=0;z<width;z++){
                map[i][z] = new Cell(i,z,true);
            }
        }
    }
    public MazeGenerator(int height, int width, Cell[][] map){
        this.height = height;
        this.width = width;
        this.map = map;
    }

    public abstract Cell[][] generateMaze();

    public Cell[][] getMaze(){
        return map;
    }

}
