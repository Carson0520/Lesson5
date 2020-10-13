package Lucky7;

import java.util.Arrays;
import java.util.Scanner;

public class Lucky7 {

    public static void main(String[] args) {
        Dice d1, d2;
        Scanner s = new Scanner(System.in);
        d1 = new Dice();
        d2 = new Dice();

        System.out.println("How many dollars do you have?  ");
        int money = s.nextInt();
        int roll = 0;
        int newMoneyHigh = 0;
        int MoneyHigh = 0;
        while (money > 0) {
            MoneyHigh = money;  //both 5 //both 9
            int oldMoney = money;
            d1.roll();
            d2.roll();
            roll++;
            System.out.println("roll: " + roll);
            //calculate
            int total = (d1.getNumber() + d2.getNumber());
            System.out.println("rolled " + total);
            if (total == 7) {

                money += 4;  //money=9

                System.out.println("you have $" + money + " left");

            } else {

                money -= 1;     //money=8
                System.out.println("you have $" + money + " left");

            }

            if (MoneyHigh < money) {        //if 5 less than 9(true)        if 9 less than 8(false)
                newMoneyHigh = money;       //new = 9                       skip
                oldMoney = newMoneyHigh;    //new = 9                       skip
            } else if (MoneyHigh > money) {                                      //if 9 greater than 8(true)
                newMoneyHigh = oldMoney;                                      //previously 9 now
            }

        }
        System.out.format("You should've stopped after %d rolls", roll);
        System.out.format("The most amount of money you had was $%d ");

    }

}
