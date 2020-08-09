package com.codewithme;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Snake {
    private  List<Point> snakePoints;
    private int xDir,yDir;
    private final int size=20;
    private int startX=150;
    private int starty=150;
    private boolean isMoving;




    public Snake() {
        this.snakePoints = new ArrayList<Point>();
        xDir=0;
        yDir=0;
        isMoving=false;
        snakePoints.add(new Point(startX,starty));
        for(int i=0;i<size;i++) {
            snakePoints.add(new Point(startX-i*4,starty));


        }
    }

    public void draw(Graphics g)
    {
        g.setColor(Color.white);
        for(Point item:snakePoints)
            g.fillRect(item.getX(),item.getY(), 4, 4);



    }
    public void move(){
        if(isMoving) {
            var snakeStart = snakePoints.get(0);
            var snakeLase = snakePoints.get(snakePoints.size() - 1);
            var newStart = new Point(snakeStart.getX() +  xDir*4, snakeStart.getY() + 4 * yDir);
            for (int i = snakePoints.size() - 1; i >= 1; i--)
                snakePoints.set(i, snakePoints.get(i - 1));

            snakePoints.set(0,newStart);
            setMoving(false);
        }


        }



    public int getxDir() {
        return xDir;
    }

    public void setxDir(int xDir) {
        this.xDir = xDir;
    }

    public int getyDir() {
        return yDir;
    }

    public void setyDir(int yDir) {
        this.yDir = yDir;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public boolean isMoving() {
        return isMoving;
    }
    public Point snakeHead(){
        return snakePoints.get(0);
    }
    public boolean snakeCollision(){
       var tempX=snakeHead().getX();
       var  tempY=snakeHead().getY();
       for(Point i:snakePoints) {
           if (i.getX() == tempX && i.getY() == tempY)
               return true;
       }

               return false;

    }
}
