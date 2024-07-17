/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tichnun_dinami;

/**
 *
 * @author PC
 */
public class Tichnun_dinami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //etgarim - sheela 4
        int[] t = new int[]{12, 7, 11, 8, 6, 3, 6, 9, 2, 5};
        int[] t2 = new int[10];
        int sum = 0;
        for (int j = 0; j < t.length; j++) {
            int max = 0;
            for (int i = 0; i < t.length; i++) {
                if (t[i] > max) {
                    max = t[i];
                }
            }
            if (t[j] == max) {
                sum += t[j];
                if (j == 0) {
                    t[j] = 0;
                    t[j + 1] = 0;

                } else if (j == t.length) {
                    t[j] = 0;
                    t[j - 1] = 0;

                } else {
                    t[j] = 0;
                    t[j - 1] = 0;
                    t[j + 1] = 0;
                }

            }
        }
        System.out.println("the maximal sum is " + sum);

    }

}
