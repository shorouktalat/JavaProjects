package com.codewithme;

import java.awt.*;

public class HumanPaddle implements Paddle {
    double y,yVelocity;

    boolean upAccl,downAccl;
    int player ,x;

    public HumanPaddle(int player) {
        upAccl=false;
        downAccl=false;
        yVelocity=0.0;
        //defult position of the paddle
        y=200;
        if (player==1)
            x=20;
        else
            x=660;
    }

    @Override
    public void move() {



            if (upAccl) {
                yVelocity -= 1;
            } else if (downAccl) {
                yVelocity += 1;
            } else if (!upAccl && !downAccl) {
                yVelocity *= .89;
            }


            y += yVelocity;

        if (yVelocity>=5 )
            yVelocity=5;
       if (yVelocity<=-5)
           yVelocity=-5;
        if(y<=0)
            y=0;
       if( y>=420)
           y=420;


    }

    @Override
    public void draw(Graphics g) {

        g.setColor(Color.white);
        g.fillRect(x, (int)y, 20, 80);


    }

    @Override
    public int getY() {
        return (int) y;
    }

    public void setUpAccl(boolean upAccl) {
        this.upAccl = upAccl;
    }

    public void setDownAccl(boolean downAccl) {
        this.downAccl = downAccl;
    }
}
