package org.gattolfo.maze.algorithms;

import org.gattolfo.maze.common.Cell;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class BacktrackingAlgorithm extends MazeGenerator {



    Stack<Cell> stack;
    public BacktrackingAlgorithm(int height, int width) {
        super(height, width);
        stack = new Stack<>();
    }

    public BacktrackingAlgorithm(int height, int width, Cell[][] map) {
        super(height, width, map);
        stack = new Stack<>();
    }

    @Override
    public Cell[][] generateMaze(){
        Cell currentCell = map[0][0];
        Direction direction;
        stack.push(currentCell);


        while(!stack.isEmpty()){


            currentCell.setVisited(true);

            direction = getCellUnvisited(currentCell);

            if(direction!=null){
                int alt = currentCell.getAlt();
                int x = currentCell.getX();
                //wall removing
                switch (direction) {
                    case UP -> {
                        currentCell.setWallUp(false);
                        alt -= 1;
                        map[alt][x].setWallDown(false);
                    }
                    case DOWN -> {
                        currentCell.setWallDown(false);
                        alt += 1;
                        map[alt][x].setWallUp(false);
                    }
                    case LEFT -> {
                        currentCell.setWallLeft(false);
                        x -= 1;
                        map[alt][x].setWallRight(false);
                    }
                    case RIGHT -> {
                        currentCell.setWallRight(false);
                        x += 1;
                        map[alt][x].setWallLeft(false);
                    }
                    default -> throw new IllegalArgumentException("Direzione non valida.");
                }

                currentCell = map[alt][x];
                stack.push(currentCell);
            }else{

                currentCell = stack.pop();

            }

        }

        return map;
    }
    Random random = new Random();
    private Direction getCellUnvisited(Cell cell){

        Direction[] directions = new Direction[4];
        int count =0;
        if(cell.getAlt()!=0){
            if(!map[cell.getAlt()-1][cell.getX()].isVisited())
                directions[count++] = Direction.UP;
        }
        if(cell.getAlt()!=height-1){
            if(!map[cell.getAlt()+1][cell.getX()].isVisited())
                directions[count++] = Direction.DOWN;
        }
        if(cell.getX()!=0){
            if(!map[cell.getAlt()][cell.getX()-1].isVisited())
                directions[count++] = Direction.LEFT;
        }
        if(cell.getX()!=width-1){
            if(!map[cell.getAlt()][cell.getX()+1].isVisited())
                directions[count++] = Direction.RIGHT;
        }

        if(count == 0)
            return null;

        directions = Arrays.copyOf(directions,count);

        return directions[random.nextInt(count)];

    }


    private enum Direction{
        LEFT, RIGHT, UP, DOWN
    }


}
