// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);



        // Draw Random Lines
            Random rand = new Random(5);
        for(int k = 0; k<=100;k++) {
            int x1 = rand.nextInt(390)+10;
            int y1 = rand.nextInt(280)+10;
            int x2 = rand.nextInt(390)+10;
            int y2 = rand.nextInt(280)+10;
            int c1 = rand.nextInt(255);
            int c2 = rand.nextInt(255);
            int c3 = rand.nextInt(255);
            g.setColor(new Color(c1,c2,c3));
            g.drawLine(x1, y1, x2, y2);
            }

        // Draw Random Squares
        for(int k = 0; k<=100;k++) {
            int sx1 = (int)(Math.random()*330+400);
            int sy1 = (int)(Math.random()*230+10);
            int width = 50;
            int height = 50;
            int c1 = rand.nextInt(255);
            int c2 = rand.nextInt(255);
            int c3 = rand.nextInt(255);
            g.setColor(new Color(c1,c2,c3));
            g.fillRect(sx1, sy1, width, height);
        }

        // Draw Random Circles
        for(int k = 0; k<=100;k++) {
            int cwidthheight = rand.nextInt(200);
            int cx1 = rand.nextInt(390-cwidthheight)+10;
            int cy1 = rand.nextInt(290-cwidthheight)+300;
            int c1 = rand.nextInt(255);
            int c2 = rand.nextInt(255);
            int c3 = rand.nextInt(255);
            g.setColor(new Color(c1,c2,c3));
            g.drawOval(cx1, cy1, cwidthheight, cwidthheight);
        }

        // Draw 3-D Box
        Polygon triangle = new Polygon ();
        triangle.addPoint(600,350);
        triangle.addPoint(650,400);
        triangle.addPoint(600,400);
        g.setColor(new Color(0,0,255));
        g.fillPolygon(triangle);
        Polygon square1 = new Polygon ();
        square1.addPoint(600,350);
        square1.addPoint(600,400);
        square1.addPoint(550,400);
        square1.addPoint(500,350);
        g.setColor(new Color(255,255,0));
        g.fillPolygon(square1);
        Polygon parallelagram = new Polygon ();
        parallelagram.addPoint(500,350);
        parallelagram.addPoint(550,400);
        parallelagram.addPoint(550,500);
        parallelagram.addPoint(500,450);
        g.setColor(new Color(50,205,50));
        g.fillPolygon(parallelagram);
        Polygon square2 = new Polygon ();
        square2.addPoint(550,400);
        square2.addPoint(650,400);
        square2.addPoint(650,500);
        square2.addPoint(550,500);
        g.setColor(new Color(255,0,0));
        g.fillPolygon(square2);






    }

}



    
 