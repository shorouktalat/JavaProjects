package com.codewithme;

import java.awt.*;

public class Token {
    private int x;
    private  int y;
    private Snake snake;
    private int score;

    public Token(Snake s) {
        x=(int)(Math.random()*396);
        y= (int)(Math.random()*396);
        this.snake = s;

    }

    public void draw(Graphics g){
        g.setColor(Color.green);
        g.fillRect(x, y, 6, 6);
    }
    public void changePosition(){
        x=(int)(Math.random()*300);
        y= (int)(Math.random()*396);
    }
    public boolean snakeCollision(){
       var snakex= snake.snakeHead().getX()+2;
       var snakeY=snake.snakeHead().getY()+2;

       if(snakex>=x-1 &&snakex<=x+7 ){
           if(snakeY>=y-1 &&snakeY<=y+7 ){
               changePosition();
               score++;
               return  true;

           }
       }
       return false;
    }


}
