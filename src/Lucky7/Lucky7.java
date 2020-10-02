package Lucky7;

import java.util.Scanner;

public class Lucky7 {

    public static void main(String[] args) {
        Dice d1, d2;
        Scanner s = new Scanner(System.in);
        d1 = new Dice();
        d2 = new Dice();

        System.out.println("How many dollars do you have?  ");
        int money = s.nextInt();
   int roll=0;
       while(money>0) {
            d1.roll();
            d2.roll();
         
            roll++;

            //calculate
            int total = (d1.getNumber() + d2.getNumber());
             System.out.println("rolled " + total);

            if (total == 7) {
                money += 4;
                System.out.println("you have $" + money + " left");
            } else{
                money -= 1;
                System.out.println("you have $" + money + " left");
            } 
            
        }
    }

}
