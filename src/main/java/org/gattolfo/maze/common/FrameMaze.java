package org.gattolfo.maze.common;

import org.gattolfo.maze.algorithms.MazeGenerator;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class FrameMaze extends JFrame {

    MazeVisualizator panelMaze;
    JScrollPane scrollPane;
    public FrameMaze(){
        scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        setBackground(Color.ORANGE);
        setTitle("Maze Frame, gattolfo98");
        setSize(800,600);
        //setMinimumSize(new Dimension(400,200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(scrollPane);


        setLocationRelativeTo(null);

    }

    public void setPanelMaze(JPanel panelMaze){
        scrollPane.setViewportView(panelMaze);
        revalidate();
        repaint();
    }


}
