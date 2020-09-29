package Lucky7;


import java.awt.Color;
import java.awt.Graphics;

public class Dice {

    private int number;
    private Graphics pen;
    private final Color diceColor;

    public Dice(Graphics pen) {
        //this.pen = pen;
        //number = (int) (Math.random() * 6 + 1);
        this(pen, (int) (Math.random()) * 6 + 1);
    }

    public Dice(Graphics pen, int numbr) {
        this.pen = pen;
        this.number = number;
        diceColor = Color.white;
    }

    public int getNumber() {
        return number;
    }

    public void roll() {
        number = (int) (Math.random() * 6 + 1);
    }

    public void draw() {
        //draw dice body
        pen.setColor(diceColor);
        pen.fillRoundRect(25, 25, 100, 100, 20, 20);

        drawdots();
    }

    private void drawdots() {
        if (number == 1) {
            dot4();
        } else if (number == 2) {
            dot1();
            dot7();
        } else if (number == 3) {
            dot1();
            dot4();
            dot7();
        } else if (number == 4) {
            dot1();
            dot2();
            dot6();
            dot7();
        } else if (number == 5) {
            dot1();
            dot2();
            dot4();
            dot6();
            dot7();
        } else if (number == 6) {
            dot1();
            dot2();
            dot3();
            dot5();
            dot6();
            dot7();
        }
    }

    //private helper methods
    public void dot1() {
        pen.setColor(Color.black);
        pen.fillOval(30, 30, 25, 25);
    }

    public void dot2() {
        pen.setColor(Color.black);
        pen.fillOval(30, 60, 25, 25);
    }

    public void dot3() {
        pen.setColor(Color.black);
        pen.fillOval(30, 90, 25, 25);
    }

    public void dot4() {
        pen.setColor(Color.black);
        pen.fillOval(60, 60, 25, 25);
    }

    private void dot5() {
        pen.setColor(Color.black);
        pen.fillOval(30, 60, 25, 25);
    }

    private void dot6() {
        pen.setColor(Color.black);
        pen.fillOval(90, 60, 25, 25);
    }

    private void dot7() {
        pen.setColor(Color.black);
        pen.fillOval(90, 90, 25, 25);
    }

    void setColor(Color newColor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
