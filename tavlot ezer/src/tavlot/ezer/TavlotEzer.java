/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tavlot.ezer;

import java.util.Scanner;

/**
 *
 * @author כהן יעל
 */
public class TavlotEzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//amud 12 sheela 1
//        int x;
//        int[] t = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31,30,31};
//        System.out.println("enter month number");
//        x=input.nextInt();
//        System.out.println("the number of days is"+t[x-1]);
//amud 12 sheela 2
//        int x;
//        int[] t = new int[]{0, 0, 0, 200, 250, 300, 300, 320};
//        System.out.println("enter number of kids");
//        x = input.nextInt();
//        if(x<4)
//        System.out.println("yuo are not eligible for a stipend");
//        if(x == 4)
//            System.out.println("you stupend is 200 nis");
//        if(x == 5)
//            System.out.println("you stupend is 450 nis");
//        if(x == 6)
//            System.out.println("you stupend is 750 nis");
//        if(x == 7)
//            System.out.println("you stupend is 1050 nis");

//amud 12 sheela 4
        int x, i, times;
        int[] t = new int[]{200, 100, 50, 20, 10, 5, 2, 1};
        System.out.println("enter amount of money");
        x = input.nextInt();
        for (i = 0; i < 8; i++) {
            times = x / t[i];
            x = x - (x * t[i]);
            System.out.println("the amount includes " + times + "times" + t[i] + "nis");
        }
//amud 12 sheela 6
        int w, s, y;
        int[] t2 = new int[10];
        for (int j = 0; j < 10; j++) {
            System.out.println("enter number of page");
            s = input.nextInt();
            System.out.println("enter length of ad");
            y = input.nextInt();
            System.out.println("enter width of ad");
            w = input.nextInt();
        }

//bidud mispar lesifrotav when you dint know how many sfarot are  there - dugma - יש במבחן
        int j = 0, x = 0;
        while (x > 0) {
            x = x / 10;
            j++;
        }

    }

}
