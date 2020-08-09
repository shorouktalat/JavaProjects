package com.codewithme;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SnakeGame extends Applet implements  Runnable, KeyListener {
    private final int height = 400;
    private final int width = 400;
    private Snake s;
    Thread thread;

    public void init() {
        this.resize(width, height);
        this.addKeyListener(this);
        s=new Snake();

        thread = new Thread(this);
        thread.start();
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, width, height);
        s.draw(g);
    }

    public void rePaint(Graphics g) {
        paint(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent e) {
 //up 1 down -1 right 1 left -1
        if(!s.isMoving())
        {
          if(  e.getKeyCode()==KeyEvent.VK_DOWN ||e.getKeyCode()==KeyEvent.VK_UP ||e.getKeyCode()==KeyEvent.VK_RIGHT  ||e.getKeyCode()==KeyEvent.VK_LEFT)

            s.setMoving(true);

        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN){

            if(s.getyDir()!=-1) {
                s.setyDir(1);
                s.setxDir(0);
            }


        }
         if(e.getKeyCode()==KeyEvent.VK_UP) {
            if(s.getyDir()!=1) {
            s.setyDir(-1);
            s.setxDir(0);

        }

        } if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            if(s.getxDir()!=-1) {
                s.setxDir(1);
                s.setyDir(0);
            }


        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT) {
            if(s.getxDir()!=1) {
           s.setxDir(-1);
            s.setyDir(0);

        }
        }



        }



    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        for (; ; ) {
            s.move();

            this.repaint();


            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

