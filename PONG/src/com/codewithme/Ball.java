package com.codewithme;

public class Ball {

     private double x;
    private double xVelocity;
    private double y;
    private double yVelocity;

    public Ball() {
        this.x =300 ;
        this.xVelocity = 0;
        this.y =200 ;
        this.yVelocity =0;
    }

    public int getX() {
        return (int)x;
    }



    public int getY() {
        return (int) y;
    }


}
