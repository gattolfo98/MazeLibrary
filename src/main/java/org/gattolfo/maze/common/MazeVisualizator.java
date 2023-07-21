package org.gattolfo.maze.common;


import javax.swing.*;
import java.awt.*;

public class MazeVisualizator extends JPanel {

    private final int CELL_SIZE = 20; // Dimensione di ogni cella nel labirinto
    private final int PADDING = 20; // Padding per la visualizzazione del labirinto
    private Cell[][] map;
    public MazeVisualizator(Cell[][] map){
        this.map = map;
        setBackground(Color.LIGHT_GRAY);
        setSize(CELL_SIZE * map[0].length + PADDING * 2, CELL_SIZE * map.length + PADDING * 2);
        setPreferredSize(new Dimension(CELL_SIZE * map[0].length + PADDING * 2, CELL_SIZE * map.length + PADDING * 2));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawMaze(g);
    }


    private void drawMaze(Graphics g) {
        g.setColor(Color.BLACK);

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                int x = j * CELL_SIZE + PADDING;
                int y = i * CELL_SIZE + PADDING;

                // Disegna le pareti delle celle
                if (map[i][j].getWallUp()) {
                    g.drawLine(x, y, x + CELL_SIZE, y);
                }
                if (map[i][j].getWallDown()) {
                    g.drawLine(x, y + CELL_SIZE, x + CELL_SIZE, y + CELL_SIZE);
                }
                if (map[i][j].getWallLeft()) {
                    g.drawLine(x, y, x, y + CELL_SIZE);
                }
                if (map[i][j].getWallRight()) {
                    g.drawLine(x + CELL_SIZE, y, x + CELL_SIZE, y + CELL_SIZE);
                }

            }
        }
        g.setColor(Color.BLUE);
        g.drawRect(0, 0, CELL_SIZE * map[0].length + PADDING * 2, CELL_SIZE * map.length + PADDING * 2);
        g.setColor(Color.BLACK);
    }

    public void setMap(Cell[][] map){
        this.map = map;
    }
}
