package entity;


import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

import mapgame.GamePanel;

public class Player extends Entity {
    GamePanel gp;
    public Player(GamePanel gp,String file_path,int x,int y){
        this.gp=gp; 
        solidArea=new Rectangle();
        solidArea.x=8;
        solidArea.y=16;
        solidArea.width=32;
        solidArea.height=32;
        this.x=x;
        this.y=y;
        getPlayerImage(file_path);
    }

    public void getPlayerImage(String file_path){
        try{
            nv=ImageIO.read(getClass().getResourceAsStream(file_path));
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public void update(){
        Random rd=new Random();
        speed=rd.nextInt(10);
        x+=speed;
    }
    public void draw(Graphics2D g2){
        BufferedImage image =nv;
        g2.drawImage(image, x, y,gp.tileSize*3,gp.tileSize*3,null);
    }
}
