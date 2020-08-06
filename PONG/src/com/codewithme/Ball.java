package com.codewithme;

import java.awt.*;

public class Ball {

     private double x;
    private double xVelocity;
    private double y;
    private double yVelocity;
    final int radius=10;

    public double randomSpeed(){
        return  Math.random()*3+5;
    }
    public int randomDirection(){
        int rand=  (int)Math.random()*2;
        if (rand==1)
                return 1;
        else
            return -1;
    }
    public Ball() {
        this.x =300 ;
        this.xVelocity = randomDirection()*randomSpeed();
        this.y =200 ;
        this.yVelocity =randomDirection()*randomSpeed();
    }

    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval((int)x- radius ,(int)y- radius, 20,20);
    }
    public void move (){
        x+=xVelocity;
        y+=yVelocity;
        if(y<10)
            yVelocity=-yVelocity;
            if(y>490)
                yVelocity=-yVelocity;



    }
    public void checkCollision(Paddle p1,Paddle p2){
        //paddle 1(right)
        if(x<=50) {
            if(y>=p1.getY() && y <=p1.getY()+80){
                xVelocity=-xVelocity;
            }
        }
        if(x>=650){
            if(y>=p2.getY() && y <=p2.getY()+80){
                xVelocity=-xVelocity;

            }
        }
    }
    public int getX() {
        return (int)x;
    }



    public int getY() {
        return (int) y;
    }


}
