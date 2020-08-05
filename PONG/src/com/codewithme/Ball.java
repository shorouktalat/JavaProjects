package com.codewithme;

import java.awt.*;

public class Ball {

     private double x;
    private double xVelocity;
    private double y;
    private double yVelocity;

    public Ball() {
        this.x =300 ;
        this.xVelocity = -2;
        this.y =200 ;
        this.yVelocity =3;
    }

    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval((int)x-10 ,(int)y- 10, 20,20);
    }
    public void move (){
        x+=xVelocity;
        y+=yVelocity;
        if(y<10)
            yVelocity=-yVelocity;
            if(y>490)
                yVelocity=-yVelocity;



    }
    public int getX() {
        return (int)x;
    }



    public int getY() {
        return (int) y;
    }


}
