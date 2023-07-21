package org.gattolfo.maze.common;


import javax.swing.*;
import java.awt.*;

public class FrameMaze extends JFrame {

    JScrollPane scrollPane;
    public FrameMaze(){
        scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        setBackground(Color.ORANGE);
        setTitle("Maze Frame, gattolfo98");
        setSize(800,600);
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
