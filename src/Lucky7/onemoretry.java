/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lucky7;

import java.util.Scanner;

/**
 *
 * @author Lazyd
 */
public class onemoretry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dice d1, d2;
        Scanner s = new Scanner(System.in);
        d1 = new Dice();
        d2 = new Dice();
        int rollnum = 1;
        //

        //
        System.out.println("How many dollars so you have? --> ");
        int dollars = s.nextInt();

        while (dollars > 0) {
            //help
            

            int[] maxdollars = new int[dollars];
            int min = (int) Double.MAX_VALUE;
            int max = (int) Double.MIN_VALUE;
 for (int i = 0; i < maxdollars.length; i++) {
                if(maxdollars[i] <min)
                    min=maxdollars[i];
                if(maxdollars[i]>max)
                    max=maxdollars[i];
                
                System.out.println("Minimum money was"+min);
                                System.out.println("most money was"+max);
            }
            System.out.println("Roll number: " + rollnum);
            //
            d1.roll();
            d2.roll();
            rollnum++;

            int total = d1.getNumber() + d2.getNumber();
            //

            //
            if (total == 7) {
                dollars += 4;
                //
                System.out.println("Rolled a " + total);
                System.out.println("You now have " + dollars + " dollars");

            } else if (total != 7) {
                dollars--;
                //
                System.out.println("Rolled a: " + total);
                System.out.println("You now have: " + dollars + " dollars");
                //

            }           

        }
    }

}
