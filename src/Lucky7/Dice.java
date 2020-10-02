package Lucky7;

import java.awt.Color;
import java.awt.Graphics;

public class Dice {

    private int number;

    public Dice() {
        this.number = 0;
    }

    Dice(Graphics graphics) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumber() {
        return number;
    }

    public void roll() {
        number = (int) (Math.random() * 6 + 1);
    }

}
