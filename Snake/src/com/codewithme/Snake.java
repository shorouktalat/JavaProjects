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




    public Snake() {
        this.snakePoints = new ArrayList<Point>();
        xDir=0;
        yDir=0;
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
}
