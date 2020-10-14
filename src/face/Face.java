package face;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Face {

    private int xpos, ypos, diameter;
    private Color color;
    private Graphics g;
    private boolean ishappy;
    private boolean sad;

    public Face(Graphics g, int x, int y) {
        xpos = x;
        ypos = y;
        this.g = g;
        diameter = 100;
        color = Color.red;
        ishappy = true;

    }
    int mx, my;

    public void draw() {
        drawHead();
        drawEyes();
        drawMouth();
    }

    private void drawHead() {
        g.setColor(color);
        g.fillOval(xpos, ypos, diameter, diameter);
    }

    private void drawEyes() {
        g.setColor(Color.yellow);
        g.fillOval(xpos + (int) (.2 * diameter), ypos + (int) (.2 * diameter), (int) (diameter * 0.25), (int) (diameter * 0.25));
        g.fillOval(xpos + (int) (.55 * diameter), ypos + (int) (.2 * diameter), (int) (diameter * 0.25), (int) (diameter * 0.25));
    }

    private void drawMouth() {
        //  int mx, my;
        mx = xpos + (int) (.3 * diameter);
        my = xpos + (int) (.7 * diameter);
        g.setColor(Color.black);
        g.drawLine(mx, my, mx + (int) (0.4 * diameter), my);
        if (ishappy == true) {
            g.drawLine(mx - 10, my - 10, mx + (int) (0.4 * diameter) - 40, my);
            g.drawLine(mx + 50, my - 10, mx + (int) (0.4 * diameter), my);
        } else {
            g.drawLine(mx - 10, my + 10, mx + (int) (0.4 * diameter) - 40, my);
            g.drawLine(mx + 50, my + 10, mx + (int) (0.4 * diameter), my);
        }
        if (ishappy == false) {
            g.drawLine(mx + 50, my - 10, mx + (int) (0.4 * diameter), my);
            g.drawLine(mx - 10, my - 10, mx + (int) (0.4 * diameter) - 40, my);

        } else {
            g.drawLine(mx + 50, my + 10, mx + (int) (0.4 * diameter), my);
            g.drawLine(mx - 10, my + 10, mx + (int) (0.4 * diameter) - 40, my);

        }
    }

    public void toggleMood() {
        if (ishappy = true) {
            ishappy = false;
        } else if (ishappy = false) {
            ishappy = true;
        }
    }

    public void erase() {
        g.setColor(Color.white);
        g.fillRect(xpos - 10, ypos - 10, diameter + 20, diameter + 20);
    }

    public void move(int newx, int newy) {
        mx = xpos = newx;

        my = ypos = newy;

    }

    public void resize(int newsize) {
        diameter = newsize;
    }

    public void color(Color newcolor) {
        color = newcolor;
    }

}
