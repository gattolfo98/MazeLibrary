package org.gattolfo.maze.algorithms;

import org.gattolfo.maze.common.Cell;

public class EllerAlgorithm extends MazeGenerator{


    public EllerAlgorithm(int height, int width) {
        super();
        map = new Cell[height][width];
        for(int i=0;i<height;i++){
            for(int z=0;z<width;z++){
                map[i][z] = new Cell(i,z,false);
                if(i==0)
                    map[i][z].setWallUp(true);
                if(i==height-1)
                    map[i][z].setWallDown(true);
                if(z==0)
                    map[i][z].setWallLeft(true);
                if(z==width-1)
                    map[i][z].setWallRight(true);
            }
        }

    }

    @Override
    public Cell[][] generateMaze() {


        return map;
    }

    private void generateRow(int rowHeight){

    }
}
