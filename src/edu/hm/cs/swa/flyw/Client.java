package edu.hm.cs.swa.flyw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Client extends JFrame {

    private static final long serialVersionUID = -1350200437285282550L;
    private final int WIDTH;
    private final int HEIGHT;

    private static final Color colors[] = {Color.RED, Color.GREEN, Color.BLUE, Color.CYAN, Color.YELLOW};

    public Client(int width, int height) {

        this.WIDTH = width;
        this.HEIGHT = height;
        /*
        Container contentPane = getContentPane();

        JButton startButton = new JButton("Draw");
        final JPanel panel = new JPanel();

        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Graphics g = panel.getGraphics();
                for (int i = 0; i < 2000; ++i) {
                    Circle circle = (Circle) ShapeFactory.getCircle(randomColor());
                    circle.setX(randomCoordinateX());
                    circle.setY(randomCoordinateY());
                    circle.setRadius(randomRadius());

                    circle.draw(g);
                }
            }
        });
         */
    }

    private static Color randomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private int randomCoordinateX() {
        return (int) (Math.random() * this.HEIGHT);
    }

    private int randomCoordinateY() {
        return (int) (Math.random() * this.WIDTH);
    }

    private static int randomRadius() {
        return (int) (Math.random() * 30);
    }

    public static void main(String[] args) {
        new Client(500, 600);
    }
}
