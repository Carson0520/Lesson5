package Lucky7;

import java.util.Scanner;

public class Lucky74Real {

    public static void main(String[] args) {
        // TODO code application logic here
        int dollars = 0;
        int lastdollar = 0;

        int rolls = 0;
        int bestroll = 0;
        Dice d1, d2;

        Scanner s = new Scanner(System.in);
        d1 = new Dice();
        d2 = new Dice();

        System.out.println("How many dollars do you have? ");
        dollars = s.nextInt();
        lastdollar = dollars;

        while (dollars != 0) {

            d1.roll();
            d2.roll();
            int total = (d1.getNumber() + d2.getNumber());

            if (total == 7) {
                dollars += 4;
                rolls++;
                /*troubleshoot stuff
                System.out.println("Roll Number: "+rolls);
                System.out.println("Rolled a: "+total);
                System.out.println("Money Left: "+dollars);
                 */
                if (lastdollar < dollars) {
                    lastdollar = dollars;
                    bestroll = rolls;
                }
            } else if (total != 7) {
                dollars--;
                rolls++;
                /*troubleshoot stuff
                System.out.println("Roll Number: "+rolls);
                System.out.println("Rolled a: "+total);
                System.out.println("Money Left: "+dollars);
                 */
            }
            if (dollars == 0) {
                System.out.println("You are broke after " + rolls + " rolls");
                System.out.println("You should have quit after " + bestroll + " rolls when you had $" + lastdollar);
            }
        }
    }
}
