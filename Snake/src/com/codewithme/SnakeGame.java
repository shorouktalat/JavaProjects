package com.codewithme;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SnakeGame extends Applet implements  Runnable, KeyListener {
    private final int height = 400;
    private final int width = 400;
    private Snake s;
    private  boolean gameOver=false;
    Thread thread;
    private Token t;

    public void init() {
        this.resize(width, height);
        this.addKeyListener(this);
        s=new Snake();
        gameOver=false;

        thread = new Thread(this);
        t=new Token(s);
        thread.start();
    }

    public void update(Graphics g) {
        paint(g);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, width, height);
        if(!gameOver){
            s.draw(g);
            t.draw(g);


        }
            else{
            g.setColor(Color.red);
            g.drawString("Game Over", 200, 200);
        }


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
        public void checkGameOver(){
            if (s.snakeHead().getX() >= width || s.snakeHead().getY() >height ||s.snakeHead().getY() <=0||s.snakeHead().getX() <=0)

                gameOver=true;
//            if (s.snakeCollision())
//               gameOver=true;

        }



    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        for (; ; ) {
            s.move();
           this.checkGameOver();
           t.snakeCollision();

            this.repaint();


            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

