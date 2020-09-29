package face;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class Face {

    private int xPos, yPos,newx,newy, diameter;
    
    private Color color;
    private Graphics g;

    public Face(Graphics g, int x, int y) {
        xPos = x;
        yPos = y;
        //let  the "g" property = the "g" param
        this.g = g;
        //default size and color
        diameter = 100;
        color = Color.red;
    }

    public void draw() {
        drawHead();
        drawEyes();
        drawMouth();
    }

    public void erase() {
        g.setColor(Color.white);
        g.fillRect(xPos - 10, yPos - 10, diameter + 20, diameter + 20);
    }

    private void drawHead() {
        g.setColor(color.red);
        g.fillOval(xPos, xPos, diameter, diameter);
    }

    private void drawEyes() {
        g.setColor(color.yellow);
        g.fillOval(xPos + (int) (.2 * diameter), yPos + (int) (.2 * diameter), (int) (diameter * .25), (int) (diameter * .25));
        g.fillOval(xPos + (int) (.55 * diameter), yPos + (int) (.2 * diameter), (int) (diameter * .25), (int) (diameter * .25));
    }

    private void drawMouth() {
        int mx, my;
        mx = xPos + (int) (.3 * diameter);
        my = xPos + (int) (.8 * diameter);
        g.setColor(color.black);
        g.drawLine(mx, my, mx + (int) (.4 * diameter), my);
    }

    void move(int newx, int newy) {
        newx=xPos;
        newy=yPos;
    }
}
