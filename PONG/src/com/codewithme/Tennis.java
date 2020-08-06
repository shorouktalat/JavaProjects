package com.codewithme;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Tennis extends Applet implements Runnable, KeyListener {
    private final int height = 500;
    private final int width = 700;
    private HumanPaddle p1;
    Thread thread;
    private Ball b1;


    public void init() {
        this.resize(width, height);
        this.addKeyListener(this);
        p1=new HumanPaddle(1);
        thread = new Thread(this);
        b1=new Ball();
        thread.start();
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, width, height);
        if (b1.getX() < -10 || b1.getX() > width+10) {
            g.setColor(Color.red);
            g.drawString("Game Over",350,250);

        } else {
            p1.draw(g);
            b1.draw(g);
        }
    }

    public void run() {

        for (; ; ) {

            p1.move();
            b1.move();
            b1.checkCollision(p1,p1);
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            p1.setDownAccl(true);

        }
        else if(e.getKeyCode()==KeyEvent.VK_UP){
            p1.setUpAccl(true);

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            p1.setDownAccl(false);
        }
        else if(e.getKeyCode()==KeyEvent.VK_UP){
            p1.setUpAccl(false);
        }
    }
}