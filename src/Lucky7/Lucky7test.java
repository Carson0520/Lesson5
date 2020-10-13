package Lucky7;

import java.util.Arrays;
import java.util.Scanner;

public class Lucky7test {

    public static void main(String[] args) {
        Dice d1, d2;
        Scanner s = new Scanner(System.in);
        d1 = new Dice();
        d2 = new Dice();
        int MoneyHigh = 0;
        int highestRoll = 0;
        int oldmoney = 0;
        int currentRoll = 0;
        System.out.println("How many dollars do you have?  ");
        int money = s.nextInt();
        int roll = 0;

        while (money > 0) {
            d1.roll();
            d2.roll();
            roll++;

            System.out.println("roll: " + roll);
            //calculate
            int total = (d1.getNumber() + d2.getNumber());

            System.out.println("rolled " + total);
                            oldmoney = money;
            if (total == 7) {
 
                money += 4;

                if (oldmoney < money) {
                    //   oldmoney = money;
                    MoneyHigh = money;
                    currentRoll = roll;
                } else if (oldmoney > money) {
                    currentRoll = roll;
                    //do nothing
                } else if (oldmoney == money) {
                    currentRoll = roll;
                }
                System.out.println("you have $" + money + " left");

            } else {

                money -= 1;
                if (oldmoney < money) {

                    currentRoll = roll;
                } else if (oldmoney > money) {
                    MoneyHigh = oldmoney;
                    currentRoll = roll;
                    //do nothing
                } else if (oldmoney == money) {
                    //do nothing
                }
                System.out.println("you have $" + money + " left");

            }

        }
       /* if (money > moneyHigh) {
            currentRoll = roll;
            oldmoney = money;
        } else {

        }*/
        System.out.format("You should've stopped after %d rolls", currentRoll);
        System.out.format("The most amount of money you had was $%d ", oldmoney);

    }

}
