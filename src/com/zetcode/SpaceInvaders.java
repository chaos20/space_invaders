package com.zetcode;

import java.awt.EventQueue;
import javax.swing.*;

public class SpaceInvaders extends JFrame implements Commons {

    private SpaceInvaders() {

        initUI();
    }

    private void initUI() {

        add(new com.zetcode.Board());
        setTitle("Space Invaders");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(BOARD_WIDTH, BOARD_HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            SpaceInvaders ex = new SpaceInvaders();
            ex.setVisible(true);
        });
    }
}
