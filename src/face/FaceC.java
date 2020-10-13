package face;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class FaceC {

    private int xPos, yPos, diameter;
    private boolean happy;
    private Color color;
    private Graphics g;

    public FaceC(Graphics g, int x, int y) {
        xPos = x;
        yPos = y;
        //start happy
        happy=true;
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
        g.setColor(Color.red);
        g.fillOval(xPos, yPos, diameter, diameter);
    }

    private void drawEyes() {
        g.setColor(Color.yellow);
        g.fillOval(xPos + (int) (.2 * diameter), yPos + (int) (.2 * diameter), (int) (diameter * .25), (int) (diameter * .25));
        g.fillOval(xPos + (int) (.55 * diameter), yPos + (int) (.2 * diameter), (int) (diameter * .25), (int) (diameter * .25));
    }
    public void toggleMood(){
        happy=!happy;
    }
    private void drawMouth() {
        int mx, my;
        mx = xPos + (int)(.3 * diameter);
        my = xPos + (int)(.7 * diameter);
        g.setColor(Color.black);
        g.drawLine(mx, my, mx + (int)(0.4 * diameter), my);
        if(happy == true){
            g.drawLine(mx - 10, my - 10, mx + (int)(0.4 * diameter) - 40, my);
            g.drawLine(mx + 50, my - 10, mx + (int)(0.4 * diameter), my);
        }
        else{
            g.drawLine(mx - 10, my + 10, mx + (int)(0.4 * diameter) - 40, my);
            g.drawLine(mx + 50, my + 10, mx + (int)(0.4 * diameter), my);
        }
    }

    public void move(int newx, int newy) {
        xPos = newx;
        yPos = newy;

    }
}
