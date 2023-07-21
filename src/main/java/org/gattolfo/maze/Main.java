package org.gattolfo.maze;

import org.gattolfo.maze.algorithms.BacktrackingAlgorithm;
import org.gattolfo.maze.algorithms.EllerAlgorithm;
import org.gattolfo.maze.algorithms.MazeGenerator;
import org.gattolfo.maze.common.Cell;
import org.gattolfo.maze.common.FrameMaze;
import org.gattolfo.maze.common.MazeVisualizator;

public class Main {
    public static void main(String[] args) {

        MazeGenerator generator = new EllerAlgorithm(20,20);
        long startTime = System.nanoTime();
        Cell[][] map = generator.generateMaze();
        long endTime = System.nanoTime();
        long elapsedTime = (endTime - startTime) / 1000000;
        System.out.println("Tempo di esecuzione: " + elapsedTime + " millisecondi");
        FrameMaze frame = new FrameMaze();
        frame.setVisible(true);
        frame.setPanelMaze(new MazeVisualizator(generator.getMaze()));
    }

    public void fake(){

    }
}

