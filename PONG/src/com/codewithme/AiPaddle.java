package com.codewithme;

import java.awt.*;

public class AiPaddle implements Paddle {

    private double y;
    private int player ,x;
      private   Ball b1=new Ball();

        public AiPaddle(int player, Ball b) {
            b1=b;
            //defult position of the paddle
            y=200;
            if (player==1)
                x=20;
            else
                x=660;
        }

        @Override
        public void move() {


            y=b1.getY()-40;

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


    }



