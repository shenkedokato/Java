package mapgame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;


import javax.swing.JPanel;

import entity.Player;
import tile.TileManager;

public class GamePanel extends JPanel implements Runnable {
    final int originalTileSize = 16;
    final int scale = 3;
    public final int tileSize = originalTileSize *scale;
    public final int maxScreenCol=25;
    public final int maxScreenRow=15;
    final int screenWidth=tileSize*maxScreenCol;
    final int screenHeight=tileSize*maxScreenRow;
    int FPS = 60;
    TileManager tileM=new TileManager(this);
    Thread gameThread;
    public CollisionChecker cChecker=new CollisionChecker(this);
    Player player1=new Player(this,"car1.png",50,200);
    Player player2=new Player(this,"car2.png",50,100);
    Player player3=new Player(this,"car3.png",50,320);
    Player player4=new Player(this,"car4.png",50,450);
    Player player5=new Player(this,"car5.png",50,570);

    int playerX=100;
    int playerY=100;
    int playerSpeed=4;

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }
    public void startGameThread(){
        gameThread=new Thread(this);
        gameThread.start();
    }
    @Override
    // public void run() {
    //     double drawInterval=1000000000/FPS;
    //     double nextDrawTime =System.nanoTime() + drawInterval;
    //     while(gameThread!=null){
    //         // System.out.println("The game loop is running");
    //         update();
    //         repaint();
    //         try {
    //             double remainingTime=nextDrawTime-System.nanoTime();
    //             remainingTime =remainingTime/10000000;
    //             if(remainingTime<0){
    //                 remainingTime=0;
    //             }
    //             Thread.sleep((long) remainingTime);
    //             nextDrawTime+=drawInterval;
    //         } catch(InterruptedException e){
    //             e.printStackTrace();
    //         }
    //     }
    // }
    public void run(){
        double drawInterval=1000000000/FPS;
        double delta=0;
        long lastTime=System.nanoTime();
        long currentTime;
        long timer=0;
        int drawCount=0;
        while(gameThread!=null){
            currentTime=System.nanoTime();
            delta+=(currentTime-lastTime)/drawInterval;
            timer+=(currentTime-lastTime);
            lastTime=currentTime;
            if(delta>=1){
                update();
                repaint();
                delta--;
                drawCount++;
            }
            if(timer>=1000000000){
                System.out.println("FPS:"+drawCount);
                drawCount=0;
                timer=0;
            }

       }
    }
    public void update(){
        player1.update();
        player2.update();
        player3.update();
        player4.update();
        player5.update();

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2= (Graphics2D)g;
        tileM.draw(g2);
        player1.draw(g2);
        player2.draw(g2);
        player3.draw(g2);
        player4.draw(g2);
        player5.draw(g2);
        g2.dispose();
    }
}
