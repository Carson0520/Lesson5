package Lucky7;

import java.util.Random;
import java.util.Scanner;

public class NewMain {

    Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter amount of  dollars");
        int dollars = s.nextInt();
        Dice d1, d2;
        d1 = new Dice();
        d2 = new Dice();
        d1.roll();
        d2.roll();
        int total = d1.getNumber() + d2.getNumber();
        Math.max(d1.getNumber(), d2.getNumber());

        double[] val = new double[dollars];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        System.out.println("Random number array...");
        for (int i = 0; i < val.length; i++) {
            
            val[i] = new Random().nextInt(10);
            if (val[i] == 7) {
                dollars +=4;
            }
            if (val[i] != 7) {
                dollars --;
            }
            System.out.println(val[i]);
        }

        for (int i = 0; i < val.length; i++) {
            if (val[i] < min) {
                min = val[i];
            }
            if (val[i] > max) {
                max = val[i];
            }
        }
        System.out.println("Minimum element = " + min);
        System.out.println("Maximum element = " + max);
        for (int i = 0; i < val.length; i++) {
            if (val[i] == 7) {
                dollars += 4;
            }
            if (val[i] != 7) {
                dollars--;
            }

        }
    }

}
