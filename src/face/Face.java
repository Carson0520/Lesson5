package face;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class Face {

    private int xPos, yPos, diameter;
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

    private void btnsetActionPerformed(java.awt.event.ActionEvent evt) {
        //enable all four control buttons (these should start out disabled)
        btnmood.setEnabled(true);
        btcolor.setEnabled(true);
        btnmove.setEnabled(true);
        btnresize.setEnabled(true);
        f.erase();
        f = new Face(facePanel.getGraphics(), 50, 50);
        f.draw();
    }

    private void btnsetActionPerformed(java.awt.event.ActionEvent evt) {
        //TODO add your handling code here:
        int newx = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter  New X"));
        int newy = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter  New Y"));
        f.erase();
        f.move(newx, newy);
        f.draw();
    }
}
